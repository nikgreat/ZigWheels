
package run;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import implement.BrowserImplement;
import library.Repository;
import library.Scrollimp;
import library.scrnshot;
import pages.CarsUnder4LacPage;
import pages.NewCarsPage;
import testData.WriteExcel;
import pages.HomePage;
import pages.PageValidation;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ZigTest {
	
	static WebDriver driver;
	
  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\jdk-12.0.1\\MyWorkspaces\\maven-archetypes-quickstart\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 
//				BrowserImplement browser = new BrowserImplement();
//				System.out.println("Enter Browser name");
//				Scanner scan  = new Scanner(System.in);
//				String b = scan.nextLine();
//				driver = BrowserImplement.BrowserSelect(b);
//				driver.manage().window().maximize();
	  }
	
	
  @Test(priority=0, groups = {"smoke", "regression"})
  public void f() throws IOException, InterruptedException {
	 //Validating the launch of this test
	 PageValidation.pgvalid();
	 
	 new HomePage(driver);
	 HomePage.home();
	 
	 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/test.html");
	 ExtentReports extent = new ExtentReports();
	 
	 extent.attachReporter(reporter);
	 ExtentTest logger = extent.createTest("HomePage");
	 logger.log(Status.INFO, "Land on Homeplage");
	 logger.log(Status.PASS, "Homepage Opened!");
	 
	 scrnshot scrn = new scrnshot(driver);
	 Thread.sleep(1000);
	 scrn.takeSnapShot("C:\\Program Files\\Java\\jdk-12.0.1\\MyWorkspaces\\ZigWheels\\ScreenShot\\image.jpg");
	 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	 
	 logger.addScreenCaptureFromPath("C:\\Program Files\\Java\\jdk-12.0.1\\MyWorkspaces\\ZigWheels\\ScreenShot\\image.jpg");
	 extent.flush();
	 
	 
	 // driver.navigate().to("https://www.zigwheels.com");
	 // driver.navigate().to("https://www.google.com");
  }
  
  @Test(priority=1, groups = "regression")
  public static void second() throws IOException{
	  
	  new NewCarsPage(driver);
	  NewCarsPage.NewCars();
	 
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  NewCarsPage.NewCars(Repository.object());
  }
  
  @Test (priority=2, groups = "smoke")
  public static void third() throws IOException, InterruptedException {
	  
	 
	  new CarsUnder4LacPage(driver);
	  CarsUnder4LacPage.ext();
	  
	  CarsUnder4LacPage.getTitleOfPage();
	  CarsUnder4LacPage.ClickMore();
	  
	  new WriteExcel(driver);
	  WriteExcel.write();
	  //Scrolling the page to 1000 pixels vertically
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1000)");
	  Scrollimp fac = new Scrollimp();
	  fac.scroll();
	  Thread.sleep(2000);
	  
	  
  }


  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
