package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DetailController implements Initializable{
	
	@FXML
	private ChoiceBox tailleBox = new ChoiceBox();
	
	@FXML
	private ChoiceBox couleurBox = new ChoiceBox();
	
	@FXML
	private ChoiceBox marqueBox = new ChoiceBox();
	
	//@FXML
	//private String prix = "Prix :";
	
	@FXML
	private ImageView imgVelo;
	
	@FXML
	private Button btnRetour = new Button();
	
	void initValue(String type)
	{
		//initialisation des tailles
		Taille tailleS = new Taille(50, "S");
		Taille tailleM = new Taille(75, "M");
		Taille tailleL = new Taille(100, "L");
		
		//initialisation de la personnalisation
		Personnalisation personnalisation = new Personnalisation(100, "Personnalisation", "", false);
		
		//initialisation des marques
		Marque marquePeugeot = new Marque(150, "Peugeot", "");
		Marque marqueBtwin = new Marque(200, "Btwin", "");
		
		if(type == "route")
		{
			//initialisation des couleurs
			Couleur rougeRoute = new Couleur(100, "Rouge", "./photo/veloRouteRouge.jpg", "");
			Couleur vertRoute = new Couleur(110, "Vert", "./photo/veloRouteVert.jpg", "");
			Couleur bleuRoute = new Couleur(130, "Bleu", "./photo/veloRouteBleu.jpg", "");
			
			ArrayList<Option> lstOptionDefautVeloRoute = new ArrayList<Option>();
			
			lstOptionDefautVeloRoute.add(tailleM);
			lstOptionDefautVeloRoute.add(rougeRoute);
			lstOptionDefautVeloRoute.add(marquePeugeot);
			
			Velo veloRoute = new Velo("route", 300, lstOptionDefautVeloRoute);

			System.out.println("url "+ veloRoute.getURLPhoto());
			File file = new File(veloRoute.getURLPhoto());
			System.out.println("file "+ file);
			Image newImage = new Image(file.toURI().toString());
	        System.out.println("newImage "+ newImage);
	        imgVelo = new ImageView();
	        imgVelo.setImage(newImage);
		}
		else 
		{
			//initialisation des couleurs
			Couleur rougeVille = new Couleur(100, "Rouge", "./photo/veloVilleRouge.jpg", "");
			Couleur vertVille = new Couleur(120, "Vert", "./photo/veloVilleVert.jpg", "");
			Couleur bleuVille = new Couleur(90, "Bleu", "./photo/veloVilleBleu.jpg", "");
			
			ArrayList<Option> lstOptionDefautVeloVille = new ArrayList<Option>();
			
			lstOptionDefautVeloVille.add(tailleM);
			lstOptionDefautVeloVille.add(bleuVille);
			lstOptionDefautVeloVille.add(marqueBtwin);
			
			Velo veloVille = new Velo("ville", 200, lstOptionDefautVeloVille);
			
			System.out.println("url "+ veloVille.getURLPhoto());
			File file = new File(veloVille.getURLPhoto());
			System.out.println("file "+ file);
			Image newImage = new Image(file.toURI().toString());
	        System.out.println("newImage "+ newImage);
	        imgVelo = new ImageView();
	        imgVelo.setImage(newImage);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		tailleBox.getItems().addAll("S", "M", "L");
		couleurBox.getItems().addAll("Rouge", "Vert", "Bleu");
		marqueBox.getItems().addAll("Peugeot", "Btwin");
	}
	
	public void changePageIndex(MouseEvent e) throws IOException
	{
		Parent indexFXML = FXMLLoader.load(getClass().getResource("index.fxml"));
		Scene sceneIndexFXML = new Scene(indexFXML);
		
		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		
		stage.setScene(sceneIndexFXML);

		stage.show();
	}
}
