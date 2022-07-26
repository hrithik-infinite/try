package second;

public class Customer extends Person {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, int age, Account account) {
		super(firstName, age);
		this.account = account;
		
	}
	
}