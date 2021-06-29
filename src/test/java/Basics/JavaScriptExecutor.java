package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utiltiy.JavaExecutor_Methods;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='btnLogin']"));

		JavaExecutor_Methods.flash(loginbutton, driver);// highlighting the element
		JavaExecutor_Methods.drawBorder(loginbutton, driver); // border for element
		JavaExecutor_Methods.generateAlert(driver, "Username and password cannot be Empty");//generating an alert
		JavaExecutor_Methods.clickElementByJS(loginbutton, driver);//clicking element by JS
		JavaExecutor_Methods.refreshBrowserByJS(driver); // refreshing the page by JS
		JavaExecutor_Methods.getPageInnerText(driver); // to get page inner text
		JavaExecutor_Methods.getTitleByJS(driver); // get title
		JavaExecutor_Methods.scrollIntoView(loginbutton, driver); //scroll in to view
		JavaExecutor_Methods.scrollPageDown(driver); // page scroll down
	}
}
