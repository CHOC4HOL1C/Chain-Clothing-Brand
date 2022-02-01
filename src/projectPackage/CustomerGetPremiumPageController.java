package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerGetPremiumPageController {

    @FXML
    private Button backToHomeButton;

    @FXML
    private Button signUpForPremiumButton;

    @FXML
    void backToCustomerHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToHomeButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
