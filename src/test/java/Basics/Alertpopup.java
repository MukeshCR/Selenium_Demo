package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().deleteAllCookies();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert a =driver.switchTo().alert();
		String text =a.getText();
		System.out.println(text);
		String s = a.getText();
		if (s.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message is displayed");
		} else {
			System.out.println("In-correct message is displayed");
		}
		
		Thread.sleep(5000);
		
		a.accept();
		
		driver.quit();
		

	}

}
