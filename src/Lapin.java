import java.awt.Color;

public class Lapin extends Erratique {
	
	public Lapin(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 1000;
		this.energie = 600;
		this.couleur = Color.pink;
	}

	
	public void seDeplacer() {
		
	}
	
}
