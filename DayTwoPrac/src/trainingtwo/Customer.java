package trainingtwo;

public class Customer extends Person {
	private boolean priviledged;
	private String email;
	
	public Customer() {
		super();
	}
	
	public Customer(boolean priviledged, String name, int age, String email) {
		super(name, age);
		this.priviledged = priviledged;
		this.email = email;
	}
	
	public boolean isPriviledged() {
		return priviledged;
	}
	public void setPriviledged(boolean priviledged) {
		this.priviledged = priviledged;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
