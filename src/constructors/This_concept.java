package constructors;

public class This_concept {

	String myname = "shrinidhi";
	int j = 100;

	// If this myname and name is like name and name then use this keyword
	public This_concept(String name, int i) {
		name = myname;
		i = j;
		System.out.println(name);
		System.out.println(i);
	}

	public static void main(String[] args) {
		This_concept obj = new This_concept("tom", 10);
	}

}
