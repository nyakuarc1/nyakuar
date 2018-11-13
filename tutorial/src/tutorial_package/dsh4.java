package tutorial_package;

import java;

public class dsh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = {"nya ", "scott ", "esther ", "christian ", "veronica ", "elie ", "elijah ", " max ", " neo"};
		
		double[] raisedMoney = {100,343, 79,391,842.25, 154.50,300.10,.50,60.90,201.25};
		
		boolean[] returnForm = {true, false, false, false, true, true, false, true,false, false};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("name: " + names[i] + " $ " + raisedMoney[i] + " form " + returnForm[i]);
		}
			
			// step 2
			
			double totalAmt = 0;
				for(int i1 = 0; i1 < raisedMoney.length; i1++) {
					totalAmt += raisedMoney[i1];
				}
				
				double avgRaised = totalAmt / names.length;
				
			int bigMoneyCount = 0;
			
			for(int i = 0; i < raisedMoney.length; i++) {
				if (raisedMoney[i] > 200) {
				System.out.println( names [i] + " raised over " + raisedMoney[i]);
				bigMoneyCount++;
				}
		
		}
			
			for(int i = 0; i < returnForm.length; i++) {
			
			if(returnForm[i] == false) {
				System.out.println("total amount raised " + totalAmt);
				System.out.println("average amout raised " + avgRaised);
				
			}
	}
	}
}


