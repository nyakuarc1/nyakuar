package tutorial_package;

import java.util.Scanner;

import java.util.Random;


public class Tut1 {
	
	private static void printName() {
		
		for( int i = 0; i < 100; i++) {
			System.out.println("the past tense of yeet is yote");
			
		}
		
		
	}

	public static void main(String[] args) {
		int varNum1;
		varNum1 = 10; 
		
		int varNum2 = 25;
		
		int varNum3;
		varNum3 = varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName();
		
		
if (varNum3 > 5) {
	System.out.println("less"); }
	
	else 
		System.out.println ("less");
		
		String inData;
		Scanner scan = new Scanner (System.in );
		System.out.println("enter the data" );
		inData = scan.nextLine();
	
		System.out.println("you entered:" + inData );
		
		
	int num;
	int square;
	System.out.println("Enter an integer:");
	num = scan.nextInt();
	square = num * num ; // complete the square 
	
	System.out.println ("the square of " + num + " is " + square);
	
		Random rand = new Random();
		
		int randomNum = rand.nextInt(11) + 5;
		
		System.out.println(randomNum);
		
		int bankBalance = 500; // base value
		bankBalance = bankBalance + 250; //deposit 
		bankBalance = bankBalance - 100; //withdrawal 
		System.out.println ("Your current bank balance is:" + bankBalance);
		
	
		String s = "Mona Lisa";
		System.out.println(s.length());
	
}
		
		

	}



