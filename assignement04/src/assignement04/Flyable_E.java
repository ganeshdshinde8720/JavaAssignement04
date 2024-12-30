package assignement04;

public interface Flyable_E {
	void fly();

}
class Airplane implements Flyable_E {

	@Override
	public void fly() {
	System.out.println("airplane is flying");
		
	}
	
}