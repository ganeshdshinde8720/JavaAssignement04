package assignement04;

public interface Payment_G {

	void makePayment();
}
class Creditcard implements Payment_G {

	@Override
	public void makePayment() {
		System.out.println("useing creditcard");
		
	}
	
}
class Paypal implements Payment_G {

	@Override
	public void makePayment() {
	     System.out.println("useing paypal");
		
	}
	
}