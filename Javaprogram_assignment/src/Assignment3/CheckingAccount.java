package Assignment3;

public class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 5000;

	    public CheckingAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " in Checking Account. New balance: ₹" + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance + OVERDRAFT_LIMIT) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " (Overdraft allowed). New balance: ₹" + balance);
	        } else {
	            System.out.println("Withdrawal exceeds overdraft limit!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}



