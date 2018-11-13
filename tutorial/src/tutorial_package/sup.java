package tutorial_package;

import java.util.Random;

public class sup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Superhero = {"T'chala", "slenderman", "scott" , "mr troung", "deadpool"}; // superhero names
		String[] Superpower = {"blackpanther", "speed", "hair", "computerscience", "humor"}; // superhero powers
		boolean[] isHuman = {false, true, false, true, true}; // false true statements for if the superhero is human or not
		int[] firsthero = new int [Superhero.length ]; 
		int[] lasthero = new int [Superhero.length];
		
		Random r = new Random();
		
		System.out.println(Superhero[Superhero.length - 5]); // printing what was stated above
		System.out.println(Superhero[Superhero.length - 1]);
		
		for(int i = 0; i < Superhero.length; i++) {
			System.out.println("superhero: " + Superhero[i]); // prints one of the heros
	}
		for(int i = 0; i < Superpower.length; i++) {
			System.out.println("Superhero Name: " + Superhero[i] +  "   " + "Power: " + Superpower[i] + "    " +"Are they human?: "  + isHuman[i]); // print line
			
		}
		
		for(int i = 0; i < Superhero.length; i++) {
			System.out.println(i + " " + Superhero[i] ); //print function
		}
		for(int i = 0; i < isHuman.length; i++) {
			if (isHuman[i] == false) {
				Superpower[i] = "None";
			}
			System.out.println(Superpower[i]); // print function
			
		}

		
		





	}

}
