import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        System.out.println("handle Login Event");

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main/fmxlMain.fxml"));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));


        stage.show();
    }
}
