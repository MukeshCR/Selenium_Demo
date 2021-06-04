package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser_and_verify {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("OrangeHRM")) {
			System.out.println("Correct page is displayed");
		} else {
			System.out.println("In-Correct page is dispayed");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
