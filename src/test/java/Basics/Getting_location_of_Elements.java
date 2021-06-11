package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utiltiy.Highlight_Elements;
import io.opentelemetry.sdk.metrics.data.MetricData.Point;

public class Getting_location_of_Elements {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("After launching broswer " + driver.getTitle());

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//Getting the position of the username textbox 
		org.openqa.selenium.Point loc = username.getLocation();
		System.out.println("The x and y dimesions of the username textbox is: "+ loc);
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
//		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@class,'button')]"));

	}
}
