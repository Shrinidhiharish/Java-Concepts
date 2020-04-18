package Mutable;

public class mainmethod1 {

	public static void main(String[] args) {  //JVM searches main method with string[] args
		//it should be piublic static void
		System.out.println("Main method");
		
		main("test");
		main(2);
	}
	public static void main(String args) {
		System.out.println("Main method 1");

	}
	public static void main(int a ) {
		System.out.println("Main method 2");

	}
}
