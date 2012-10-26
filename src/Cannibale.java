
public class Cannibale extends Vorace {

	public Cannibale(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 700;
		this.energie = 400;
	}
	
	public void manger(Neuneu proie) {
		this.setEnergie(this.getEnergie()+proie.getEnergie());
	}

	public void manger(Aliment proie) {
		this.setEnergie(this.getEnergie()+proie.getEnergie());
	}
	
	public Object getProie() {
		int i;
		for (i=0; i < (maison.getPopulation().size()); i++) {
		}
	}
	
	public void afficher() {
		
	}
}
