package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipcart {
	WebDriver driver;

	@Test(priority=0)
	public void OpenBrowser() {
		String path = "F://TaskofTestNG/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title is:>>>" + driver.getTitle());
		System.out.println("<<<Succesfully opened flipcart>>> ");

		driver.close();

	}
	@Test(priority=1)
	public void OpenGmail(){
	//String path = "F://TaskofTestNG/chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", path);
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com/");
	System.out.println("Title is:>>>" + driver.getTitle());
	System.out.println("<<<Succesfully opened gmail>>> ");

	driver.close();


}
}
