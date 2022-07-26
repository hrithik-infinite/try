package third;

public class Cat extends Animal {

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(double height, double weight) {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am a cat, who can eat everything.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I am a cat, who moves silently.");
	}
	
	public static void makeNoise() {
		System.out.println("Mew-Mew.");
	}
	
	public void sleep() {
		System.out.println("Cat Sleeping");
	}
}
