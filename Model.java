package Source;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class Model extends Observable {
	
	// Jeu pour distribution 
	private ArrayList<Carte> Jeu;
	// Main pour chaque joueur 
	private ArrayList<Carte> Main1;
	private ArrayList<Carte> Main2;
	private ArrayList<Carte> Main3;
	private ArrayList<Carte> Main4;
	
	private ArrayList<Carte> Chien;
	
	// Num joueur 
	private int joueur;
	
	final static int MAXCARTE = 78;
	final static int roi = 5;
	final static int carte121excuse = 5;
	final static int dame = 4;
	final static int valet = 2;
	final static int cavalier = 3;
	final static int par2cartes = 1;
	final static int nbjoueurs = 4;
	final static int cartesparjoueurspartour = 3 ;
	final static int chien = 6;

	
	public Model()
	{
		Jeu = new ArrayList<Carte>();
		
		Main1 = new ArrayList<Carte>();
		
		Main2 = new ArrayList<Carte>();
		Main3 = new ArrayList<Carte>();
		Main4 = new ArrayList<Carte>();
		
		CreerJeuTarot(); 
		Afficherjeu();
		System.out.println(getnbcarte(Jeu));

		
	}
	
	public ArrayList<Carte> GetJeu()
	{
		return Jeu;
		
	}
	public ArrayList<Carte> GetMain1()
	{
		return Main1;
		
	}
	public ArrayList<Carte> GetMain2()
	{
		return Main2;
		
	}
	public ArrayList<Carte> GetMain3()
	{
		return Main3;
		
	}
	public ArrayList<Carte> GetMain4()
	{
		return Main4;
		
	}
	public ArrayList<Carte> GetChien()
	{
		return Chien;
		
	}
	
	
	public void CreerJeuTarot()
	{
		for (int i= 1; i < 5 ; i++)
		{
			for (int j=1 ; j < 14 + 1 ; j++)
			{
				CarteNormale c = new CarteNormale (i,j);
				Jeu.add(c);
			}
		}
		
		for (int v = 0 ; v < 22 ; v ++)
		{
			 Atouts a = new Atouts(v);
			 Jeu.add(a);
			 
		}
		Jeu = melanger(Jeu);  
	}
	
	
	public void Afficherjeu()
	{
		for (Carte cn : Jeu)
		{
			System.out.println(cn.toString());
		}
	}
	
	
	public void AfficherMainouJeu(ArrayList<Carte> ac)
	{
		for (Carte cn : ac)
		{
			System.out.println(cn.toString());
		}
	}
	
	public int getnbcarte(ArrayList<Carte> ac)
	{
		return ac.size();
	}
	
	public ArrayList<Carte> melanger( ArrayList<Carte> Jeuamelanger)
	{
		ArrayList<Carte> nouvelle = new ArrayList<Carte>(Jeuamelanger);
		Collections.shuffle(nouvelle);
		return nouvelle;
	}
	
	public void donner3carte(ArrayList<Carte> main)
	{
		
		for(int i = 0 ; i < cartesparjoueurspartour ; i++ )
		{
			Carte c = Jeu.get(i);
			main.add(c);
			Jeu.remove(i);
		}
	}
	
	public void distribuer()
	{
		
	}
	
	
	
	
	
}
