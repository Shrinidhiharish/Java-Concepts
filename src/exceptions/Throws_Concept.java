package exceptions;

public class Throws_Concept {

	public static void main(String[] args) throws ArithmeticException {
		//Throws keyword is used for handling checked exceptions . 
		//By using throws we can declare multiple exceptions in one go.
		//answer->call->main->jvm it terminates the program.
		Throws_Concept obj=new Throws_Concept();
		obj.call();
		
		//Any lines written after this will not be executed.
		//Throwable is the super class of error and exception.
	}
		
public void call() {
	
try{
	answer();
}
catch (ArithmeticException e) {
	
}
	
}
	public void answer() throws ArithmeticException
	{
		int i=90/0;
	}
	
	}


