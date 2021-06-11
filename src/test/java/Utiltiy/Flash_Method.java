package Utiltiy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flash_Method {

	public static void Flash(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundcolour");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + " '", element);

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}

		Thread.sleep(5000);

		driver.close();
	}
}
