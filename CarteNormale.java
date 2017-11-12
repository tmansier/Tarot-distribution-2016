package Source;

public class CarteNormale extends Carte {

	public int couleur;
	public CarteNormale(int clr , int vlr)
	{
		this.valeur = vlr;
		this.couleur = clr;
		//this.image = null // rajouter une image 
	}
	
	@Override
	public String toString()
	{
		return "La valeur de la carte est de " + this.valeur + " et sa couleur est " + this.couleur;	
	}
	
}
