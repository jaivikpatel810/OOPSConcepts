// Java program to demonstrate two types of polymorphism like compile-time and runtime polymorphism

public class PolymorphismExa {

	// Compile-time polymorphism and it's methods
	int addition(int number1, int number2) {
		return number1 + number2;
	}

	int addition(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	// Runtime polymorphism method
	public void runMethod() {
		System.out.println("Overridden Method");
	}

	public static void main(String args[]) {
		// Object of base class and overloading a methods
		PolymorphismExa polymorphism = new PolymorphismExa();
		System.out.println(polymorphism.addition(5, 10));
		System.out.println(polymorphism.addition(10, 15, 20));

		// Object of derived class and overriding a method
		PolymorphismExa polymorphismExample = new PolymorphismExample();
		polymorphismExample.runMethod();
	}

}

class PolymorphismExample extends PolymorphismExa {

	// Runtime polymorphism method
	public void runMethod() {
		System.out.println("Overriding Method");
	}

}
