package exceptions;

public class Throw_Concept {
	
public static void main(String[] args) {
	//We can define our own set of conditions or rules and throw an 
	//exception explicitly using throw keyword. 
	System.out.println("Fist statement after which i wish to throw exception");
	
	try {
	throw new Exception("customized exception");
	}
	catch (Exception e)
	{
		e.printStackTrace();//you will have to handle the exception you created.
	}
	
	System.out.println("Fist statement Before which i wish to throw exception");
}
}
