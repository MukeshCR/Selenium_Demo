package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utiltiy.Highlight_Elements;

public class Highlight {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println( "After launching broswer "+ driver.getTitle());

		// Call the highlighterMethod and pass webdriver and WebElement which you want
		// to highlight as arguments.
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Highlight_Elements.highLighterMethod(driver, username);
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Highlight_Elements.highLighterMethod(driver, password);
		password.sendKeys("admin123");

		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@class,'button')]"));
		Highlight_Elements.highLighterMethod(driver, loginbtn);
		loginbtn.click();
		
		System.out.println( "After login "+ driver.getCurrentUrl());
	}

}
