package application;

public class Personnalisation extends Option {
	
	private String description;
	private boolean isPresent;
	
	Personnalisation(float prix, String libelle, String description, boolean isPresent)
	{
		super(prix, libelle);
		this.description = description;
		this.isPresent = isPresent;		
	}
}
