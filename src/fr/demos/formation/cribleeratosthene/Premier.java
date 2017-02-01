package fr.demos.formation.cribleeratosthene;

public class Premier {

	private int valeur;
	private Premier suivant;
	
	public Premier(int valeur) {
		this.valeur = valeur;	
		suivant = null;
	}	

	public void filtre(int aTester) {
		if(this.neDivisePas(aTester))
			passeAuSuivant(aTester);
		
	}
	
	public void passeAuSuivant(int nbATester) {
		if(this.suivant != null) {
			this.suivant.filtre(nbATester);
		} else {
			this.suivant = new Premier(nbATester);
		}
		
	}
	
	
	public boolean neDivisePas(int nbATester) {
		return (nbATester % valeur != 0);
	}	
	
	
	
	public String toString() {
		String str = "";
		Premier premier = this;
		while(premier != null) {
			str += premier.valeur + " ";			
			premier = premier.suivant;
		}
		return str;
	}
	
	
	
	
	
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Premier getSuivant() {
		return suivant;
	}

	public void setSuivant(Premier suivant) {
		this.suivant = suivant;
	}
	
	
	
}


