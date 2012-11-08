import java.awt.Color;

public class Vorace extends Erratique {
	
	public Vorace(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 1000;
		this.energie = 600;
		this.couleur = Color.orange;
	}
	
	public void seDeplacer() {
		// il cherche de la nourriture quand il n'a plus assez d'énergie 
		//sinon les aliments disparaissent trop vite
		if (this.energie < 450 ){
			ObjetLoft Aliment = this.getProieAliment();
			this.setPosition (Aliment.getAbs(), Aliment.getOrd());	
		}
		else {
		}
		
	}
	
	public void manger() {
		
	}
	
}
