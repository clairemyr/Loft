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

		loft.add(new Vorace(loft,(int)(Math.random()*29),(int)(Math.random()*29),3));
		loft.add(new Erratique(loft,(int)(Math.random()*29),(int)(Math.random()*29),4));
		loft.add(new Cannibale(loft,(int)(Math.random()*29),(int)(Math.random()*29),5));
		loft.add(new Lapin(loft,(int)(Math.random()*29),(int)(Math.random()*29),5));
		
		loft.go();
	}

}
