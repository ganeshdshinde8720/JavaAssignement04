package assignement04;

public interface Shape_B {

	void draw();
	void area();
	
}
class Circle implements Shape_B {

	@Override
	public void draw() {
		System.out.println("Draw");
		
	}

	@Override
	public void area() {
		System.out.println("Area");
		
	}
	
}