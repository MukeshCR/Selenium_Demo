package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Selenium_Sessions\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/droppable/");

		Actions a = new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable'][1]"))).release().build().perform();

	}
}
