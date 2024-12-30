package assignement04;

public interface InterfaceA_H {
	
	void display();

}
interface InterfaceB_H {
	
	void display();
	
}
class Test implements InterfaceA_H, InterfaceB_H {

	@Override
	public void display() {
		System.out.println("This is Display Method");
		
	}
	
}