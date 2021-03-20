package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Question No:1");
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='contact.php']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("ram");
		driver.findElement(By.className("form-control")).sendKeys(" Prasath");
		driver.findElement(By.id("InputName")).sendKeys("T S");
		driver.findElement(By.id("InputEmail1")).sendKeys("ramthumatin@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9659136272");
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.xpath("//select[@name='branch']")).click();
		driver.findElement(By.xpath("//button[@name='submit']")).click();

	}

}
