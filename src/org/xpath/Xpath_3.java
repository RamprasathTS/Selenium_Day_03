package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("Question No : 3");

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ramprasath");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("T S");
//		driver.findElement(By.xpath("//textarea[@rows='3']"))
//				.sendKeys("24,Old East Madurai Statin Road,Balarengapuram,Madurai-625009");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramthumatin@gmail.com");
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9659136272");
//
//		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
//		// Thread.sleep(10000);
//		// driver.findElement(By.xpath("//label[@class='checks'][1]")).click();
//
//		// driver.findElement(By.xpath("//label[@class='checks'][2]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("checkbox1")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("checkbox2")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("checkbox3")).click();
//
//		WebElement Skills = driver.findElement(By.id("Skills"));
//		Select s = new Select(Skills);
//		s.selectByVisibleText("Java");
//		System.out.println("Skills Done");
//
//		WebElement Countries = driver.findElement(By.id("countries"));
//		Select a = new Select(Countries);
//		a.selectByVisibleText("India");
//		System.out.println("Countries Done");
//
//		driver.findElement(By.id("firstpassword")).sendKeys("qwerty5.123");
//		driver.findElement(By.id("secondpassword")).sendKeys("qwerty5.123");
//		System.out.println("Password Done");
//		// yearbox.//select[@placeholder='Month'].daybox. firstpassword. secondpassword
//
//		WebElement year = driver.findElement(By.id("yearbox"));
//		Select b = new Select(year);
//		b.selectByVisibleText("1995");
//		System.out.println("Year Done");
//
//		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
//		Select c = new Select(month);
//		c.selectByVisibleText("September");
//		System.out.println("Month Done");
//
//		WebElement Day = driver.findElement(By.id("daybox"));
//		Select d = new Select(Day);
//		d.selectByVisibleText("15");
//		System.out.println("Day Done");

//		driver.findElement(By.xpath("//span[@role='presentation']")).click();
//		driver.findElement(By.xpath("//Span[@title='India']")).click();
//		System.out.println("Select Country Done");
//
//		driver.findElement(By.id("msdd")).click();
//		driver.findElement(By.xpath("//div[text()='English']")).click();
//		System.out.println("Languages Done");

//		driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"))
//				.sendKeys("Arabic"); //
//		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
//		driver.findElement(By.xpath("//button[@id='Button1'] ")).click();

		driver.findElement(By.className("fa fa-facebook-square")).click();

	}

}
