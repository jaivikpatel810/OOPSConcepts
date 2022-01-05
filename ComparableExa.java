// Java prpgram to demonstrate comparable interface

import java.util.*;
import java.io.*;

public class ComparableExa implements Comparable<ComparableExa> {

	int rollno, age;
	String name;

	public ComparableExa(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// Comparision of age for sorting
	public int compareTo(ComparableExa comparableExa) {
		if (age == comparableExa.age) {
			return 0;
		} else if (age > comparableExa.age) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String args[]) {
		// Create ArrayList and add values in list
		ArrayList<ComparableExa> comparableList = new ArrayList<ComparableExa> ();
		comparableList.add(new ComparableExa(101, "Deep", 19));
		comparableList.add(new ComparableExa(103, "Jeet", 21));
		comparableList.add(new ComparableExa(102, "Jaivik", 20));

		// Sorting in the list by age
		Collections.sort(comparableList);
		for (ComparableExa comparableExa : comparableList) {
			System.out.println(comparableExa.rollno + " " + comparableExa.name + " " + comparableExa.age);
		}
	}

}
