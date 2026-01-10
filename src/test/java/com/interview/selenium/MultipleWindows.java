package com.interview.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public void getWindows() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/popup.php"); // 1
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Click Here']"));
		System.out.println(clickBtn);
		clickBtn.click(); // 2
		clickBtn.click(); // 3
		clickBtn.click(); // 4
		// Total = 4
		
		String parentWindow = driver.getWindowHandle(); // 1st window or parent
		System.out.println("Parent window = " + parentWindow);
		// 9ADE171486D9712A0579409083217364 = String
		
		Set<String> allWindows = driver.getWindowHandles(); // all windows = 4 (P & C)

		// All Windows = P & C
		// P = getWindowHandle() = 1
		// Child = All window(getWindowHandles()) - P = 3
	
		// basic not work = set do not have get()
		for(String eachWindow:allWindows) {
			// System.out.println("All Each window = " + eachWindow);
			if(!eachWindow.equals(parentWindow)) { // remove parent
				System.out.println("Child window = " + eachWindow);
				driver.switchTo().window(eachWindow);
				driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
			}
			
		}

	}
	
	public static void main(String[] args) {
		MultipleWindows obj = new MultipleWindows();
		obj.getWindows();
	}

}
