package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Questin No:16");
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@class='bginput'])[1]")).sendKeys("ram");
		driver.findElement(By.xpath("(//input[@class='bginput'])[2]")).sendKeys("prasath");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		// driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		System.out.println("DoNE");

	}

}
