package assignement04;

public interface Animal_F {

	void sound();
}
class Dog implements Animal_F {

	@Override
	public void sound() {
		System.out.println("Dog is Runing");
		
	}
	
}