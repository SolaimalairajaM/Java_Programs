package org.com;

public class DescendingArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,7,6,5,4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
					int des = a[i];
					a[i] = a[j];
					a[j] = des;
				}
			}
		}
		for (int x : a) {
			System.out.println(x);
		}
	}
}
