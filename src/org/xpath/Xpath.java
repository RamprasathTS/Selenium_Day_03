package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Selenium Mandatory\\Webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1)for dropdown button clicked after that how to select the value

		/*
		 * System.out.println("Question No:1");
		 * driver.get("http://www.greenstechnologys.com/");
		 * 
		 * driver.findElement(By.xpath("//a[@href='contact.php']")).click();
		 * driver.findElement(By.name("name")).sendKeys("ram");
		 * driver.findElement(By.className("form-control")).sendKeys(" Prasath");
		 * //driver.findElement(By.id("InputName")).sendKeys("T S");
		 * driver.findElement(By.id("InputEmail1")).sendKeys("ramthumatin@gmail.com");
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(
		 * "9659136272"); driver.findElement(By.className("form-control")).click();
		 * driver.findElement(By.xpath("//select[@name='branch']")).click();
		 */

		System.out.println("Question No:2");

		/*
		 * driver.get("https://www.facebook.com/");
		 * 
		 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9659136272")
		 * ; driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "ramhumara5.");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 */

		/*
		 * System.out.println("Question No : 3");
		 * 
		 * driver.get("http://demo.automationtesting.in/Register.html");
		 * 
		 * driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(
		 * "Ramprasath");
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("T S");
		 * driver.findElement(By.xpath("//textarea[@rows='3']")).
		 * sendKeys("24,Old East Madurai Statin Road,Balarengapuram,Madurai-625009");
		 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
		 * "ramthumatin@gmail.com");
		 * driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9659136272");
		 * driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		 * driver.findElement(By.xpath("//label[@class='checks'][1]")).click(); //
		 * driver.findElement(By.xpath("//label[@class='checks'][2]")).click(); //
		 * driver.findElement(By.
		 * xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"
		 * )).sendKeys("Arabic"); //
		 * driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		 * driver.findElement(By.xpath("//button[@id='Button1'] ")).click();
		 */

		/*
		 * System.out.println("Question No 4"); // isssue with click button
		 * 
		 * driver.get("https://www.toolsqa.com/selenium-training/?q=HomePage");
		 * 
		 * // driver.findElement(By.className("tp-button orange large")).click(); //
		 * driver.findElement(By.xpath("//a[@class='tp-button orange large']")).click();
		 * driver.findElement(By.xpath("(//input[@type='text'])[4]")).
		 * sendKeys("Ramprasath TS"); // driver.findElement(By.
		 * className("wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email"
		 * )).sendKeys("ramthumatin@gmail.com"); driver.findElement(By.
		 * xpath("//input[@class='wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email']"
		 * )).sendKeys("ramthumatin@gmail.com");
		 * driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(
		 * "9659136272");
		 * driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("India");
		 * driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Madurai"
		 * ); driver.findElement(By.xpath("//textarea[@name='your-message']")).
		 * sendKeys("Hi, This is Ramprasath. i am practising selenium automation tool by using your website"
		 * );
		 */

		/*
		 * System.out.println("Question No 5");
		 * driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		 * 
		 * driver.findElement(By.xpath("//button[@class='btn']")).click();
		 * driver.findElement(By.xpath("(//a[@class='collapsed'])[28]")).click();
		 */

		/*
		 * System.out.println("Question No 6 "); Error in it try to solve it
		 * driver.get("https://www.redbus.in/");
		 * driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		 * driver.findElement(By.xpath("//div[@id='hc']")).click();
		 */

		System.out.println("Question No 7");
		driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.id("from_station")).sendKeys("Madurai");
		driver.findElement(By.id("to_station")).sendKeys("Chennai");

		/*
		 * System.out.println("Questin No:16"); driver.get(
		 * "https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html"
		 * );
		 * 
		 * driver.findElement(By.xpath("(//input[@class='bginput'])[1]")).sendKeys("ram"
		 * ); driver.findElement(By.xpath("(//input[@class='bginput'])[2]")).sendKeys(
		 * "prasath"); driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		 * driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		 */
	}

}
