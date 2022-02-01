package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeSalesPageController {

    @FXML
    private Button backToHome;

    @FXML
    private TextField customerIDTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField productCodetextField;

    @FXML
    private TextField qtyTextField;

    @FXML
    private Button checkoutButton;

    @FXML
    private Label totalPriceLabel;

    @FXML
    void backToEmployeeHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToHome.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
