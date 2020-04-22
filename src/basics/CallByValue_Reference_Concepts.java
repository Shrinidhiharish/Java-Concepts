package basics;

public class CallByValue_Reference_Concepts {
int a ;
int b;

	public static void main(String[] args) {
		//While calling a function, 
		//when you pass values by copying variables, it is known as "Call By Values."
		//In this method, a copy of the variable is passed.
		//While calling a function, in programming language instead of copying the values of variables,
		//the address of the variables is used it is known as "Call By References
		int x=80;
		int y=90;
		call_by_value(x,y);
		CallByValue_Reference_Concepts obj = new CallByValue_Reference_Concepts();
		obj.a=190;
		obj.b=908;
		obj.call_by_reference(obj);
	
	}
	
	public static void call_by_value(int a , int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public static void call_by_reference(CallByValue_Reference_Concepts t)
	{
		int temp;
		temp=t.a;
		t.a=t.b;
		t.b=temp;
		System.out.println();
		
	}
	
}
