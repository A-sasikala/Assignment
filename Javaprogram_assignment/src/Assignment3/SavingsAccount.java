package Assignment3;

public class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.03; 

	    public SavingsAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount + (amount * INTEREST_RATE);
	        System.out.println("Deposited ₹" + amount + " with interest. New balance: ₹" + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + ". New balance: ₹" + balance);
	        } else {
	            System.out.println("Insufficient balance in Savings Account!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}



