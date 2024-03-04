package org.com;

public class AscendingArray {

	public static void main(String[] args) {

		int[] a= {1,2,3,7,6,5,4};
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					int asc = a[i];
					a[i] = a[j];
					a[j] = asc;
				}
			}
		}
		
		for (int x : a) {
			System.out.println(x);
		}
		System.out.println("Second Lowest : "+a[1]);
		System.out.println("Second Largest : "+a[(a.length)-2]);
		
	}
}
