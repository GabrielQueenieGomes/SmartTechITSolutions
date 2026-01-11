package com.interview.selenium;

import java.time.Duration;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Set;
// import java.util.concurrent.atomic.AtomicInteger;

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
		for(int i = 0; i < 5; i++) {
		// clickBtn.click(); // 2
		// clickBtn.click(); // 3
		// clickBtn.click(); // 4
		// Total = 4
		// clickBtn.click();
			clickBtn.click();
		}
		
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

//		List<String> myList = new LinkedList<>(allWindows);
//		int count = 0;
		// AtomicInteger count = new AtomicInteger();
//		
		/*
		 * myList.forEach(eachWindow -> { // lambda = void method for loop
		 * System.out.println(eachWindow); if(!eachWindow.equals(parentWindow)) {
		 * count++; } });
		 */
		
//		for(int i = 0; i < myList.size(); i++) {
//			System.out.println("Each window from total = " + myList.get(i));
//			
//			if(!myList.get(i).equals(parentWindow)) {
//				count++;
//				System.out.println("Child window from total = " + myList.get(i));
//				
//				if (count == 3) {
//					System.out.println("Child count = " + count);
//					System.out.println("Loop index = " + i);
//					System.out.println("Switch window = " + myList.get(i));
//					driver.switchTo().window(myList.get(i));
//					driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
//				}
//				
//			}
//			
//		}
//		
//		List<String> onlyChild = new ArrayList<>();
//		int i = 0;
//		if(!myList.get(i).equals(parentWindow)) {
//			onlyChild.add(myList.get(i));
//		}
//		
//		for(i = 0; i < myList.size(); i++) {
//			if (i == 2) {
//				System.out.println("Only child from child list = " + onlyChild.get(i) + "Index = " + i);
//				driver.switchTo().window(onlyChild.get(i));
//				System.out.println("Child window found = " + onlyChild.get(i));
//				driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
//			}
//		}
		
		// System.out.println("Total children = " + count);
		
//		String parentWindow = driver.getWindowHandle();
//		System.out.println("Parent Window = " + parentWindow);
		
		allWindows.stream().skip(allWindows.size()-1).forEach(child -> {
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
		});
		
//		Set<String> allWindows = driver.getWindowHandles();
//		int count = 0;
//		for(String eachWindow: allWindows) {
//			System.out.println("All windows = " + eachWindow);
			// count++;
			
			// if(!eachWindow.equals(parentWindow)) {
				// if (count == 4) {
//			driver.switchTo().window(eachWindow);
//			driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
				// }
			// }
//		}
	}
	
	public static void main(String[] args) {
		MultipleWindows obj = new MultipleWindows();
		obj.getWindows();
	}

}
