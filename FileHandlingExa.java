// Java program to create a text file and add your personal details to the test file

import java.io.*;

public class FileHandlingExa {

	public static void main(String args[]) {
		try {
			// Create a new empty file
			File newFile = new File("D:/Work/myTestFile.txt");

			if (newFile.createNewFile()) { 
				System.out.println("File " + newFile.getName() + " is created successfully.");
			} else {  
				System.out.println("File is already exist in the directory.");  
			}

			// Write in the file
			FileWriter fwrite = new FileWriter("D:/Work/myTestFile.txt");
			fwrite.write("Hey, I am Jaivik Patel. I am a MSc(CA & IT) student. Currently I am working as Jr. Java Developer. I am living in Ahmedabad.");

			// Close the object
			fwrite.close();
			System.out.println("Details are successfully written in file.");
		} catch (IOException exception) {
			System.out.println(exception);
		}
	}

}