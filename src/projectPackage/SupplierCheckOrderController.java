package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierCheckOrderController {

    @FXML
    private Button backToHomeButton;

    @FXML
    private TableView<?> todaysIncomingOrdersTableView;

    @FXML
    private Button confirmOrdersButton;

    @FXML
    void backToSupplierHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToHomeButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SupplierHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,800,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
