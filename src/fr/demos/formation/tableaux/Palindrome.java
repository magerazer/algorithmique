package fr.demos.formation.tableaux;

public class Palindrome {

	public static void main(String[] args) {
		
		affichePalindrome("radar");
	
		affichePalindrome("esope reste et se repose");
		
	}

	
	
	public static boolean isPalindrome(String str) {
		
		boolean palindrome = true;
		int l = str.length();
		for(int i=0; i<l/2; i++) {
			if(str.charAt(i) != str.charAt(l-i-1)) {
				palindrome = false;
			}
		}
		
		return palindrome;
	}
	
	public static boolean isPalindromeRec(String str) {
		boolean palindrome = false;
		int l = str.length();
		if(l == 0) return true;
		if(l == 1) return true;
		
		if(str.charAt(0) != str.charAt(l - 1)) return false;
		
		String str2 = str.substring(1, l - 1);
		//System.out.println(str2);
		return palindrome = isPalindromeRec(str2);
		
		
	}
	
	
	public static void affichePalindrome(String chaine) {
		
		String ch = chaine.replaceAll("\\s", "");
		boolean isPalindrome = isPalindromeRec(ch);
		
		if(isPalindrome) {
			System.out.println(chaine + " est un palindrome");
		} else {
			System.out.println(chaine + " n'est pas un palindrome");
		}
	}
	
	
}
