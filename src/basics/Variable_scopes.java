package basics;

public class Variable_scopes {
		 
	 int i=100;//gol
	
	public static void main(String[] args) {
		Variable_scopes obj= new Variable_scopes();
		System.out.println(obj.i);
		obj.car();
		
	}

 public  void car () {
	  int i =10;//local
	  
	  System.out.println(i);
 }
 

}
