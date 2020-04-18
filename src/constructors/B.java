package constructors;

public class B extends Super_Concept {
	public B() {
		// super();
		System.out.println("child class");
	}

	public B(int i) {
		super(i);
		System.out.println("child class 1");
	}

	public B(int i, int j) {
		// super(i ,j);
		System.out.println("child class 2 ");
	}
}
