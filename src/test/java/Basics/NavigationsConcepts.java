package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// simulation process
		driver.get("https://www.google.com/"); // to fetch the particular url

		driver.navigate().to("https://www.amazon.com/"); // to switch from one url to another

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();

	}

}
