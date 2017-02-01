package fr.demos.formation.tableaux;

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Occurrences {

	public static void main(String[] args) {
		
		String str = "This is String, is created by mkyong";
		String mot1 = "string";
		int cpt1 = 0;
	
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		
		StringTokenizer st = new StringTokenizer(str.toLowerCase());
		
		while (st.hasMoreElements()) {
			//System.out.println(st.nextElement());
			String tmp = st.nextToken();
			if(hmap.containsKey(tmp)) {
				hmap.put(tmp, hmap.get(tmp).intValue() + 1);
				
			} else {
				hmap.put(tmp, 1);				
			}
			
		}
		
		Iterator<String> keySetIterator = hmap.keySet().iterator();
		
		while(keySetIterator.hasNext()){ 
			String key = keySetIterator.next(); 
			System.out.println("" + key + " : " + hmap.get(key)); }

		
		
	}

}
