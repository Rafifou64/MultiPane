package application;

import java.util.ArrayList;

public class Velo {
	
	private String typeVelo;
	private float prixBase;
	private ArrayList<Option> lstOption;
	
	Velo(String typeVelo, float prixBase, ArrayList<Option> lstOption)
	{
		this.typeVelo = typeVelo;
		this.prixBase = prixBase;
		this.lstOption = lstOption;
	}
	
	float getTotalPrix()
	{
		float prixRes = 0;
		
		prixRes += this.prixBase;
		
		for (int i = 0; i < this.lstOption.size(); i++) {
			prixRes += this.lstOption.get(i).getPrix();
		}

		return prixRes;
	}
	
	String getURLPhoto()
	{
		String lienPhoto = null;
		for (Option option: this.lstOption)
		{
			if(option instanceof Couleur)
			{
				lienPhoto = ((Couleur) option).getLienPhoto();
				System.out.println("getURLPhoto "+lienPhoto);
			}
		}
		System.out.println("getURLPhoto "+lienPhoto);		
		return lienPhoto;
	}
}
