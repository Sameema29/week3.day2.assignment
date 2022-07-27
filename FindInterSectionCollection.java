package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindInterSectionCollection {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list1.add(a[i]);

		}

		for (int i = 0; i < b.length; i++) {
			list2.add(b[i]);
		}

		System.out.println("The Matched Numbers are: ");
		for (Integer integer : list1) {
			for (Integer integer2 : list2) {
				if(integer == integer2)
				{
					System.out.println(integer);
				}

			}

		}

	}

}
