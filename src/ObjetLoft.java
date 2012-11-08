import java.awt.Graphics; 
import java.awt.Color;

public class ObjetLoft implements ObjetDessinable {	protected int abs;
	protected int ord;
	protected Color couleur;
	protected Loft maison;
	
	public double getDistance(ObjetLoft objet){
		double dist = 0;
		dist = Math.sqrt(
				( this.abs - objet.getAbs() ) * ( this.abs - objet.getAbs() ) +
				( this.ord - objet.getOrd() ) * ( this.ord - objet.getOrd() ) ) ;
		return dist;
	}
	
	public ObjetLoft getProieNeuneu() {
	// retourne le plus proche Neuneu
		int i;
		int k = 0;
		double tmpdist;
		double dist = maison.getSurface();
		//on cherche le neuneu le plus proche et on stocke sa position sur le plateau et dans la liste
		for (i=0; i < (this.maison.population.size()); i++) {
			tmpdist = this.getDistance(maison.population.get(i));
			if (tmpdist<dist){
				dist=tmpdist;
				k=i;
			}
			else{
			}
		}
		return maison.population.get(k);
	}
	
	public ObjetLoft getProieAliment() {
		// retourne le plus proche Aliment
		int i;
		int k=0;
		double tmpdist;
		double dist = maison.getSurface();
		//on cherche l'aliment le plus proche et on stocke sa position sur le plateau et dans la liste
		for (i=0; i < (this.maison.aliments.size()); i++) {
			tmpdist = this.getDistance(maison.aliments.get(i));
			if (tmpdist<dist){
				dist=tmpdist;
				k=i;
			}
			else{
			}
		}
		return maison.aliments.get(k);
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
