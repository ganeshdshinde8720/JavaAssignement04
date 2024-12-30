package assignement04;

public interface Vehicle_C {

      default void Start(){
		
	}

}

class Car implements Vehicle_C {
	
	@Override
	public void Start() {
		System.out.println("Starting a Car");
		
	}
}
