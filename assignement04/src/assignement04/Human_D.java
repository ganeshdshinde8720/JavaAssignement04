package assignement04;

class Human implements Mammal_D {

	@Override
	public void eat() {
		System.out.println("Eat");
		
	}

	@Override
	public void giveBirth() {
		System.out.println("Give Birth");
		
	}
	
}

public class Human_D {

	public static void main(String[] args) {
		Human obj =new Human();
		obj.eat();
		obj.giveBirth();

	}

}
