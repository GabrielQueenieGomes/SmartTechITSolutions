package com.interview.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaLooping {

	public static void main(String[] args) {
		System.out.println("Hello$#@12345"); // string
		System.out.println(12345); // integer
		System.out.print(12.75); // double
		System.out.println("12345");
		
		System.out.println("Positive for loop");
		for(int i = 0;i <= 100;i++) {
			System.out.println(i);
		}
		
		System.out.println("Negative for loop");
for(int i = 100;i >= 0;i--) {
	System.out.println(i);
		}

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.costco.com/");
List<WebElement> menubar=driver.findElements(By.xpath("//*[@class='mui-jyh1ez']//a")); // 1 of 12

System.out.println(menubar.size()); // end point AKA total count

for(int i=0;i<menubar.size();i++) {
	// num = i
	// list = ListName.get(i)
	System.out.println(menubar.get(i).getText());
}
driver.quit();

driver.manage().window().maximize();
driver.get("https://www.macys.com/");
List<WebElement> macysmenu=driver.findElements(By.xpath("//*[@id='nav-top-menu']//a"));
System.out.println(macysmenu.size());
for(int i=0;i<macysmenu.size();i++) {
 System.out.println(macysmenu.get(i).getText());
}
driver.quit();

driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
List<WebElement> awsmenu=driver.findElements(By.xpath("//*[@id='nav-xshop']//a"));
System.out.println(awsmenu.size());
for(int i=0;i<awsmenu.size();i++) {
 System.out.println(awsmenu.get(i).getText());
}
driver.quit();

	}

}
