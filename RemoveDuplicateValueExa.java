// Java program to prepare the list and remove duplicate values of the list

import java.util.*;   

public class RemoveDuplicateValueExa {

	// Create method for removing duplicates using LinkedHashSet
	static void removeDuplicates(String string) {
		// Create LinkedHashSet of type character
		LinkedHashSet<Character> set = new LinkedHashSet<> ();

		// Add each character of the string into LinkedHashSet
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));   
		}

		// Print the string after removing duplicate characters
		for (Character character : set) {
			System.out.print(character); 
		}
	}

	public static void main(String args[]) {   
		String removeDuplicateString = "ABCDACEEE";
		removeDuplicates(removeDuplicateString);   
	}

}
