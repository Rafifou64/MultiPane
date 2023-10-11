package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent rootFXML = FXMLLoader.load(getClass().getResource("index.fxml"));
			Scene sceneFXML = new Scene(rootFXML);
			
			primaryStage.setTitle("Multi-Pane");
			
			primaryStage.setScene(sceneFXML);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
