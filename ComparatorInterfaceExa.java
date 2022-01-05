// Java prpgram to demonstrate comparator interface

import java.util.*;
import java.io.*;

public class ComparatorInterfaceExa {

	int rollno, age;
	String name;

	public ComparatorInterfaceExa(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;    
	}

	public static void main(String args[]) {
		// Creating a list of ComparatorInterfaceExas  
		ArrayList<ComparatorInterfaceExa> list = new ArrayList<ComparatorInterfaceExa> ();
		list.add(new ComparatorInterfaceExa(101, "Deep", 19));
		list.add(new ComparatorInterfaceExa(103, "Jeet", 21));
		list.add(new ComparatorInterfaceExa(102, "Jaivik", 20));
		

		System.out.println("Sorting by Name");
		// Using NameComparator to sort the elements  
		Collections.sort(list, new NameComparator());

		// Traversing the elements of list  
		for (ComparatorInterfaceExa comparatorExa : list) {
			System.out.println(comparatorExa.rollno + " " + comparatorExa.name + " " + comparatorExa.age);
		}

		System.out.println();
		System.out.println("Sorting by Age");
		// Using AgeComparator to sort the elements  
		Collections.sort(list, new AgeComparator());

		// Travering the list again  
		for (ComparatorInterfaceExa comparatorExa : list) {
			System.out.println(comparatorExa.rollno + " " + comparatorExa.name + " " + comparatorExa.age);
		}
	}

}

// Class implements interface Comparator
class AgeComparator implements Comparator < ComparatorInterfaceExa > {

	// Comparision of age for sorting
	public int compare(ComparatorInterfaceExa comparatorInterfaceExa1, ComparatorInterfaceExa comparatorInterfaceExa2) {
		if (comparatorInterfaceExa1.age == comparatorInterfaceExa2.age) {
			return 0;
		} else if (comparatorInterfaceExa1.age > comparatorInterfaceExa2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

// Class implements interface Comparator
class NameComparator implements Comparator < ComparatorInterfaceExa > {

	// Comparision of name for sorting
	public int compare(ComparatorInterfaceExa comparatorInterfaceExa1, ComparatorInterfaceExa comparatorInterfaceExa2) {
		return comparatorInterfaceExa1.name.compareTo(comparatorInterfaceExa2.name);
	}

}