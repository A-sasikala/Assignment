package Assignment3;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        
		        SavingsAccount s1 = new SavingsAccount("kavi", 1000);
		        CheckingAccount c1 = new CheckingAccount("ravi", 2000);

		        
		        Transaction t = new Transaction();
		        t.performTransaction(s1, "deposit", 500);
		        t.performTransaction(c1, "withdraw", 1500);

		        
		        s1.displayAccountDetails();
		        c1.displayAccountDetails();

		        System.out.println("\nTotal bank accounts created: " + Bank.getTotalAccounts());
		    }
		

	}


