package assignement04;

public interface Car_I {

	default void start() {
		System.out.println("this is start method");
		
	}
	void drive();
	
}
class Sedan implements Car_I {

	@Override
	public void drive() {
		System.out.println("this is drive method");
		
	}
	
}