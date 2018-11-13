package tutorial_package;

import java.util.Scanner;

public class Veronicas_Thrift_Store {
	
	static double price = 0;
	static final double TAX = 0.05;
	static int totalQty = 0; 
	

	public static void main (String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner scanWords = new Scanner(System.in); // scanner for words
		Scanner scanNums = new Scanner(System.in); // scanner for numbers
		double btsAlbumPrice = 1; // album price 
		double iPhoneXPrice = 1000.00; // iphone price
		double vinylnPrice = 423.00; // vinyln price
		double friedChickenPrice = 1000.00; // fried chicken price
		double price = 0;
		
		System.out.print("What is your name?: "); // users name prompt
		String name = scanWords.nextLine(); // store input
		
		System.out.println("\nWelcome to Veronica's Thrift Store, "  + name +""); // print function for the welcome message
		
		System.out.println("\nWhat do you want?\n" // print for what you want
				+ "1. BTS albums\n"
				+ "2. iPhone X\n"
				+ "3. friedChicken \n"
				+ "4. vinyln");
		
		int itemNum = scanNums.nextInt(); // scanner for number
		System.out.print("how many do you want? ");
		
		int qty =scanNums.nextInt();
		
		if (itemNum == 1) {
			price = btsAlbumPrice * qty; // item num 1
			
		}
		
		else if (itemNum == 2) {
				price = iPhoneXPrice * qty;	 //item num 2
				
		}
		
		
		else if (itemNum == 3) {
				price = friedChickenPrice * qty; // item num 3		
		
				
		}
		
		else if (itemNum == 4) {
				price = vinylnPrice * qty;	// item num 4	
		}
		
		else {
			System.out.println("L, we have that, sorry."); // if we don't have that
					
		}	
	
	System.out.println("your total is: " + price ); // print for the total price
	System.out.println("have a great day!"); // ending message


			
		
				
				
		
		
		
		

	}


}