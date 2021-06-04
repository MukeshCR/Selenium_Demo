package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload']"))
				.sendKeys("C:\\Users\\mukesh\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
