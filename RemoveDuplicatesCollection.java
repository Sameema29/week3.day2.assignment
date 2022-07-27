package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();		
		for (int i = 0; i < textArray.length; i++) {

			set.add(textArray[i]);			}
		System.out.println("Unique String: ");
		for (String uniqueText : set) {
			System.out.print(uniqueText+" ");
		}
	}



}


