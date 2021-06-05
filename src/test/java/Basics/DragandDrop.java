package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.automationtesting.in/Static.html");
		
		Actions a = new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//img[@id='angular']")))
				.moveToElement(driver.findElement(By.xpath("//div[@class='dragged']")))
				.release().build().perform();

	}

}
