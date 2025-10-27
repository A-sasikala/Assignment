package Assignment3;

final class Transaction {
	    private final double transactionFee = 10.0; 

	    public final void performTransaction(Account account, String type, double amount) {
	        System.out.println("\n--- Transaction Start ---");
	        System.out.println("Transaction Type: " + type);
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount);
	        } else {
	            System.out.println("Invalid transaction type!");
	            return;
	        }

	       
	        account.withdraw(transactionFee);
	        System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
	        System.out.println("--- Transaction Completed ---\n");
	    }
	}

	
	






	


