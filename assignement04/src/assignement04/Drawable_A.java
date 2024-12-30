package assignement04;

public interface Drawable_A {

	void draw();
}
class Cricle implements Drawable_A {

	@Override
	public void draw() {
		System.out.println("Cricle");
		
	}
	
}
class Rectangle implements Drawable_A {

	@Override
	public void draw() {
		System.out.println("Rectangle");
		
	}
	
}
class Triangle implements Drawable_A {

	@Override
	public void draw() {
		System.out.println("Triangle");
		
	}
	
}