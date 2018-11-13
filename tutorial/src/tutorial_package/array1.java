package tutorial_package;

import java.util.Random;

public class array1 {
	

	public static void main(String[] args) {
		
		String[] nameArray = {"christian ", "tyrone ", "uniqua ", "scott ", "nya ","mr.truong "};
		int[] gradesArray = new int[nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name:" + nameArray[i] + "Grade:" + gradesArray[i]);
			
		} 
			
			Random r = new Random();
			
			for(int i = 0; i < nameArray.length; i++) {
				gradesArray[i] = r.nextInt(101);
			}
			
			for(int i = 0; i < nameArray.length; i++)
				System.out.println("Name:" + nameArray[i] + "Grade:" + gradesArray[i]);
			
		
	
	gradesArray[5] = 85;
	
	for(int i = 0 ; i < nameArray.length; i++) {
		System.out.println("Name:" + nameArray[i] + "Grade:" + gradesArray[i]);
		
		
	}
		for(int i = 0 ; i < nameArray.length; i++) {
			avg += gradesArray[i];
		}
			avg = avg/gradesArray.length;
		
		System.out.println("class average:" + avg);
		}
		
 }

	

