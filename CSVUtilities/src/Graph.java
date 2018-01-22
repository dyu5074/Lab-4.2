import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
//made by Derek Yu
//Lab 4.2
public class Graph extends Application {
 
    final static String year1 = "1986";
    final static String year2 = "1996";
    final static String year3 = "2006";
    final static String year4 = "2016";
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    final StackedBarChart<String, Number> sbc =
            new StackedBarChart<String, Number>(xAxis, yAxis);
    final XYChart.Series<String, Number> metric =
            new XYChart.Series<String, Number>();
 
    @Override
    public void start(Stage stage) {
        stage.setTitle("NYC WATER CONSUMPTION");
        
        sbc.setTitle("NYC WATER CONSUMPTION");
        xAxis.setLabel("Year");
        xAxis.setCategories(FXCollections.<String>observableArrayList( Arrays.asList(year1, year2, year3, year4)));
        
        yAxis.setLabel("Water Consumption(million gallons per day)");
        
        metric.setName("Water Consumption Over The past 30 Years");
        metric.getData().add(new XYChart.Data<String, Number>(year1, 1351));
        metric.getData().add(new XYChart.Data<String, Number>(year2, 1298));
        metric.getData().add(new XYChart.Data<String, Number>(year3, 1069));
        metric.getData().add(new XYChart.Data<String, Number>(year4, 1002));
        
        Scene scene = new Scene(sbc, 750, 750);
        sbc.getData().addAll(metric);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}