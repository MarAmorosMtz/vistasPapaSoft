import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {
    @FXML
    private StackPane Display;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Button clickedButton = (Button) event.getSource();

        String fxml = getViewForButton(clickedButton);
        if (fxml != null) {
            loadView(fxml);
        }
    }

    private String getViewForButton(Button button) {
        switch (button.getText()) {
            case "Maestros":
                return "/fxml/Maestro/fmxlMaestros";
            case "Materias":
                return "/fxml/Materia/fmxlMateria";
            case "Asesores":
                return "/fxml/Asesor/fmxlAsesor";
            case "Asesorados":
                return "/fxml/Asesorado/fmxlAsesorado";
            case "Reportes":
                return "";
            case "Asesorias":
                return "/fxml/Asesoria/fmxlAsesoria";
            default:
                return null;
        }
    }


    private void loadView(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml + ".fxml"));
        Parent view = loader.load();

        Display.getChildren().clear();

        Display.getChildren().add(view);
    }
}
