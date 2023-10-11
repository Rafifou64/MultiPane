package application;

public class Marque extends Option {

	
	private String lienPhotoLogo;
	
	Marque(float prix, String libelle, String lienPhotoLogo)
	{
		super(prix, libelle);
		this.lienPhotoLogo = lienPhotoLogo;	
	}
}
