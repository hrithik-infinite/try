package trainingtwo;

public class Employee extends Person {
	private String email;
	private double salary;
	private String role;
	
	public Employee() {
		super();
		this.salary = -1;
	}
	
	public Employee(String name, int age, double salary) {
		super(name,age);
		this.salary = salary;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	
	
}
