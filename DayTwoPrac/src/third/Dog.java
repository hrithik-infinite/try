package third;

public class Dog extends Wolf {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(double height, double weight) {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am a dog, who can eat everything.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I am a dog, who moves slowly.");
	}
	
	public static void makeNoise() {
		System.out.println("Bark");
	}
	
	public void sleep() {
		System.out.println("Dog Sleeping");
	}
}
