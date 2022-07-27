package week3.day2.assignment;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesCollection {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> set=new TreeSet<Integer>();
		Set<Integer> duplicate=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean flag=set.add(arr[i]);

			if(flag==false) { 
				duplicate.add(arr[i]);
			}

		}
		System.out.println(set);
		System.out.println("Duplicates: "+duplicate);
	}


}


