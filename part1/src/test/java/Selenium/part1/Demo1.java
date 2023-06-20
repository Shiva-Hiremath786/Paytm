package Selenium.part1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1{
	//public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://tickets.paytm.com/flights/");
		
		driver.manage().window().maximize();
	
		driver.get("https://tickets.paytm.com/flights/");

		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).click();
		Thread.sleep(3000);
		System.out.println("Successfully clicked on From Option");
		
		driver.findElement(By.xpath("//span[contains(text(),\"BLR\")]")).click();
		Thread.sleep(3000);
		System.out.println("Selected From City");
		
		driver.findElement(By.xpath("(//input[@id=\"text-box\"])[2]")).click();
		Thread.sleep(3000);
		System.out.println("Successfully clicked on To Option");
		
		driver.findElement(By.xpath("//span[contains(text(),\"DEL\")]")).click();
		Thread.sleep(3000);
		System.out.println("Selected To City");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"Departure-Date\"]")).click();
		driver.findElement(By.xpath("(//div[text()='25'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[contains(text(),\"Search\")])[1]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300);");
		
		driver.findElement(By.xpath("(//a[contains(text(),\"Flight Details\")])[1]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300);");
		
		driver.findElement(By.xpath("(//a[contains(text(),\"Book \")])[1]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 300);");
		
		
		for(String i:driver.getWindowHandles()) {
			driver.switchTo().window(i);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Login to continue →']")).click();
		Thread.sleep(3000);
			
		
		driver.close();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");

	}


	
}
