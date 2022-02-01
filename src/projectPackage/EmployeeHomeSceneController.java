package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeHomeSceneController {

    @FXML
    private Button salesSheetButton;

    @FXML
    private Button checkEmployeeInfoButton;

    @FXML
    private Button applyForLeaveButton;

    @FXML
    private Button checkStockButton;

    @FXML
    private Button writeAComplaintButton;

    @FXML
    private Button notificationButton;

    @FXML
    private Button salesListButton;

    @FXML
    private Button attendanceButton;

    @FXML
    private Button taskCompletionRateButton;

    @FXML
    private Button logoutButton;

    @FXML
    void logout(ActionEvent event) throws IOException {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openEmployeeApplyLeavePage(ActionEvent event) throws IOException {
        Stage stage = (Stage) applyForLeaveButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeApplyLeavePage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openEmployeeEditInfo(ActionEvent event) throws IOException {
        Stage stage = (Stage) checkEmployeeInfoButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeEditInfo.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openSalesSheet(ActionEvent event) throws IOException {
        Stage stage = (Stage) salesSheetButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeSalesPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openEmployeeSalesSheet(ActionEvent event) throws IOException {
        Stage stage = (Stage) salesListButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("EmployeeSalesSheet.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
