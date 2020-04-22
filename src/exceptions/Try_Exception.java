package exceptions;

public class Try_Exception {
int a =10;
	public static void main(String[] args) {
		//int i=10/0;
		//System.out.println(i);//java.lang.ArithmeticException: / by zero
		//It is a unchecked exception
		//Thread.sleep(20000);//Checked exception Unhandled exception type InterruptedException

		Try_Exception obj=new Try_Exception();
		//obj=null;//We are making the object to cancel the reference now obj is pointing to nothing so we get 
		System.out.println(obj.a);
		//java.lang.NullPointerException
		
		//1.try-catch
	//The try statement allows you to define a block of code to be tested for errors while it is being executed.

//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.	
	try
	{
		int i=10/0;
	}
		catch (ArithmeticException e) {
			System.out.println("exception");
			e.printStackTrace();//print the type of exception without stopping prg execution
	System.out.println(e.getMessage());//prints what is the error 
		
		}
		
	}

}
