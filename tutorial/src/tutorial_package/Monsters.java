package tutorial_package;

import java.util.Scanner;

public class Monsters {
	
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	String[] monster = {"vampire ", "scott ", "mr.suhuh ", "zombie ", "skelenton ", "christian ","obunga "};
	
	System.out.println("Enter player name: ");
	monster[monster.length - 1] = "player: " + input.nextLine();

	int[] coins = new int[monster.length];

	for(int i = 0; i < monster.length; i++) {
		coins[i] = (int)(Math.random() * 8) + 2;
		System.out.println(monster[i] + " has " + coins[i] + " gold coins.");
	}
	String[] abilities = new String[monster.length];
	
	abilities[0] = "fangs";
	abilities[1] = "chwot";
	abilities[2] = "arms";
	abilities[3] = "headtop";
	abilities[4] = "skinning";
	abilities[5] = "yeet";
	abilities[6] = "kpop";
	for(int i = 0; i < monster.length; i++) {
	System.out.println(monster[i] + " will attack with " + abilities[i]);
	}
    int[] hp = new int[monster.length];
       for(int i = 0; i < monster.length; i++) {
	   hp[i] = (int)(Math.random() * 15 + 2);
	}
	
	for(int i = 0; i < monster.length; i++) {
		System.out.println(monster[i] + " has " + hp[i] + " health points ");
		
		System.out.println("the " + monster[2] + " ate a teenager, how many coins did he get? ");
		coins[2] += input.nextInt();
		input.nextLine(); // gets rid of extra enter
		
		System.out.println(monster[2] + " morphs into what: ");
		monster[2] = input.nextLine();
		
		System.out.println(" The monster is a : " +monster[2]);
		
		int totalCoins = coins [monster.length-1];
		int turns = 0;
		
		while(hp[hp.length-1] > 0) {
			int randomMonster = (int)(Math.random() * monster.length);
			if(randomMonster != monster.length-1) {
				int hitChance = (int)(Math.random() * 2);
				
				if(hitChance % 2 == 0) { //
					int randomDmg = (int)(Math.random() * 2 + 1);
					
					hp[monster.length - 1] -= randomDmg;
					System.out.println(monster[randomMonster] + " hit you for " + randomDmg + " hp! " + hp[monster.length-1] + " HP left. ");
				}
				
				else 
					System.out.println(" player hits with " + abilities[monster.length - 1] + "  " + monster[randomMonster] + " runs away. It left " + coins[randomMonster] + "coins");
				
				totalCoins += coins[randomMonster];
			}
			
			
			turns++;
		}
		
		System.out.println(" you run away with " + totalCoins + " coins " + " and lasted " + turns + " turns");
	}
}//end main

}// end class


