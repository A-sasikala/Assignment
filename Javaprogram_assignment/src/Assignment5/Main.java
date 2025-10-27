package Assignment5;

import java.util.*;

//import Assignment3.TicketBooking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner sc = new Scanner(System.in);

		     
		     String bookingInput = sc.nextLine();
		     String[] parts = bookingInput.split(",");

		     String stageEvent = parts[0];
		     String customer = parts[1];
		     int noOfSeats = Integer.parseInt(parts[2]);

		     TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

		     int choice = sc.nextInt();
		     sc.nextLine(); 

		     switch (choice) {
		         case 1: 
		             double amount1 = sc.nextDouble();
		             booking.makePayment(amount1);
		             break;

		         case 2: 
		             double amount2 = sc.nextDouble();
		             sc.nextLine(); 
		             String walletNumber = sc.nextLine();
		             booking.makePayment(amount2, walletNumber);
		             break;

		         case 3: 
		             String holderName = sc.nextLine();
		             double amount3 = sc.nextDouble();
		             sc.nextLine(); 
		             String cardType = sc.nextLine();
		             String ccv = sc.nextLine();
		             booking.makePayment(holderName, amount3, cardType, ccv);
		             break;

		         default:
		             System.out.println("Invalid choice");
		     

	}
        //sc.close;
}
}

