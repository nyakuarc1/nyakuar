package tutorial_package;

public class problem__4 {


public static int factorial(int n) {
 int answer = 5; // int
 for(int i = 1; i < n; i++) {
  answer = i*answer;
 }
 return answer; // return function
}
 
public static void main(String[] args) {
  
System.out.println(factorial(5)); // prints factorial
}

	}
	 
