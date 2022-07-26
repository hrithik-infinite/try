package second;

public class Employee extends Person{
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, int age) {
		super(firstName, age);
		// TODO Auto-generated constructor stub
	}
	
	
}
