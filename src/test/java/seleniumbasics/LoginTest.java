package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.out.println("Successfully Launched Chrome Driver...");
		driver.manage().window().maximize();
		System.out.println("Maximized the Chrome Browser....");
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Title of WebPage :" + driver.getTitle());
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		 driver.findElement(By.partialLinkText("Element")).click();
		System.out.println("Closing Browser.....");
		driver.close();
	}

}
