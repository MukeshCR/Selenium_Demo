package Selenium_Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding_challenge2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='a-link-normal feed-carousel-control feed-right']"));
		ele.click();
		for (int i = 0; i <= 3; i++) {
			Thread.sleep(500);
			ele.click();
		}
	}
}
