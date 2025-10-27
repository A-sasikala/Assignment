package Assignment4;

import java.util.Scanner;

//import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			     Scanner sc = new Scanner(System.in);
			     
			     int choice = sc.nextInt();   // 1, 2, or 3
			     int hours = sc.nextInt();
			     double costPerHour = sc.nextDouble();

			     Airfare flight = null;

			     // Choosing the airline
			     switch (choice) {
			         case 1:
			             flight = new AirIndia(hours, costPerHour);
			             break;
			         case 2:
			             flight = new KingFisher(hours, costPerHour);
			             break;
			         case 3:
			             flight = new Indigo(hours, costPerHour);
			             break;
			         default:
			             System.out.println("Invalid choice");
			             System.exit(0);
			     }

			     
			     flight.display();
			 }
			


	}


