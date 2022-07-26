package second;

public class Account {
	private double balance;
	private String accountNo;
	
	public Account(double balance, String accountType) {
		this.balance = balance;
		this.accountNo = ""+accountType+Integer.hashCode(5);
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

	
	
}

