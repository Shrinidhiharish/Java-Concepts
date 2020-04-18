package basics;

public class Wrapper_Class_Cocepts {

	public static void main(String[] args) {
		
		String x="10000";
		System.out.println(x+21);
		
		int i =Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+900);
		
		double d = Double.parseDouble(x);
		String str=String.valueOf(d);
		System.out.println(str);
		System.out.println(d);
		System.out.println(str+1000);
		
		float f = Float.parseFloat(x);
		System.out.println(f);
		
		boolean boo=Boolean.parseBoolean(x);
		System.out.println(boo);
		
		String y="10000aa";
			
		int j =Integer.parseInt(y);
	}

}
