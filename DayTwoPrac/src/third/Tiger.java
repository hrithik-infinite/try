package third;

public class Tiger extends Cat {

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(double height, double weight) {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am a tiger,whi is a carnivore and wont eat everything.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I am a tiger, who moves silently and swiftly.");
	}
	
	public static void makeNoise() {
		System.out.println("Roar");
	}
	
	public void sleep() {
		System.out.println("Tiger Sleeping");
	}
}
