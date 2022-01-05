// Java program to handle exceptions using try, catch, finally, throw, and throws keywords

import java.util.*;

public class ExceptionHandlingExa extends Exception {

	public ExceptionHandlingExa(String message) {
		super(message);
	}

	// Method that directly throws exception and handle it
	public void show() throws Exception {
		int number1 = 40;
		int number2 = 4;
		float division = number1 / number2;
		System.out.println("Division is :" + division);
	}

	public static void main(String args[]) throws Exception {
		// Create object and call method
		ExceptionHandlingExa exceptionHandling = new ExceptionHandlingExa("Error:Age must be more than 0");
		exceptionHandling.show();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = scanner.nextInt();
		// Try, catch & finally block
		try {
			if (age > 50) {
				System.out.println("Old age.");
			} else if (age > 19 && age < 50) {
				System.out.println("Young age.");
			} else if (age < 19 && age > 0 ) {
				System.out.println("Child.");
			} else {
				// Throw exception string to constructor and print message
				throw new ExceptionHandlingExa("Error:Age must be more than 0");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter age.");
		} catch (NumberFormatException e) {
			System.out.println("Value must be digit.");
		} catch (ExceptionHandlingExa e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Success.");
		}
	}

}

