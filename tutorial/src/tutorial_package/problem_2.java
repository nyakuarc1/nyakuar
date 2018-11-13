package tutorial_package;

public class problem_2 {
	
	public static void main(String[] args) {
	int dogs = 1;
	int cats = 2;
	
	if (dogs > 0 && cats == 0) { 
		if (dogs > 1) {
			System.out.println("dog lover");
		} else { 
			System.out.println("dog person");	
		}
	}
	else if ( cats > 0 && dogs == 0) { 
		if (cats > 1) {
			System.out.println("cat lover");
		} else
			System.out.println("cat person");
		
		System.out.println("meow!");
	} 
	else if (cats > 0 && dogs > 0) {
		if (dogs > cats) {
		System.out.println("i guess you like dogs more");
	} 
	else if (dogs == cats) {
		System.out.println("i guess you love both equally");
	} 
	else {
		System.out.println("i guesss you like cats more");
	}
	}
	else {
		System.out.println("what you dont like pets?");
			
		}
} 
	}
		
	
			
		
	

