package com.interview.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysMenu {
	
	public void getMenu() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.macys.com/");
		List<WebElement> macysmenu=driver.findElements(By.xpath("//*[@id='nav-top-menu']//a"));
		System.out.println(macysmenu.size());
			
		for(int i=0;i<macysmenu.size();i++) {
			System.out.println(macysmenu.get(i).getText());
		}
	driver.quit();
	}
	
	public static void main(String[] args) {
		MacysMenu obj = new MacysMenu();
		obj.getMenu();
	
	}
}
