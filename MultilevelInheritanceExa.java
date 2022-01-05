// Java program to demonstrate multi-level inheritance

public class MultilevelInheritanceExa {

	protected String name;
	// Method of base class
	public void getName() {
		name = "Jaivik Patel";; 
	}
	
	public static void main(String args[]) {
		// Create an object of derive class and call methods of every class
		Level classLevel = new Level();
		classLevel.getName();
		classLevel.getId();
		classLevel.getDesignation();
		classLevel.show();
	}
	
}
// Multi class inheritate base class MultilevelInheritanceExa
class Multi extends MultilevelInheritanceExa {
	
	protected int id;
	// Method of derive class Multi
	public void getId() {
		id = 123;
	}
	
}
// Level class inheritate it's base class Multi
class Level extends Multi {
	
	protected String designation;
	// Method of derive class Level
	public void getDesignation() {
		designation = "Java Developer";
	}
	
	// This method shows value
	public void show() {
		System.out.println("Name is :" + name);
		System.out.println("Id is :" + id);
		System.out.println("Designation is :" + designation);
	}
	
}
