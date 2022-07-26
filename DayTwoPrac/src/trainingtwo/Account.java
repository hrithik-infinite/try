package trainingtwo;

public class Account {
	private Customer customer;
	private double balance;
	private String accountNo;
	
	public Account(Customer customer, double balance) {
		this.customer = customer;
		this.balance = balance;
		this.accountNo = "SB"+Integer.hashCode(5);
		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void depositCash(Account account, double cash) {
		Customer c = account.getCustomer();
		this.balance += cash;
		System.out.println("Cash deposited successfully to "+c.getFirstName()+" and the balance is "+getBalance());
		
	}
	public double withdrawCash(Account account, double amount) {
		if(amount>0) {
			Customer c = account.getCustomer();
			if(amount<balance) {
				setBalance(this.balance-amount);
				System.out.println("Cash withdrawn successfully from "+c.getFirstName()+" and the balance is "+getBalance());
				return amount;
			}
		}
		
		return 0;
	}
}
