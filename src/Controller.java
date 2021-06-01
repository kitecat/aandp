import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button enterButton;

    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    @FXML
    private void enterButtonClick(ActionEvent actionEvent) {
        if (loginTextField.getText().equals("admin") && passwordField.getText().equals("pass")) {
            statusLabel.setText("Hello Admin!");
        } else {
            statusLabel.setText("Ошибка авторизации!");
        }
    }
}