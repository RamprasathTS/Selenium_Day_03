package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		driver.findElement(By.id("firstName")).sendKeys("Ramprasath");
		driver.findElement(By.id("lastName")).sendKeys("TS");
		driver.findElement(By.id("username")).sendKeys("ramthumatinn@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("qwerty5.123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("qwerty5.123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("Completed 1ST Page");

		driver.findElement(By.className("EIlDfe")).sendKeys("9659136272");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.xpath("//span[text()='Verify']")).click();

		driver.findElement(By.id("phoneNumberId")).sendKeys("9659136272");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ramthumatin@gmail.com");

		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		s.selectByVisibleText("September");
		System.out.println("Drop-down method Executed");

		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("15");
		driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("1995");

		WebElement gender = driver.findElement(By.id("gender"));
		Select a = new Select(gender);
		a.selectByValue("1");

	}

}
