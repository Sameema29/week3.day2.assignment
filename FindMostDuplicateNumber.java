package week3.day2.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		String text = "abbaba";
		int maxoccurence=0;
		char maxchar='0';
		char[] c=text.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				map.put(c[i], map.getOrDefault(c[i], 0)+1);
			}
			else {
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>maxoccurence) {
				maxoccurence=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		System.out.println("The most duplicate character in the string is "+maxchar+" having the most occurence of "+maxoccurence);
	}

}
