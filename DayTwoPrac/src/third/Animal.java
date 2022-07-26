package third;

public abstract class Animal {
	private double height;
	private double weight;
	
	public double getHeight() {
		return height;
	}
	
	public Animal() {
		super();
	}

	public Animal(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract void eat();
	
	public abstract void move();
	
	public static void makeNoise() {
		System.out.println("Animal making noise.");
	}
	
	public final void sleep() {
		System.out.println("Animal Sleeping");
	}
}
