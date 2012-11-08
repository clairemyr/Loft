//package com.objet.lofteurs;

public class Saison1 {

	public static int tailleLoft = 30;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Saison1().primeTime();
	}
	
	public void primeTime() {
		ZoneGraphique zone = new ZoneGraphique("Mon premier loft");
		Loft loft = new Loft(tailleLoft,zone);
		zone.ajouterObjet(loft);

		loft.initialiser();
		
		loft.go();
	}

}