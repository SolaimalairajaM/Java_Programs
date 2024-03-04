package org.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfWords {

	public static void main(String[] args) {

		String s = "Happy Happy New Year";
		
		Map<String,Integer> map = new LinkedHashMap<>();
		
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			if(map.containsKey(str)) {
				Integer count = map.get(str);
				map.put(str, count+1);
			}else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
	}
}
