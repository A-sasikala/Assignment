package Assignment3;

abstract class Account {
	//abstract class Account {
	    protected String accountHolderName;
	    protected double balance;

	    public Account(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	        Bank.incrementAccounts(); 
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    
	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Current Balance: ₹" + balance);
	    }
	}



