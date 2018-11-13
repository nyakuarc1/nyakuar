package tutorial_package;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] employeeName = {"greg", "george", "jill", "john", "basil"};
		int[] wage = {15,16,21,15,22};
		int[] hoursWorked = new int[5];
		
		hoursWorked[0] = 20;
		hoursWorked[0] = 30;
		hoursWorked[0] = 10;
		hoursWorked[0] = 15;
		hoursWorked[0] = 38;
		
		
		for(int i = 0;  i < wage.length; i++) {
			System.out.println("i: " + i + " name: " + employeeName[i] + " \twage: " + wage[i]);
		}
		System.out.println();
		
		for (int i = 0; i < wage.length; i++) {
			System.out.println("Name: " + employeeName[i] + " /tpay " + wage[i] * hoursWorked[i]);
		}

			
	}

}
