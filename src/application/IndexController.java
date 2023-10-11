package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class IndexController {
	
	@FXML
	private ImageView imgRoute;
	
	@FXML
	private ImageView imgVille;
	
	public void changePageRoute(MouseEvent e) throws IOException
	{
		Parent routeFXML = FXMLLoader.load(getClass().getResource("route.fxml"));
		Scene sceneRouteFXML = new Scene(routeFXML);
		
		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		
		stage.setScene(sceneRouteFXML);

		stage.show();
	}
	
	public void changePageVille()
	{
		
	}

}
