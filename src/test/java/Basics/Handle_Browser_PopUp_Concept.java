package Basics;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Browser_PopUp_Concept {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh\\eclipse-workspace\\Demo_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
		Thread.sleep(5000);

		// To handle all the Multiple windows
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String childwindowid = it.next();
		System.out.println("child window id: " + childwindowid);

		String parentwindow = it.next();
		System.out.println("parent window id:" + parentwindow);

		driver.switchTo().window(childwindowid);
		System.out.println("child window popup title " + driver.getTitle());
		Thread.sleep(5000);
		driver.close();

		driver.switchTo().window(parentwindow);
		System.out.println("parent window popup title" + driver.getTitle());

	}
}
