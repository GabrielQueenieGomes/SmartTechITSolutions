package com.generic;

import com.page.object.model.PageObjectModel;

public class OnlineBanking implements SmartBanking {

	// polymorphism via override
	@Override
	public void getLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAccount() {
		// TODO Auto-generated method stub
		
	} // single-level inheritance, 2-class relationship

	
	/*
	 * public OnlineBanking getLogin() {
	 * 
	 * int b = 20; // local System.out.println("This is void."); b = 50;
	 * System.out.println("B value = " + b); PageObjectModel obj = new
	 * OnlineBanking(); //obj.a = 66; System.out.println("A value = " + obj.getA());
	 * //PageObjectModel.c = 99; System.out.println("C value = " +
	 * PageObjectModel.getC()); return null; }
	 * 
	 * public int getAccount() { OnlineBanking obj = new OnlineBanking();
	 * System.out.println("A value = " + obj.getA());
	 * System.out.println("C value = " + PageObjectModel.getC());
	 * System.out.println("Return method"); return 10; }
	 */
	
}
