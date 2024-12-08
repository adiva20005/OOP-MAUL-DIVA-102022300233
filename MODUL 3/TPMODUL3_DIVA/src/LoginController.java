import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void LoginFunction(ActionEvent event) throws IOException{
        String username = usernameField.getText();
        String password = passwordField.getText();

        Parent homePageParent = FXMLLoader.load(getClass().getResource("data.fxml"));
        Scene homePageScene = new Scene(homePageParent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        if (username.equals("ADMIN") && password.equals("123")) {
            stage.setScene(homePageScene);
            stage.show();
            System.out.println("Masuk");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Salah Username atau Password");
            alert.setContentText("Silahkan cek kembali Username atau Password anda");
            alert.showAndWait();
        }
    }

}
