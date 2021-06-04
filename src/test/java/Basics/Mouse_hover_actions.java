package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		//performing mouse hover actions 
		// 1st mouse hover action on element
		
		WebElement element = driver.findElement(By.xpath("//b[normalize-space()='Performance']"));

		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Employee Trackers']")).click();
		
		// 2nd mouse hover action on element
		WebElement element2 = driver.findElement(By.xpath("//b[normalize-space()='Recruitment']"));
		a.moveToElement(element2).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Vacancies']")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
