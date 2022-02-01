package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class ExecutiveHomeSceneController {
    @FXML
    private Button branchReportsButton;

    @FXML
    private ImageView branchReportIcon;

    @FXML
    private Button quarterlyReportsButton;

    @FXML
    private Button contactsButton;

    @FXML
    private ImageView quarterlyreportIcon;

    @FXML
    private Button pollsButton;

    @FXML
    private ImageView pollsIcon;

    @FXML
    private Button meetingsButton;

    @FXML
    private ImageView meetingsIcon;

    @FXML
    private Button assignTargetButton;

    @FXML
    private ImageView targetIcon;

    @FXML
    private Button allotBonusButton;

    @FXML
    private ImageView allotBonusIcon;

    @FXML
    private Button budgetButton;

    @FXML
    private ImageView budgetIcon;

    @FXML
    private TitledPane eventsTiltedPane;

    @FXML
    private Button eventsButton;

    @FXML
    private ImageView eventImage;

    @FXML
    private Label eventLabel;

    @FXML
    private Label eventsublabel;

    @FXML
    private Button notificationsButton;

    @FXML
    private Button totalSalesButton;

    @FXML
    private ImageView salesIcon;

    @FXML
    private Button salesTargetButton;

    @FXML
    private ImageView salesTargetIcon;

    @FXML
    private Button performanceButton;

    @FXML
    private ImageView performanceIcon;

    @FXML
    private TitledPane eventsTiltedpane;

    @FXML
    private Button EventsButton;

    @FXML
    private TitledPane projectTiltedPane;

    @FXML
    private Button projectTmButton;

    @FXML
    private ImageView projectTMImage;

    @FXML
    private Label ProjectTMLabel;

    @FXML
    private Button logoutButton;



    @FXML
    void openBranchReports() throws IOException {
        Stage stage = (Stage) branchReportsButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("BranchReportsPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openQuarterlyReports() throws IOException {
        Stage stage = (Stage) quarterlyReportsButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("QuarterlyReportsPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openPollsPage() throws IOException {
        Stage stage = (Stage) pollsButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutivePollsPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openMeetingsPage() throws IOException {
        Stage stage = (Stage) meetingsButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveArrangeMeetingsPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openAssignManagerTaskPage() throws IOException {
        Stage stage = (Stage) assignTargetButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveAssignManagerTaskPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openExecutiveAllotBonusesPage() throws IOException {
        Stage stage = (Stage) allotBonusButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveAllotBonusesPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openExecutiveContactsPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) contactsButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveContactPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

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

}
