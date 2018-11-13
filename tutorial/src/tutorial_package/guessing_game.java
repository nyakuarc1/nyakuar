package tutorial_package;

import java.util.Scanner;

public class guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanWords = new Scanner(System.in); // scanner for words
		Scanner scanNums = new Scanner(System.in); // scanner for numbers
		
		System.out.print("What's your name?: "); // users name prompt
		
		Random r = new Random();
		int answer = r.nextInt(101);

	}

}
