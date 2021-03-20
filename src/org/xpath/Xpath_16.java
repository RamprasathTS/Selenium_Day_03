package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='View Account']")).click();
		driver.findElement(By.xpath("(//div[text()='Edit profile'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='CHANGE'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6380546174");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
