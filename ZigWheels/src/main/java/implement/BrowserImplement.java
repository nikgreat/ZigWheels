package implement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserImplement {
	
static WebDriver driver;
	


	public static WebDriver BrowserSelect(String bname){
		String currentDirectory = System.getProperty("user.dir");
		
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currentDirectory+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currentDirectory+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}
		else {
			System.setProperty("webdriver.edge.driver", currentDirectory+"\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			return driver;
		}
		
	}

}
