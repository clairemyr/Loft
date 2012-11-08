import java.awt.Graphics; 
import java.awt.Color;

public class ObjetLoft implements ObjetDessinable {	protected int abs;
	protected int ord;
	protected Color couleur;
	
	public double getDistance(ObjetLoft objet){
		double dist = 0;
		dist = Math.sqrt(
				( this.abs - objet.getAbs() ) * ( this.abs - objet.getAbs() ) +
				( this.ord - objet.getOrd() ) * ( this.ord - objet.getOrd() ) ) ;
		return dist;
	}
	
	public ObjetLoft getProieNeuneu() {
	// retourne le plus proche Neuneu	
	}
	
	public ObjetLoft getProieAliment() {
	// retourne le plus proche Aliment
	}
	
	public int getAbs() {
		return abs;
	}
	
	public int getOrd() {
		return ord;
	}
	
	@Override
	public void dessinerObjet(Graphics g) {
		g.setColor(couleur);
		// ..
	}

}
