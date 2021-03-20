package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Question No 5");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//a[@class='collapsed'])[28]")).click();
		System.out.println("done");

	}

}
