import java.awt.Color;

public class Lapin extends Erratique {
	
	public Lapin(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 1000;
		this.energie = 600;
		this.couleur = Color.pink;
	}

	
	public void seDeplacer() {
		// appeler la fonction setPosition suivant les besoins : aliments ou neuneu si assez d'énergie
		int newabs=0; int neword=0;
		//si le neuneu manque d'energie, il mange
		if (this.energie < 300 ){
			ObjetLoft Aliment = this.getProieAliment();
			newabs = Aliment.getAbs();
			neword = Aliment.getOrd();	
		}
		// sinon il cherche à se reproduire
		else {
			ObjetLoft Neuneu = this.getProieNeuneu();
			newabs = Neuneu.getAbs();
			neword = Neuneu.getOrd();
		}
		this.setPosition(newabs, neword);
	}

	
}
