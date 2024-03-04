package org.com;



public class CountOfCharacter {

	public static void main(String[] args) {

		String s = "SolaiMalaiRaja.M@123";
		int uppercaseCount=0,lowercaseCount=0,numberCount=0,specialCount=0;
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				uppercaseCount++;
			}else if(Character.isLowerCase(c)) {
				lowercaseCount++;
			}else if(Character.isDigit(c)) {
				numberCount++;
			}else {
				specialCount++;
			}
			
		}
		System.out.println("Upper_Case Count : "+uppercaseCount);
		System.out.println("lower_Case Count : "+lowercaseCount);
		System.out.println("Numbers Count : "+numberCount);
		System.out.println("SpecialCharacter Count : "+specialCount);
		
		
		
	}

}
