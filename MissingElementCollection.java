package week3.day2.assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementCollection {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> set = new TreeSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);	
			
		}
		
		System.out.println(set);
		for (Integer integer : set) {
			count++;
			if(count!=integer)
			{
				System.out.println("Missing Element: "+count);
				break;
			}
			
			
		}

	}

}
