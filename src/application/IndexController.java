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
		FXMLLoader loader = new FXMLLoader(
		    getClass().getResource(
		      "route.fxml"
		    )
		  );
		
		Parent routeFXML = loader.load();
		Scene sceneRouteFXML = new Scene(routeFXML);
		
		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		
		stage.setScene(sceneRouteFXML);
		
		DetailController detailController = loader.getController();
		
		detailController.initValue("route");

		stage.show();
	}
	
	public void changePageVille(MouseEvent e) throws IOException
	{
		FXMLLoader loader = new FXMLLoader(
			    getClass().getResource(
			      "route.fxml"
			    )
			  );
			
			Parent routeFXML = loader.load();
			Scene sceneRouteFXML = new Scene(routeFXML);
			
			Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			
			stage.setScene(sceneRouteFXML);
			
			DetailController detailController = loader.getController();
			
			detailController.initValue("ville");

			stage.show();
	}

}
