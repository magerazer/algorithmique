package fr.demos.formation.cribleeratosthene;

public class Main {

	public static void main(String[] args) {
		
//		NombrePremiers np = new NombrePremiers(100);
//		np.nbPremiers();
//		System.out.println(np);
		
		Premier first = new Premier(2);
		
		for(int i=3; i<= 10; ++i) {
			first.filtre(i);
		}
		System.out.println(first);
		
	}

}
