
public class Vorace extends Erratique {
	
	public Vorace(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 1000;
		this.energie = 600;
	}
	
	public void manger() {
		
	}
	
	public void seDeplacer() {
		
	}
	
	public Object getProie() {
		for (int i=0; i<(this.maison.aliments.size()); i=i+1 ) {
		}
	}
	
	public void afficher() {
		
	}
}
