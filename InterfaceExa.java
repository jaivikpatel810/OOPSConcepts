// Java Program to demonstrate the interface

// Interface and it's method
interface Temporary {
	
	void get();
	
}
// Class that implements interface
public class InterfaceExa implements Temporary {
	
	// Interface method used by class
	public void get() {
		System.out.println("Get method of base class.");
	}
	
	// Class method 
	public void set() {
		System.out.println("Set method of base class.");
	}
	
	public static void main(String args[]) {
		// Create an object of derive class Interface
		Interface interfaceObj = new Interface();
		// Call methods through object
		interfaceObj.get();
		interfaceObj.set();
		interfaceObj.get1();
		interfaceObj.set1();
	}
} 
// Derive interface that extends base interface
interface Example extends Temporary {
	
	public void get1();
	public void set1();

} 
// Derive class that extends base class and implements derive interface
class Interface extends InterfaceExa implements Temporary {
	
	// Interface methods used by class
	public void get1() {
		System.out.println("Get method of derive class.");
	}
	
	public void set1() {
		System.out.println("Set method of derive class.");
	}
	
}
