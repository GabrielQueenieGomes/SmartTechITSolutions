package com.interview.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.interactions.Action;
// import org.openqa.selenium.interactions.Actions;

public class SeleniumClick {

	public void getClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.navigate().to("http://uitestingplayground.com/click");
		// driver.navigate().to("https://practice.expandtesting.com/upload");
		driver.navigate().to("https://qa-automation-practice.netlify.app/file-upload.html");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// WebElement uploadBtn = driver.findElement(By.xpath("//*[@id='file_upload']"));
		WebElement uploadBtn = driver.findElement(By.cssSelector("#file_upload"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(uploadBtn));
		
		// click method works only on any type of button
		// driver.findElement(By.xpath("//*[@id='badButton']")).click();
		// driver.findElement(By.xpath("//*[text()='Button That Ignores DOM Click Event']")).click();
		// driver.findElement(By.xpath("//*[@id='fileInput']")).click();
		// driver.findElement(By.xpath("//*[@id='file_upload']")).click();
		// uploadBtn.click();
		// uploadBtn.submit();
		/* JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", uploadBtn);
		*/
		// uploadBtn.sendKeys("C:\\Program Files (x86)\\Microsoft Office\\root\\VFS\\Windows\\SHELLNEW\\EXCEL12.XLSX");
		uploadBtn.sendKeys("C:\\Users\\Queenie\\Downloads\\skills_qa_matrix.docx");
		// uploadBtn.sendKeys("./src/test/resources/[Content_Types].xml");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * driver.findElement(By.xpath("//*[@id='badButton']")).click();
		 * 
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		// driver.navigate().refresh();
		// driver.findElement(By.xpath("//*[text()='Button That Ignores DOM Click Event']")).sendKeys(Keys.F5);
		// driver.findElement(By.xpath("//*[@id='badButton']")).sendKeys(Keys.F5);
		
		// submit method only works on logging in, logging out, & pressing 'Enter' on the keyboard
		// driver.findElement(By.xpath("//*[text()='Button That Ignores DOM Click Event']")).submit();
		
		// WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Button That Ignores DOM Click Event']"));
		// WebElement clickBtn = driver.findElement(By.xpath("//*[@id='badButton']"));
		
		/*
		 * Actions act = new Actions(driver); act.click(clickBtn).perform();
		 * act.clickAndHold(clickBtn).perform(); act.doubleClick(clickBtn).perform();
		 * act.contextClick(clickBtn).perform(); // right-clicking
		 */		
		
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("arguments[0].click();", clickBtn);
		 */
	}
	
	public static void main(String[] args) {
		SeleniumClick obj = new SeleniumClick();
		obj.getClick();
	}
}
