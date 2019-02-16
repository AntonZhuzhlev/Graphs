package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		NumberAxis x = new NumberAxis();
		NumberAxis y = new NumberAxis();
		LineChart<Number,Number> line = new LineChart<Number,Number>(x,y);	
		ObservableList<XYChart.Data> datas = FXCollections.observableArrayList();		
		double i = 0.01;
		while (i < 20) {
			datas.add(new XYChart.Data(i, 1/i));
			i = i + 0.01;
		}
		XYChart.Series series_ = new XYChart.Series();
		series_.setData(datas);	
		Scene scene = new Scene(line,600,600);
		line.getData().add(series_);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}