package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver(83).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement Course = driver.findElement(By.xpath("(//a[@href='course.php'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(Course).perform();

		driver.findElement(By.xpath("(//img[@width='275'])[1]")).click();

	}

}
