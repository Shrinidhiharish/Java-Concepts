package abstraction;

public class Sbi extends Bank {

	@Override
	public void loan() {
		System.out.println("loan");
	}
	public void funds() {
		System.out.println("funds");
	}
	
}
