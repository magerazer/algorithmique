package fr.demos.formation.tableaux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList(Arrays.asList(5, 9, 1, 7, 3));
			
		
		int min = liste.get(0);
		int max = liste.get(0);
		
		for(int i=0; i<liste.size(); i++) {
			int temp = liste.get(i);
			if(temp <= min) min = temp;
			if(temp >= max) max = temp;
		}

		System.out.println("Le minimum est : " + min);
		System.out.println("Le maximum est : " + max);
		
		
	}
}
