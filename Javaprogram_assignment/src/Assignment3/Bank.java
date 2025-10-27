package Assignment3;

public class Bank {

		    private static int totalAccounts = 0; // shared among all instances

		    public static void incrementAccounts() {
		        totalAccounts++;
		    }

		    public static int getTotalAccounts() {
		        return totalAccounts;
		    }
		}
		
		
		