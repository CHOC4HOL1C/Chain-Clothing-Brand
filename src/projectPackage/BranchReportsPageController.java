package projectPackage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BranchReportsPageController implements Initializable {


    @FXML
    private Button backToHomeButton;

    @FXML
    private Button generateBarChartButton;

    @FXML
    private ComboBox<String> selectBranchComboBox;

//    @FXML
//    private BarChart<String, Number> branchReportsBarChart;
//
//    @FXML
//    private CategoryAxis xAxis;
//
//    @FXML
//    private NumberAxis yAxis;

    @FXML
    void backToExecutiveHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) backToHomeButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveHomeScene.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void selectBranch(ActionEvent event) {
        //we get the text set in combobox
        String user_type = selectBranchComboBox.getSelectionModel().getSelectedItem().toString();
        //now to set it in a file!!!!!!!!
    }

    //button that'll generate the chart
    @FXML
    //doing the branch report bar chart
    public void generateBarChart(ActionEvent event) throws IOException {
        Stage stage = (Stage) generateBarChartButton.getScene().getWindow();
        stage.close(); //closing scene

        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("ExecutiveGenerateBarChart.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
//        series.getData().add(new XYChart.Data<String,Number>("Quarterly Budget",200000));
//        series.getData().add(new XYChart.Data<String,Number>("Revenue",300000));
//        series.getData().add(new XYChart.Data<String,Number>("Profits",100000));
//        series.setName("Branch Reports");
//        branchReportsBarChart.getData().add(series);
//    }

    //putting options in combobox
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("Banani","Gulshan","Dhanmondi");
        selectBranchComboBox.setItems(list);
    }
}
