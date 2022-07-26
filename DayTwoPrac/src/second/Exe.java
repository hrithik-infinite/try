package second;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Yash", 22);
		Customer customer = new Customer();
		Account account = new SBAccount(20000, "SB");
		customer.setAccount(account);
		customer.setFirstName("Aditya");
		customer.setAge(20);
		employee.setCustomer(customer);
		whatToDo(employee, "DepositCash", 10000);
		
		Customer customer1 = new Customer();
		Account account1 = new CurrentAccount(20000, "Cur");
		customer1.setAccount(account1);
		customer1.setFirstName("Aditya");
		customer1.setAge(20);
		employee.setCustomer(customer1);
		whatToDo(employee, "WithdrawCash", 19000);
		
	}

	private static void whatToDo(Employee employee, String action, double amount) {
		// TODO Auto-generated method stub
		switch(action) {
		case "WithdrawCash":
			Customer c = employee.getCustomer();
			Account ac = c.getAccount();
			if(amount>( ac.getBalance()-1 ) ) {
				System.out.println("You have insufficient fund to do this withdrawl and you have a balance of "+ac.getBalance());
				
			}
			else {
				double temp = ac.getBalance();
				ac.setBalance(temp-amount);
				System.out.println("You have withdrawn cash "+amount+" and your updated balance is "+ac.getBalance());
			}
			break;
		case "DepositCash":
//			Customer c1 = employee.getCustomer();
//			Account ac1 = c.getAccount();
			//Account a = employee.getCustomer().getAccount();
			double temp = employee.getCustomer().getAccount().getBalance();
			temp = temp+amount;
			employee.getCustomer().getAccount().setBalance(temp);
			System.out.println("Your account has been deposited with "+amount+" and the updated balance is "+employee.getCustomer().getAccount().getBalance());
			
			break;
		}
	}

}
