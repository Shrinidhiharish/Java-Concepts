package constructors;

public class Super_Concept {

	public Super_Concept() {
		System.out.println("Parent class");
	}

	public Super_Concept(int i) {

		System.out.println("Parent class with value " + i);
	}

	public Super_Concept(int i, int j) {

		System.out.println("Parent class with 2 value " + i);
		System.out.println("Parent class with 2 value " + j);
	}

	public static void main(String[] args) {
		// Super_Concept obj= new Super_Concept();
		B obj1 = new B();
		B obj = new B(1);
		B obj2 = new B(1, 2);
	}

}
