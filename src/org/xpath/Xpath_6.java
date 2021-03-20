package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Question No 6 "); // Error in it try to solve it
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//div[@id='hc']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("customBtn")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("newFbId")).click();
		driver.findElement(By.id("email")).sendKeys("9659136272");
		driver.findElement(By.id("pass")).sendKeys("ramhumara5.");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Done");

	}

}
