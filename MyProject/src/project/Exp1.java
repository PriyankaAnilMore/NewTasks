package project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
@Listeners(project.ExpListener.class)	

public class Exp1  {
/*	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;  */
	 public static	WebDriver driver;
	 
	 
	@BeforeSuite
	public void Launch_Browser() {
		OpeningBrowser();

	}

	private void OpeningBrowser() {
			try{
				  String path="F://MyfirstProject//chromedriver.exe";
				  System.setProperty("webdriver.chrome.driver", path);
				  driver=new ChromeDriver();
				  driver.get("file:///F:/MyfirstProject/JBK%20Offline/index.html");
				  //Thread.sleep(1000);
				//  driver.close();
				
			}catch(Exception e1){
					e1.printStackTrace();
		}
		}
		
	/* @BeforeTest
	
	public void setUp()
	{
	    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	     
	    extent.setSystemInfo("OS", "Windows 10");
	    extent.setSystemInfo("Host Name", "JBK");
	    extent.setSystemInfo("Environment", "Automation");
	    extent.setSystemInfo("User Name", "Priyanka More");
	    htmlReporter.config().setChartVisibilityOnOpen(true);
	    htmlReporter.config().setDocumentTitle("AutomationTesting in Demo Report");
	    htmlReporter.config().setReportName("My Own Report");
	    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlReporter.config().setTheme(Theme.DARK);
	}

	*/
	

	@Test(priority = 1)
	public void TestCase1() {

		String Expected = null;
		try {
			Expected = OpenExcel.OpeningExcel(0, 1, 0);
			// System.out.println("Expected link is "+Expected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual = driver.findElement(By.xpath("//a[@href='index.html']")).getText();
		System.out.println("Actual link is >>>" + Actual);

		AssertJUnit.assertEquals(Actual, Expected);
		System.out.println("Both links are same");
		

	}

	@Test(priority = 2)
	public void TestCase2() {

		String Expected2 = null;
		try {
			Expected2 = OpenExcel.OpeningExcel(0, 2, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual2 = driver.findElement(By.xpath("//a[@href='about-us.html']")).getText();

		System.out.println("Actual link is >>>" + Actual2);
		AssertJUnit.assertEquals(Actual2, Expected2);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 3)
	public void TestCase3() {

		String Expected3 = null;
		try {
			Expected3 = OpenExcel.OpeningExcel(0, 3, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual3 = driver.findElement(By.xpath("//a[@href='core-java-j2eee-syllabus.html']")).getText();

		System.out.println("Actual link is >>>" + Actual3);
		AssertJUnit.assertEquals(Actual3, Expected3);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 4)
	public void TestCase4() {

		String Expected4 = null;
		try {
			Expected4 = OpenExcel.OpeningExcel(0, 4, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual4 = driver.findElement(By.xpath("//a[@href='selenium-testing-in-pune.html']")).getText();

		System.out.println("Actual link is >>> " + Actual4);
		AssertJUnit.assertEquals(Actual4, Expected4);
		System.out.println("Both Results are same");
		
		
	}

	@Test(priority = 5)
	public void TestCase5() {

		String Expected5 = null;
		try {
			Expected5 = OpenExcel.OpeningExcel(0, 5, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual5 = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[5]/a")).getText();

		System.out.println("Actual link is >>>" + Actual5);
		AssertJUnit.assertEquals(Actual5, Expected5);
		System.out.println("Both Results are same");
	
	}

	@Test(priority = 7)
	public void TestCase7() {

		String Expected7 = null;
		try {
			Expected7 = OpenExcel.OpeningExcel(0, 7, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual7 = driver.findElement(By.xpath("//a[@href='careers.html']")).getText();

		System.out.println("Actual link is >>>" + Actual7);
		AssertJUnit.assertEquals(Actual7, Expected7);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 6)
	public void TestCase6() {

		String Expected6 = null;
		try {
			Expected6 = OpenExcel.OpeningExcel(0, 6, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual6 = driver.findElement(By.xpath("//a[@href='services.html']")).getText();

		System.out.println("Actual link is >>>" + Actual6);
		AssertJUnit.assertEquals(Actual6, Expected6);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 8)
	public void TestCase8() {

		String Expected8 = null;
		try {
			Expected8 = OpenExcel.OpeningExcel(0, 8, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual8 = driver.findElement(By.xpath("//a[@href='gallery.html']")).getText();

		System.out.println("Actual link is >>>" + Actual8);
		AssertJUnit.assertEquals(Actual8, Expected8);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 9)
	public void TestCase9() {

		String Expected9 = null;
		try {
			Expected9 = OpenExcel.OpeningExcel(0, 9, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual9 = driver.findElement(By.xpath("//a[@href='java-by-kiran-book.html']")).getText();

		System.out.println("Actual link is >>>" + Actual9);
		AssertJUnit.assertEquals(Actual9, Expected9);
		System.out.println("Both Results are same");
	
	}

	@Test(priority = 10)
	public void TestCase10() {

		String Expected10 = null;
		try {
			Expected10 = OpenExcel.OpeningExcel(0, 10, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual10 = driver.findElement(By.xpath("//a[@href='old-student-feedback-java-by-kiran.html']"))
				.getText();

		System.out.println("Actual link is >>>" + Actual10);
		AssertJUnit.assertEquals(Actual10, Expected10);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 12)
	public void TestCase12() {

		String Expected12 = null;
		try {
			Expected12 = OpenExcel.OpeningExcel(0, 12, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual12 = driver.findElement(By.xpath("//a[@href='java-classes-contact-pune.html']")).getText();

		System.out.println("Actual link is >>>" + Actual12);
		AssertJUnit.assertEquals(Actual12, Expected12);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 11)
	public void TestCase11() {

		String Expected11 = null;
		try {
			Expected11 = OpenExcel.OpeningExcel(0, 11, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual11 = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[11]/a")).getText();

		System.out.println("Actual link is >>> " + Actual11);
		AssertJUnit.assertEquals(Actual11, Expected11);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 13)
	public void TestCase13() {

		String Expected13 = null;
		try {
			Expected13 = OpenExcel.OpeningExcel(0, 13, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual13 = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[13]/a")).getText();

		System.out.println("Actual link is >>>" + Actual13);
		AssertJUnit.assertEquals(Actual13, Expected13);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 14)
	public void TestCase14() {

		String Expected14 = null;
		try {
			Expected14 = OpenExcel.OpeningExcel(0, 14, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual14 = driver.findElement(By.xpath("//a[@href='tutorials.html']")).getText();

		System.out.println("Actual link is >>>" + Actual14);
		AssertJUnit.assertEquals(Actual14, Expected14);
		System.out.println("Both Results are same");
		
	}

	@Test(priority = 15)
	public void TestCase15() throws Exception {

		OpeningBrowser();
		// String Actual15=
		// driver.findElement(By.xpath("//a[@href='corporate-training.html']")).getText();
		String Expected15 = null;
		try {
			Expected15 = OpenExcel.OpeningExcel(0, 14, 0);
			// System.out.println("Expected link is "+Expected2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actual15 = driver.findElement(By.xpath("//a[@href='corporate-training.html']")).getText();

		System.out.println("Actual link is >>>" + Actual15);
		System.out.println("Exception occur");
		AssertJUnit.assertEquals(Actual15, Expected15);
		System.out.println("Exception occur");
		

	}

	/*  @AfterTest
	public void getResult(ITestResult result)
	{
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	        test.fail(result.getThrowable());
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	    }
	    else
	    {
	        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        test.skip(result.getThrowable());
	    }
	}
	
	
	*/
	
	

	

	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	//	  extent.flush();

	}

}
