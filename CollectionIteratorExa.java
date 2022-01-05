// Java program to add string values in the list and print all the values using an iterator.

import java.io.*;  
import java.util.*;  

public class CollectionIteratorExa {  

	public static void main(String[] args) {  
	// List of Array string
		ArrayList<String> myDetails = new ArrayList<String> ();

	// Add values in Arraylist
		myDetails.add("Hello");  
		myDetails.add("World");  
		myDetails.add("Jaivik");  
		myDetails.add("Ahmedabad");  
		myDetails.add("Java Developer");  

		// Iterator to iterate the myDetails  
		Iterator iterator = myDetails.iterator();  

		System.out.println("Details elements : ");  

		while (iterator.hasNext())   
				System.out.println(iterator.next() + " ");  

		System.out.println();  
	}

}
