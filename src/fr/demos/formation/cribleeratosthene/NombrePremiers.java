package fr.demos.formation.cribleeratosthene;

import java.util.Scanner;

public class NombrePremiers {

	private int marques[];
	private int borneSup;
	
	public NombrePremiers(int borneSup) {
		this.borneSup = borneSup;
		marques = new int[borneSup+1];
	}
		
	public void nbPremiers()
	{		

		for (int i = 2; i <= borneSup; i++) {
			for (int j = i + i; j <= borneSup; j += i) {
				
				marques[j] = -1;
			}
		}
		
	}
	
	public String toString() {
		String str = "";
		for(int i=0; i<=borneSup; i++) {
			if(marques[i] != -1) {
				str += i + " ";
			}
		}
		return str;
	}
		

}
