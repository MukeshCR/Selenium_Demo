package Basics;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssvalues {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		WebElement element = driver.findElement(By.xpath("//h1[contains(.,'Bootstrap Date Pickers Example')]"));
		// to get values of the element
		String bg = element.getAttribute("background");
		String sy = element.getAttribute("style");
		String bg_col = element.getAttribute("background-color");
		String sty = element.getCssValue("style");
		String col = element.getCssValue("color");
		// printing those values
		System.out.println(bg);
		System.out.println(sy);
		System.out.println(bg_col);
		System.out.println(sty);
		System.out.println(col);
	}

}
