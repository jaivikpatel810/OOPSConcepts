// Java program to demonstrate Encapsulation

public class EncapsulationExa {

	// Private data member
	private int id;
	private String name;
	private long salary;

	// Public getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {
		// Creating object of class
		EncapsulationExa encapsulation = new EncapsulationExa();
		
		// Set values through setter method
		encapsulation.setId(123);
		encapsulation.setName("Jaivik Patel");
		encapsulation.setSalary(10000);
		
		// Get values through getter method
		System.out.println(encapsulation.getId() + "\n" + encapsulation.getName() + "\n" + encapsulation.getSalary());
	}

}
