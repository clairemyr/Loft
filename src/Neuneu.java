import java.awt.Graphics;
import java.awt.Color;


public class Neuneu extends ObjetLoft {
	protected int besoinsEnergetiques;
	protected int energie;
	protected int abs;
	protected int ord;
	protected Loft maison;
	protected Color couleur;
	
	
	public Neuneu( int besoinsE, int energie, int abs, int ord, Loft maison)
	{
		this.besoinsEnergetiques = besoinsE;
		this.energie = energie;
		this.abs = abs;
		this.ord = ord;
		this.maison = maison;		
	}
	
	public Neuneu(int abs, int ord, Loft maison)
	{
		this.abs = abs;
		this.ord = ord;
		this.maison = maison;		
	}

	
	public void setPosition (int abs, int ord){
		this.abs = abs;
		this.ord = ord;
	}
	
	
	public void seReproduire(Neuneu partenaire, Loft maison) {
		partenaire.setEnergie((int)(partenaire.getEnergie()-partenaire.getBesoinsEnergetiques()*0.5));
		this.setEnergie((int)(this.energie-this.besoinsEnergetiques*0.5));
		// on cree un nombre aleatoire entre 1 et 4  
		int nombre = (int)(1 + Math.random()*3);
		if (nombre==1){
			this.maison.population.add(new Vorace(this.abs, this.ord, this.maison));
		}
		if (nombre==2){
			this.maison.population.add(new Erratique(this.abs, this.ord, this.maison));
		}		
		if (nombre==3){
			this.maison.population.add(new Cannibale(this.abs, this.ord, this.maison));
		}
		else{
			this.maison.population.add(new Lapin(this.abs, this.ord, this.maison));
		}
	}
	
	public boolean estReproductible() {
		if (this.energie>0.5*this.besoinsEnergetiques) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getBesoinsEnergetiques() {
		return this.besoinsEnergetiques;
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public void setEnergie(int nrj) {
		this.energie=nrj;
	}
	
	@Override
	public void dessinerObjet(Graphics g) {
		g.setColor(couleur);
		g.fillOval((int)this.getAbs()*20, (int) this.getOrd()*20, 20, 20);
	}
	
}

