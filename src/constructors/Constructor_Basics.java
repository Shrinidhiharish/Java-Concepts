package constructors;

public class Constructor_Basics {
	
	public Constructor_Basics()
	{
		System.out.println("no arguement");
	}
	
	public Constructor_Basics(int i)
	{
		System.out.println("one parameter");
	}
	
	public Constructor_Basics(int i, int j)
	{
		System.out.println("two parameter");
	}


	public static void main(String[] args) {
		
		Constructor_Basics obj = new Constructor_Basics();
		Constructor_Basics obj1 = new Constructor_Basics(10);
		Constructor_Basics obj2 = new Constructor_Basics(20,30);
		
	}
	
}
