
import java.awt.Color;

public class Cannibale extends Vorace {

	public Cannibale(int abs, int ord, Loft maison) {
		super(abs, ord, maison);
		this.besoinsEnergetiques = 700;
		this.energie = 400;
		this.couleur = Color.red;
	}
	
	public void manger(Neuneu proie) {
		this.setEnergie(this.getEnergie()+proie.getEnergie());
		// on pourrait aussi envisager d'annuler l'énergie du neuneu à ce moment là
	}

	public void manger(Aliment proie) {
		this.setEnergie(this.getEnergie()+proie.getEnergie());
	}
	
	public void seDeplacer(){
		double distaliment, distneuneu;
		int newabs, neword;
		// si l'énergie est trop basse, le cannibale cherche la proie (neuneu ou aliment) la plus proche 
		// pour se déplacer vers elle
		if (this.energie < 450 ){
			ObjetLoft Aliment = this.getProieAliment();
			ObjetLoft Neuneu = this.getProieNeuneu();
			distaliment = Aliment.getDistance(this);
			distneuneu = Neuneu.getDistance(this);
				if (distaliment<distneuneu){
					newabs = Aliment.getAbs();
					neword = Aliment.getOrd();
				}
				else{
					newabs = Neuneu.getAbs();
					neword = Neuneu.getOrd();
				}
				this.setPosition(newabs, neword);
		}
		else {
		}
	}
	
}