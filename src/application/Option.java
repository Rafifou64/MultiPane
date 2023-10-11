package application;

public abstract class Option {
	
	private float prix;
	private String libelle;
	
	Option(float prix, String libelle)
	{
		this.prix = prix;
		this.libelle = libelle;
	}
	
	float getPrix()
	{
		return this.prix;
	}
	
	void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

}
