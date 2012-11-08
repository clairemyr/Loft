import java.util.LinkedList;
import java.awt.Graphics;


public class Loft implements ObjetDessinable {
	protected LinkedList<Neuneu> population;
	protected LinkedList<Aliment> aliments;
	protected int hauteur;
	protected int largeur;
	protected ZoneGraphique zone;
	
	public Loft(LinkedList<Neuneu> population, LinkedList<Aliment> aliments, int hauteur, int largeur){
		this.population = population;
		this.aliments = aliments;
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
	public Loft(int tailleLoft, ZoneGraphique zone) {
		this.hauteur=tailleLoft;
		this.largeur=tailleLoft;
		this.zone=zone;
	}
	
	// va nous permettre d'optimiser la gestion du déplacement des neuneus en fonction de la taille 
	public double getSurface(){
		return this.largeur*this.hauteur;
	}
	
	public void initialiser(){
		// on ajoute une instance pour chacun des type de neuneu existant.
		// L'objectif est de tester l'affichage, on en mettra plus dans un second temps
		this.population.add(new Vorace ((int)(Math.random()*this.largeur), (int)(Math.random()*this.hauteur), this));
		this.population.add(new Erratique ((int)(Math.random()*this.largeur), (int)(Math.random()*this.hauteur), this));
		this.population.add(new Cannibale ((int)(Math.random()*this.largeur), (int)(Math.random()*this.hauteur), this));
		this.population.add(new Lapin ((int)(Math.random()*this.largeur), (int)(Math.random()*this.hauteur), this));		
		
	}
	
	public LinkedList<Neuneu> getPopulation() {
		return population;
	}
	
	public void go() {
		int nbtour=0;
		int i=0;
		while (population.size()>0 && nbtour<20) {
			System.out.println("Tour : " + nbtour);
			/*
			for (i=0; i < (this.population.size()); i++) {
				this.population.get(i).seDeplacer();
				this.population.get(i).setEnergie(this.population.get(i).getEnergie() - 2);
				this.population.get(i).manger();
				this.population.get(i).dessinerObjet();
			}*/	
			
			
			
			
			nbtour ++;
			}
		}
	
	
	
	@Override
	public void dessinerObjet(Graphics g){
		for (int i = 0 ; i < aliments.size() ; i++) {
			aliments.get(i).dessinerObjet(g);
		}

		for (int i = 0 ; i < population.size() ; i++) {
			population.get(i).dessinerObjet(g);
		}
	}
	
	
	public void add(Neuneu neuneu){
		this.population.add(neuneu);
	}

	
	public void exclureNeuneu(Neuneu neuneu){
		this.population.remove(neuneu);
	}
	
}