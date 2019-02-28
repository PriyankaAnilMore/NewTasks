package pack2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Snapdeal {
	WebDriver driver;

	@Test(priority=2)
	public void Login() {
		String path = "F://TaskofTestNG/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		System.out.println("Title is:>>>" + driver.getTitle());
		System.out.println("<<<Succesfully opened snapdeal>>> ");
		driver.close();
	}
	
	@Test(priority=3)
	public void OpenSite() {
		//String path = "F://TaskofTestNG/chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", path);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javabykiran.com/");
		System.out.println("Title is:>>>" + driver.getTitle());
		System.out.println("<<<Succesfully opened JBK>>> ");
		driver.close();
	}
}
