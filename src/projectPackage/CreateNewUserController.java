package projectPackage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;

public class CreateNewUserController implements Initializable {

    @FXML
    private Button CreateNewAccountButton;

    @FXML
    private Label wrongLogin;

    @FXML
    private Button guestLoginButton;

    @FXML
    private Button backToLoginPageButton;

    @FXML
    private ComboBox<String> selectUserTypeCombobox;

    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField newPasswordTextField;

    @FXML
    private PasswordField confirmPasswordTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField emailAddressTextField;

    @FXML
    void createNewAccount(ActionEvent event) {
        //write new user data on file User-Login-Info.txt
        String name = userNameTextField.getText();
        String user_type = selectUserTypeCombobox.getSelectionModel().getSelectedItem().toString();
        String password = newPasswordTextField.getText();
        String phone = phoneNumberTextField.getText();
        String email = emailAddressTextField.getText();

        File f = null;
        FileWriter fw = null;
        String str = "";
        str = "{" + str + name + "," + str + user_type + "," + str + password + "," + str + phone + "," + str + email + "}";
        try {
            Files.write(Paths.get("/Users/zannatchowdhury/F Drive (Work)/IUB/Coding/ChainClothingBrand_FXML/src/projectPackage/User-Login-Info.txt"), str.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }


    @FXML
    void selectUserType(ActionEvent event) throws IOException {

    }

    @FXML
    void guestLogin(ActionEvent event) throws IOException {
        Stage stage = (Stage) guestLoginButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GuestCustomerHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,800,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void backToLoginPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToLoginPageButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScene.fxml"));

        Parent root = loader.load();
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("Executive","Manager","Customer","Supplier","Employee");
        selectUserTypeCombobox.setItems(list);
    }
}
