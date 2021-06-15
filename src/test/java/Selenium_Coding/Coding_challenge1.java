package Selenium_Coding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding_challenge1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String xpath_currentpop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_Today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_This_Year_pop = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_Today_and_This_Year_pop = "//div[text()='Today' or text()='This year']//parent::div//span[@class='rts-counter']";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.worldometers.info/world-population/");

		System.out.println("****************Today population count***********************");
		PopulationData(xpath_Today_pop);
		System.out.println("****************Today and This year population count***********************");
		PopulationData(xpath_Today_and_This_Year_pop);
		System.out.println("===========================================================================");

	}

	public static void PopulationData(String locator) throws InterruptedException {
		int count = 1;
		while (count <= 20) {
			System.out.println(count + "sec");
			if (count == 21)
				break;
			List<WebElement> pop = driver.findElements(By.xpath(locator));
			for (WebElement we : pop) {
				System.out.println(we.getText());
			}
			Thread.sleep(1000); // to wait for exact one second
			count++;

		}
	}
}
