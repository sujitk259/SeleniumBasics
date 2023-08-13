package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.out.println("Successfully Launched Chrome Driver...");
		driver.manage().window().maximize();
		System.out.println("Maximized the Chrome Browser....");
		driver.get("https://www.google.com/");
		System.out.println("Title of WebPage :" + driver.getTitle());

		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		// WebElement srcBox = driver.findElement(By.name("q"));
		// WebElement srcBox = driver.findElement(By.className("gLFyf"));
		// WebElement srcBox = driver.findElement(By.tagName("textarea"));

		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Title of  Page :" + driver.getTitle());

		driver.navigate().back();
		System.out.println("Title of  Page :" + driver.getTitle());

		driver.navigate().forward();
		System.out.println("URL of Current Page :" + driver.getCurrentUrl());

		driver.navigate().to("https://www.globalsqa.com/demo-site/");
		System.out.println("Title of Current Page :" + driver.getTitle());

		System.out.println("Closing Browser.....");
		driver.close();

	}

}
