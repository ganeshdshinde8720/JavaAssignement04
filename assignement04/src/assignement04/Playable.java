package assignement04;

public interface Playable {

	void play();
}

class Football implements Playable {

	@Override
	public void play() {
		System.out.println("Football");
		
	}
	
}
class Volleyball implements Playable {

	@Override
	public void play() {
		System.out.println("Valleyball");
		
	}
	
}
class Basketball implements Playable {

	@Override
	public void play() {
		System.out.println("Basketball");
		
	}
	
}