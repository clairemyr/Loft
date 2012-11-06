import java.awt.Graphics;
import java.awt.Color;

public class Aliment implements ObjetDessinable {
	protected int energie;
	protected int abs;
	protected int ord;
	protected Color couleur;
	
	public Aliment(int energie, int abs, int ord) {
		this.energie = energie;
		this.abs = abs;
		this.ord = ord;
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public void setEnergie(int nrj) {
		this.energie=nrj;
	}
	
	public int getAbs() {
		return this.abs;
	}
	
	public void setAbs(int x) {
		this.abs=x;
	}
	
	public int getOrd()  {
		return this.ord;
	}
	
	public void setOrd(int y) {
		this.ord=y;
	}
	
	@Override
	public void dessinerObjet(Graphics g){
		g.setColor(couleur);
		
	}
}
