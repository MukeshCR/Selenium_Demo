package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_to_Application {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		// printing the page title
		String s = driver.getCurrentUrl();
		System.out.println("The current title of the page is" + s);

		// verification
		if (s.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("Home page is Displayed");
		} else {
			System.out.println("Incorrect page is displayed");
		}

		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//b[normalize-space()='Performance']"));

		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

		Thread.sleep(5000);

		driver.quit();
	}

}
