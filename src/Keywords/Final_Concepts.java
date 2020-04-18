package Keywords;

public class Final_Concepts {
//To make a variable constant
	//To avoid inheritance 
	//To prevent method overiding
	
	public static void main(String[] args) {
		int i = 9;
		i=0;
		i=89;
		i=11;
		System.out.println(i);
		final int  j=99;
		// Error j=100;
		Parent.new_method();
		Child.new_method();
		
		
	}

}
