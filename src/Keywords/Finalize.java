package Keywords;

public class Finalize {

	public void finalize()
	{
		System.out.println("Finalise");
	}
	
	
	public static void main(String[] args) {
		Finalize few= new Finalize();
		//Finalize fewer= new Finalize();
		few =null;
		//fewer=null;
		
		System.gc();
	}

}
