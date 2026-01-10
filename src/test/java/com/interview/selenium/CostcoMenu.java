package com.interview.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CostcoMenu {

	public void getMenu() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.costco.com/");
		List<WebElement> menubar=driver.findElements(By.xpath("//*[@class='mui-jyh1ez']//a")); // 1 of 12

		System.out.println(menubar.size()); // end point AKA total count

		for(int i=0;i<menubar.size();i++) {
			// num = i
			// list = ListName.get(i)
			System.out.println(menubar.get(i).getText());
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].style.border='3px solid red'", menubar.get(i));
			Actions act = new Actions(driver);
			
			if(menubar.get(i).getText().contains("Optical")) {
				System.out.println("Found optical!");
				act.moveToElement(menubar.get(i)).build().perform();
			}
		}


		// driver.quit();
	}
	
	public static void main(String[] args) {
		CostcoMenu obj = new CostcoMenu();
		obj.getMenu();
	
	}
}
