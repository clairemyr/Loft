import java.awt.Color;

public class Erratique extends Neuneu {
	
	public Erratique( int abs, int ord, Loft maison)  {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 800;
		this.energie = 500;
		this.couleur = Color.blue;
	}
	
	public void seDeplacer() {
		this.setPosition((int)(Math.random()*this.maison.largeur), (int)(Math.random()*this.maison.hauteur));
	}
	
	public void manger () {
		
	}
	
}
