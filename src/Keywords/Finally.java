package Keywords;

import javax.management.RuntimeErrorException;

public class Finally {
public static void main(String[] args) {
	testing();
	test();
	}
	
	public static void testing()
	{
try 
{
	System.out.println("Try  block");
	throw new RuntimeException("Testing exception");
	
}
	catch(Exception e) {
		System.out.println("inside catch block");
	}
finally {
	System.out.println("Inside finally block");
}
	}
	
	
	public static void test()
	{
		try {
			System.out.println("Inside");
		}
		finally {
			System.out.println("Iam finally block");
		}
	}
}

