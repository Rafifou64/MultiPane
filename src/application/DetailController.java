package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;

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
	private ImageView imgVelo = new ImageView();
	
	static void initValue()
	{
		//initialisation des tailles
		Taille tailleS = new Taille(50, "S");
		Taille tailleM = new Taille(75, "M");
		Taille tailleL = new Taille(100, "L");
		
		ArrayList<Option> lstOptionCouleur = new ArrayList<Option>();
		lstOptionCouleur.add(tailleS);
		lstOptionCouleur.add(tailleM);
		lstOptionCouleur.add(tailleL);
		
		//initialisation des couleurs
		Couleur rougeVille = new Couleur(100, "Rouge", "", "./photo/veloVilleRouge.jpg");
		Couleur vertVille = new Couleur(120, "Vert", "", "./photo/veloVilleVert.jpg");
		Couleur bleuVille = new Couleur(90, "Bleu", "", "./photo/veloVilleBleu.jpg");
		
		Couleur rougeRoute = new Couleur(100, "Rouge", "", "./photo/veloRouteRouge.jpg");
		Couleur vertRoute = new Couleur(110, "Vert", "", "./photo/veloRouteVert.jpg");
		Couleur bleuRoute = new Couleur(130, "Bleu", "", "./photo/veloRouteBleu.jpg");
		
		//initialisation de la personnalisation
		Personnalisation personnalisation = new Personnalisation(100, "Personnalisation", "", false);
		
		//initialisation des marques
		Marque marquePeugeot = new Marque(150, "Peugeot", "");
		Marque marqueBtwin = new Marque(200, "Btwin", "");
		
		ArrayList<Option> lstOptionDefautVeloRoute = new ArrayList<Option>();
		
		lstOptionDefautVeloRoute.add(tailleM);
		lstOptionDefautVeloRoute.add(rougeRoute);
		lstOptionDefautVeloRoute.add(marquePeugeot);
		
		Velo veloRoute = new Velo("route", 300, lstOptionDefautVeloRoute);
		
		ArrayList<Option> lstOptionDefautVeloVille = new ArrayList<Option>();
		
		lstOptionDefautVeloRoute.add(tailleM);
		lstOptionDefautVeloRoute.add(bleuVille);
		lstOptionDefautVeloRoute.add(marqueBtwin);
		
		Velo veloVille = new Velo("ville", 200, lstOptionDefautVeloVille);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		tailleBox.getItems().addAll("S", "M", "L");
		couleurBox.getItems().addAll("Rouge", "Vert", "Bleu");
		marqueBox.getItems().addAll("Peugeot", "Btwin");
	}
}
