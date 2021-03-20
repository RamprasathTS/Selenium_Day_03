package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		System.out.println("clicked");

		Thread.sleep(10000);
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(login).perform();
		System.out.println("Action Performed");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Sign Up']")).click();
		System.out.println("Sign Up Clicked");

		driver.findElement(By.xpath("//span[text()='Existing User? Log in']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9659136272");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ramflipkart");
		driver.findElement(By.xpath("(//Button[@type='submit'])[2]")).click();
		System.out.println("Done and Finally Sign-up");

	}

}
