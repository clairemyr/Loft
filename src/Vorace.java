import java.awt.Color;

public class Vorace extends Erratique {
	
	public Vorace(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 1000;
		this.energie = 600;
		this.couleur = Color.orange;
	}
	
	public void manger() {
		
	}
	
	public void seDeplacer() {
		
	}
	
}
