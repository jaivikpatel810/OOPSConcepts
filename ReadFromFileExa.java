// Java program to read the data from a file

import java.io.*;
import java.util.*;

public class ReadFromFileExa {

	public static void main(String args[]) {
		try {
			File readFile = new File("D:/Work/myTestFile.txt");
			Scanner dataReader = new Scanner(readFile);

			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			System.out.println();

			// Get the length of the file
			System.out.println("length of data: " + readFile.length());

			//Split read data by string handling
			ArrayList<String> splitData = new ArrayList<>();
			BufferedReader dataRead = new BufferedReader(new FileReader("D:/Work/myTestFile.txt"));
			String line;
			while((line = dataRead.readLine())!=null) {
				String[] splitString = line.split(" ");
				splitData.add(Arrays.toString(splitString));
				System.out.println(splitData);
			}

			// Close the FileReader object
			dataReader.close();
		} catch (IOException exception) {
			System.out.println(exception);
		}
	}

}