package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerHomeSceneController {

    @FXML
    private Button assignTaskButton;

    @FXML
    private Button checkStockButton;

    @FXML
    private Button employeeManagementButton;

    @FXML
    private Button weeklySalesReportButton;

    @FXML
    private Button approveSalariesButton;

    @FXML
    private Button contactsButton;

    @FXML
    private Button notificationButton;

    @FXML
    private Button totalSalesButton;

    @FXML
    private Button salesTargetButton;

    @FXML
    private Button performanceButton;

    @FXML
    private TitledPane eventsTiltedPane;

    @FXML
    private Label branchName;

    @FXML
    private Button logoutButton;

    @FXML
    private ProgressIndicator taskOneProgressIndicator;

    @FXML
    private ProgressIndicator taskTwoProgressIndicator;

    @FXML
    private TitledPane projectTiltedPane;

    @FXML
    private Button projectTmButton;

    @FXML
    private Label ProjectTMLabel;

    @FXML
    void logout() throws IOException {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("LoginScene.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openManagerAssignEmployeeTaskPage() throws IOException {
        Stage stage = (Stage) assignTaskButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerAssignEmployeeTaskPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openCheckStockPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) assignTaskButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerCheckStockPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @FXML
    void openManagerEmployeeManagementPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) employeeManagementButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerEmployeeManagementPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openManagerWeeklySalesReportPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) weeklySalesReportButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerWeeklySalesReportPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openApproveSalaries(ActionEvent event) throws IOException {
        Stage stage = (Stage) approveSalariesButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ManagerApproveSalariesPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
