package com.testrun;

import com.generic.OnlineBanking;

public class TestRun extends OnlineBanking { // multi-level relations

public static void main(String[] args) {
	// basic owner class
	OnlineBanking obj = new TestRun();
	obj.getAccount();
		
 //obj.getLogin().getAccount(); // mid-level java = using current class
	
	// basic java mathod calling
		// OnlineBanking obj = new OnlineBanking();
	//int returnValue = obj.getAccount();
		//System.out.println(returnValue);
		//OnlineBanking obj2 = new TestRun();
		//obj2.getLogin().getAccount(); // mid-level java = using both classes
		
// factory design: obj.getLogin().getAccount();
	}
}
