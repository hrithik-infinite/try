package trainingtwo;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Yash", 22, 20000);
		Customer customer = new Customer(true, "Aditya", 21, "aditya123@gmail.com");
		Account account = new Account(customer, 50000);
		
		account.depositCash(account, 50000);
		System.out.println(account.getBalance());
		System.out.println( account.withdrawCash(account, 80000) );
		
	}

}
