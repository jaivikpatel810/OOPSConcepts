// Java program to demonstrate hybrid inheritance

public class HybridInheritanceExa {

	// Base class method
	void display() {
		System.out.println("Method of base class HybridInheritanceExa.");
	}

	public static void main(String args[]) {
		// Create derive class objects call base class method
		HybridInheritanceExa hybrid = new Hybrid();
		hybrid.display();

		hybrid = new Inheritance();
		hybrid.display();

		hybrid = new Example();
		hybrid.display();

		// Call base class method using base class object
		HybridInheritanceExa hybridBase = new HybridInheritanceExa();
		hybridBase.display();
	}

}

// Derive class inheritate base class
class Hybrid extends HybridInheritanceExa {

	// Derive class method
	void display() {
		System.out.println("Method of derive class Hybrid.");
	}

}

// Derive class inheritate base class
class Inheritance extends HybridInheritanceExa {

	// Derive class method
	void display() {
		System.out.println("Method of derive class Inheritance.");
	}

}

// Derive class inheritate base class Hyb
class Example extends Hybrid {

	// Derive class method
	void display() {
		System.out.println("Method of derive class Example.");
	}

}
