package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		Thread.sleep(10000);
		WebElement sigin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(sigin);

		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[text()='login']")).click();

		driver.findElement(By.xpath("(//span[text()='Facebook'])[1]")).click();

		driver.findElement(By.id("email")).sendKeys("9659136272");
		driver.findElement(By.id("pass")).sendKeys("ramhumara5.");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}