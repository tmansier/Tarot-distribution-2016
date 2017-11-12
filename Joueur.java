package Source;

import java.util.ArrayList;

public class Joueur {

	private int numjoueur;
	private ArrayList<Carte> main;
	
	public Joueur(int joueur)
	{
		setNumjoueur(joueur);
		main = new ArrayList<Carte>();
		main.clear();
	}

	public int getNumjoueur() {
		return numjoueur;
	}

	public void setNumjoueur(int numjoueur) {
		this.numjoueur = numjoueur;
	}
	
}
