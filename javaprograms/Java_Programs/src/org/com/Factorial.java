package org.com;

public class Factorial {

	public static void main(String[] args) {

		//Factorial of 5 is 1*2*3*4*5= 120
		int factorial = 1;
		for(int i=1; i<=5;i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}

}
