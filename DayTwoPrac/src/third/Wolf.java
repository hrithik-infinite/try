package third;

public class Wolf extends Animal {

	public Wolf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wolf(double height, double weight) {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am a wolf, who can eat everything.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I am a wolf, who moves fast and makes noise.");
	}
	
	public static void makeNoise() {
		System.out.println("Howl");
	}
	
	public void sleep() {
		System.out.println("Wolf Sleeping");
	}
}
