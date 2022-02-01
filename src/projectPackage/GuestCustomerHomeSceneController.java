package projectPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestCustomerHomeSceneController {

    @FXML
    private Button contactUsButton;

    @FXML
    private Button getPremiumButton;

    @FXML
    private Button customerLogoutButton;

    @FXML
    private TabPane productsTabPane;

    @FXML
    private Tab mensCollectionTab;

    @FXML
    private ScrollPane productScrollPane;

    @FXML
    private Button productOnebutton;

    @FXML
    private Pane productOnePane;

    @FXML
    private Label productOneNameLabel;

    @FXML
    private Label productOnePriceLabel;

    @FXML
    private Button productTwoButton;

    @FXML
    private Pane productTwoPane;

    @FXML
    private Label productTwoNameLabel;

    @FXML
    private Label productTwoPriceLabel;

    @FXML
    private Button productFourButton;

    @FXML
    private Pane productFourPane;

    @FXML
    private Label productFourNameLabel;

    @FXML
    private Label productFourPriceLabel;

    @FXML
    private Button productFiveButton;

    @FXML
    private Pane productFivePane;

    @FXML
    private Label productFiveNameLabel;

    @FXML
    private Label productFivePriceLabel;

    @FXML
    private Button productSixButton;

    @FXML
    private Pane productSixPane;

    @FXML
    private Label productSixNameLabel;

    @FXML
    private Label productSixPriceLabel;

    @FXML
    private Button productThreeButton;

    @FXML
    private Pane productThreePane;

    @FXML
    private Label productThreeNameLabel;

    @FXML
    private Label productThreePriceLabel;

    @FXML
    private Tab womensCollectionTab;

    @FXML
    private Button signUpButton;

    @FXML
    void guestCustomerSignUp(ActionEvent event) throws IOException {
        Stage stage = (Stage) signUpButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateNewUser.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void logoutToLoginScene(ActionEvent event) throws IOException {
        Stage stage = (Stage) customerLogoutButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
