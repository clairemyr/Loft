import java.awt.Color;

public class Nourriture extends Aliment {

	public void afficher() {
		
	}
	
	public Nourriture(int nrj, int abs, int ord) {
		super(nrj, abs, ord);
		this.couleur = Color.yellow;
	}
}
