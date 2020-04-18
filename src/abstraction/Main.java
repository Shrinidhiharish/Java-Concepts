package abstraction;

public class Main {

	public static void main(String[] args) {
		Sbi obj= new Sbi();
		obj.credit();
		obj.Debit();
		obj.loan();
		obj.funds();
		
	Bank n=	new Sbi();
//n.funds(); not possible
	n.credit();
	n.Debit();
	n.loan();
	}

}
