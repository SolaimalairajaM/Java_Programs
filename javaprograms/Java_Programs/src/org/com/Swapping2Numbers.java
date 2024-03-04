package org.com;

public class Swapping2Numbers {

	public static void main(String[] args) {

		//Using 3rd variable c//
		int a =10;
		int b=50;
		int c= a;     //c=10
		a=b;          //a=50
		b=c;          //b=10
		System.out.println(a);
		System.out.println(b);
		System.out.println("======//////////========");
		
		//Without using 3rd variable//
		a=a+b;   //a=50+10= 60
		b=a-b;   //b=60-10= 50
		a=a-b;   //a=60-50= 10
		System.out.println(a);
		System.out.println(b);
		
	}

}
