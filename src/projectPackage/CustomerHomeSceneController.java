package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerHomeSceneController {

    @FXML
    private Button trackOrderButton;

    @FXML
    private Button contactUsButton;

    @FXML
    private Button editCustomerInfoButton;

    @FXML
    private Button getPremiumButton;

    @FXML
    private Button notificationsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button prodOneButton;

    @FXML
    private Button productTwoButton;

    @FXML
    private Button prodThreeButton;

    @FXML
    private Button prodFourButton;

    @FXML
    private Button prodFiveButton;

    @FXML
    private Button prodSixButton;

    @FXML
    private Button cartButton;

    @FXML
    void logoutToLoginScene(ActionEvent event) throws IOException {
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
    void openCustomerContactUsPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) contactUsButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerContactUsPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openCustomerEditInfo(ActionEvent event) throws IOException {
        Stage stage = (Stage) editCustomerInfoButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerEditInfo.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openCustomerGetPremiumPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) getPremiumButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerGetPremiumPage.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openCustomerOrderCart(ActionEvent event) throws IOException {
        Stage stage = (Stage) cartButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerOrderCart.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void openCustomerTrackOrder(ActionEvent event) throws IOException {
        Stage stage = (Stage) trackOrderButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("CustomerTrackOrder.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
