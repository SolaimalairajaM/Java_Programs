package org.com;

public class RemoveSpaceInString {

	public static void main(String[] args) {

		String s = "Be happy     Forever";
		String output = s.replaceAll(" ", "");
		System.out.println(output);
		
	}

}
