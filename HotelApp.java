package facadePattern;
import java.util.*;

public class HotelApp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        while (true) {
        	System.out.println("[1] Valet parking/fetching");
            System.out.println("[2] Housekeeping");
            System.out.println("[3] Luggage cart/s request");
            System.out.println("[4] Exit");
            System.out.print("Select the hotel service you need: ");
            Integer choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
			case 1:
				System.out.print("Enter your vehicle's plate number: ");
                String plateNumber = input.nextLine();
				HotelService valetHS = new Valet ();
                FrontDesk valetFD = new FrontDesk (valetHS);
                valetFD.selectService(plateNumber);
				System.out.println();
				break;
			case 2:
				System.out.print("Enter room number: ");
                String roomNumber = input.nextLine();
				HotelService housekeepingHS = new HouseKeeping ();
                FrontDesk housekeepingFD = new FrontDesk (housekeepingHS);
                housekeepingFD.selectService(roomNumber);
				System.out.println();
				break;
			case 3:
				System.out.print("Enter the number of cart/s you need: ");
                String numberOfCarts = input.nextLine();
				HotelService cartHS = new Cart ();
                FrontDesk cartFD = new FrontDesk (cartHS);
                cartFD.selectService(numberOfCarts);
				System.out.println();
				break;
			case 4:
            	System.out.print("Terminating program...");
            	System.exit(0);
			default:
				System.out.println("Invalid number. Kindly choose again.");
				System.out.println();
            	continue;
            }//switch
        }//while
	}//main
}

