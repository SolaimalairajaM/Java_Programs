package org.com;

public class SplitAndReverseString {

	public static void main(String[] args) {
		
		String s = "Happy New Year";
		String[] split = s.split(" ");
		String output = "";
		
		for(String x:split) {
			String reverse = "";
			for(int i=x.length()-1;i>=0;i--) {
				char c = x.charAt(i);
				reverse = reverse+c;
				
			}
			output = output+reverse+" ";
			
		}
		System.out.println(output);

		
		
	}

}
