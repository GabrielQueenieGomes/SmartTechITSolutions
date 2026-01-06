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
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> awsmenu=driver.findElements(By.xpath("//*[@class='nav-fill']//a"));
		System.out.println(awsmenu.size());
		
		for(int i=0;i<awsmenu.size();i++) {
		 System.out.println(awsmenu.get(i).getText());
		}
		
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonMenu obj = new AmazonMenu();
		obj.getMenu();
	}

}
