package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		WebElement Account = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(Account).perform();
		System.out.println("Actions performed");

		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("ap_email")).sendKeys("9659136272");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("ap_password")).sendKeys("ramamazon");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Done and Signed in");
	}

}
