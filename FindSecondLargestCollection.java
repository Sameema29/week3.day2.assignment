package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestCollection {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
			
		}
		System.out.println("Set: "+set);
        list.addAll(set);
        System.out.println("List: "+list);
        int secondLargest = list.get(list.size()-2);
        System.out.println("Second Largest Number: "+secondLargest);
	}

}
