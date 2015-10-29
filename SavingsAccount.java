public class SavingsAccount {
	
	private int balance;
	
	public SavingsAccount() {
		balance = 0;
	}
	
	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}
	
	public void greet() {
		System.out.println("Hello");
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void deposit(int howMuch) {
		if (howMuch > 0) {
			balance = balance + howMuch;
		}
		else {
			System.out.println("Insert positive value, please.");
		}
	}
	
	public void withdraw(int howMuch) {
		if (howMuch > 0) {
			balance = balance - howMuch;
		}
		else {
			System.out.println("Insert positive value, please.");
		}
	}
	
	// Transfer isn't in the javadoc
}