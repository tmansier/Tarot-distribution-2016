package Source;

public class Atouts extends Carte{

	public Atouts(int vlr)
	{
		this.valeur =vlr;
	}
	
	@Override
	public String toString()
	{
		return "La valeur de l'Atout est de " + this.valeur;	
	}
	
	
}
