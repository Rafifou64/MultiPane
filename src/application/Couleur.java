package application;

public class Couleur extends Option{

	private String lienPhoto;
	private String couleurRGB;
	
	Couleur(float prix, String libelle, String lienPhoto, String couleurRGB)
	{
		super(prix, libelle);
		this.lienPhoto = lienPhoto;
		this.couleurRGB = couleurRGB;		
	}
}
