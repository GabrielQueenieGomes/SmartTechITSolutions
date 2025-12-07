package com.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

WebDriver driver;

public class OnlineBanking implements SmartBanking { //mid-level polymorphism rules
	driver = new WebDriver();
	//rule 1 = number of parameters
	//rule 2 = data type
	//rule 3 = position of data types

	// polymorphism via override
	@Override
	public void getLogin(String b, double d) {
		// TODO Auto-generated method stub
		
	} // add any variable  parameter = 0

	@Override
	public void getLogout(int a) {
		driver.findElement(By.xpath("//*[text()='Logout'"));
		
	}

	@Override
	public void getAccount(double b, String d) { // 2 parameters
		driver.findElement(By.xpath("//*[text()='Account'"));
		
		List<WebElement> rows = driver.findElement(By.xpath("//table/tbody/tr")); // column 3 * row 2 = 6 columns
		System.out.println("Row count = " + rows.size());
		
		List<WebElement> columns = driver.findElement(By.xpath("//table/tbody/tr/td"));
		System.out.println("Columns count = " + columns.size());
		
		System.out.println("First value + " + columns.get(0).getText());
	} // basic java not allowed
	
	// overloading = repeatedly using same things under same class

	// single-level inheritance, 2-class relationship

	
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
