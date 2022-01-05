// Java program to find the index of an array element

import java.util.*;

public class ArrayIndexExa {

	// Search function to find the index of an element
	public static int findIndex(int array[], int value) {
		// If array is Null
		if (array == null) {
			return -1;
		}

		// Find length of array
		int arrayLength = array.length;
		int i = 0;

		// Traverse in the array
		while (i < arrayLength) {
			if (array[i] == value) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");    
		int numberOfElement = scanner.nextInt();  
		// Create an array 
		int[] enterArray = new int[10];  

		System.out.println("Enter the elements of the array: ");  
		for (int i = 0; i < numberOfElement; i++) {     
			enterArray[i] = scanner.nextInt();  
		}  

		System.out.println("Enter element you want to find: ");
		int find = scanner.nextInt();
		// Find the index of enter element
		System.out.println("Index position of " + find + " is: " + findIndex(enterArray, find));
	}

}
