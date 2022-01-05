// Java program to demonstrate hierarchical inheritance

public class HierarchicalInheritanceExa {

	// Base class method
	public void methodA() {
		System.out.println("Method of base class A.");
	}

	public static void main(String args[]) {
		// Create derive class objects call base class method
		HierarchicalInheritanceExa hierarchical = new Hier();
		hierarchical.methodA();

		hierarchical = new Archical();
		hierarchical.methodA();

		hierarchical = new Example();
		hierarchical.methodA();

		// Create derive class objects and call it's methods
		Hier hier = new Hier();
		hier.methodB();

		Archical archical = new Archical();
		archical.methodC();

		Example example = new Example();
		example.methodD();
	}

}

// Derive class inheritate base class
class Hier extends HierarchicalInheritanceExa {

	// Derive class method
	public void methodB() {
		System.out.println("method of derive class B.");
	}

}

// Derive class inheritate base class
class Archical extends HierarchicalInheritanceExa {

	// Derive class method
	public void methodC() {
		System.out.println("method of derive class C");
	}

} 

// Derive class inheritate base class
class Example extends HierarchicalInheritanceExa {

	// Derive class method
	public void methodD() {
		System.out.println("method of derive class D");
	}

}
