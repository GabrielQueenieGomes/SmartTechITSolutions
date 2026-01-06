package com.interview.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenu {
	
	public void getMenu() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.com/");
		List<WebElement> awsmenu=driver.findElements(By.xpath("//*[@class='nav-fill']//a"));
		// List<WebElement> awsmenu=driver.findElements(By.xpath("//div[@id='nav-xshop']//a/span"));
		System.out.println(awsmenu.size());
		
		for(int i=0;i<awsmenu.size();i++) {
		 System.out.println(awsmenu.get(i).getText());
		}
		
		for (WebElement menu : awsmenu) {
			// System.out.println("Text: [" + menu.getText() + "] | Link: " + menu.getAttribute("href"));
			
			  String text = menu.getText().trim(); if (!text.isEmpty()) {
			  System.out.println(text); }
			 
		}

		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonMenu obj = new AmazonMenu();
		obj.getMenu();
	}

}
