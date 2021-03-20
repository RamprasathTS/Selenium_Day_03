package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Question No 4"); // isssue with click button

		driver.get("https://www.toolsqa.com/selenium-training/?q=HomePage");
		driver.manage().window().maximize();

		// driver.findElement(By.className("tp-button orange large")).click();
		// driver.findElement(By.xpath("//a[@class='tp-button orange large']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Ramprasath TS");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramthumatin@gmail.com");
//		driver.findElement(By.className(
//				"wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email"))
//				.sendKeys("ramthumatin@gmail.com");
//		driver.findElement(By.xpath(
//				"//input[@class='wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email']"))
//				.sendKeys("ramthumatin@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9659136272");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("India");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Madurai");
		driver.findElement(By.xpath("//textarea[@name='your-message']"))
				.sendKeys("Hi, This is Ramprasath. i am practising selenium automation tool by using your website");

	}

}
