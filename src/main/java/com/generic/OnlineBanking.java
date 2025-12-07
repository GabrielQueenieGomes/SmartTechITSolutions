package com.generic;

import com.page.object.model.PageObjectModel;

public class OnlineBanking {

	
	public void getLogin() {
	
		int b = 20; // local
		System.out.println("This is void.");
		b = 50;
		System.out.println("B value = " + b);
		PageObjectModel obj = new PageObjectModel();
		System.out.println("A value = " + obj.a);
		System.out.println("C value = " + PageObjectModel.c);
	}
	
	public int getAccount() {
		PageObjectModel obj = new PageObjectModel();
		System.out.println("A value = " + obj.a);
		System.out.println("C value = " + PageObjectModel.c);
		System.out.println("Return method");
		return 10;
	}
	
}
