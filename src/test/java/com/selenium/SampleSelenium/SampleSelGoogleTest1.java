package com.selenium.SampleSelenium;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SampleSelGoogleTest1 {
	static WebDriver driver;
 	@BeforeTest
	public void setup() throws MalformedURLException {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	@Test
	public void sampleSelGoogleTest1() {
		driver.get("http://www.google.com/");
		System.out.println("driver.getTitle() " + driver.getTitle());
		System.out.println("Expected String " + "Google");
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
}