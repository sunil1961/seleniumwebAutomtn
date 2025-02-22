package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@AfterMethod
	public void afterTest() {

		/*
		 * if (driver != null) { driver.quit();
		 * 
		 * }
		 */

	}
}
