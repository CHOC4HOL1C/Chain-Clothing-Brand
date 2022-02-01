package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerEmployeeManagementPageController {

    @FXML
    private Button backToHomeButton;

    @FXML
    private Button checkApplicationsListButton;

    @FXML
    private Button checkComplaintsListButton;

    @FXML
    void backToManagerHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToHomeButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ManagerHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,800,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openManagerCheckApplicationsList(ActionEvent event) throws IOException {
        Stage stage = (Stage) checkApplicationsListButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerCheckApplicationsList.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @FXML
    void openManagerCheckComplaintsList(ActionEvent event) throws IOException {
        Stage stage = (Stage) checkComplaintsListButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerCheckComplaintsList.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
