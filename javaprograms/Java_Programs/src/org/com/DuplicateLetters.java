package org.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateLetters {

	public static void main(String[] args) {

		String s = "occassions";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(map.containsKey(c)) {
				Integer count = map.get(c);
				map.put(c,count+1);
				if(count==1) {
						System.out.println(c);
				}
				
			}else {
				map.put(c, 1);
			}
		}
	}

}
