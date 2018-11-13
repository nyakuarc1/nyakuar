package tutorial_package;

public class problem_set_02 {

	public static void main(String[] args) {
		
		double balance = 0; // original balance (0)
		balance = balance + 20; // adding 20
		balance = balance - 25; // subtracting 25
		balance = balance + 30; // adding 30
		balance = balance -25; // subtracting 25
		
		System.out.println(balance); //printing the balance (which is zero)
		
		if (balance < 0) { //if statement for if its more than zero
			System.out.println("we're in the red");
			
		} else if (balance > 0) { // else if ((elif) statement for if its more than zero
			System.out.println("we made a profit!");
		} else { // else statement for if its equal (anything other than < or >)
			System.out.println("we broke even");
			
		}	
			
			
			
			
			
		}

	}


