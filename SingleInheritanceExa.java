// Java program to demonstrate single inheritance

public class SingleInheritanceExa {	

	int id;
	String name;
	// Parameterized constructor
	SingleInheritanceExa(int storedId, String storedName) {
		id = storedId;
		name = storedName;
	} 

	public static void main(String args[]) {
		// Create an object of derive class 
		SingleInheritanceExample singleInheritanceExample = new SingleInheritanceExample(123, "Jaivik", 10000);
		singleInheritanceExample.display();
	}

}

// Derive class inheritate base class
class SingleInheritanceExample extends SingleInheritanceExa {

	int salary;
	// Parameterized constructor
	SingleInheritanceExample(int baseId, String baseName, int baseSalary) {
		super(baseId, baseName);
		salary = baseSalary;
	}

	// Display method of derive class
	void display() {
		System.out.println("id =" + id + "\nname =" + name + "\nSalary =" + salary);
	}

}
