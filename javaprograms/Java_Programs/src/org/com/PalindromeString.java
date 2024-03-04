package org.com;

public class PalindromeString{
	
	public static void main(String[] args) {
		
		String s = "Madam";
		String reverse = "";
		for(int i= s.length()-1;i>=0; i--) {
			
			char c = s.charAt(i);
			reverse =reverse+c;
		
		}
		if(reverse.equalsIgnoreCase(s)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is Not an Palindrome"); 

		}
	
	}

}
