package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

//		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		Alert a = driver.switchTo().alert();
//		a.accept();

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Madurai");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Chennai");
		driver.findElement(By.className("ui-dropdown-trigger ui-state-default ui-corner-right")).click();

	}

}
