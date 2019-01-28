package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.redhu.Util.TestUtil;
import com.redhu.Util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListner;

	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"/Users/kiwitech/Documents/New Automation copy/Automation copy/src/main/java/com/TakeAClass/qa/config/Config.properties");
		prop.load(ip);
		
		///Users/kiwitech/Downloads/AutomationFramework-Sprint1/src/main/java/com/TakeAClass/qa/config/Config.properties
	}

	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browserName");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver", "/Users/kiwitech/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}

		/*
		 * @Parameters("browser")
		 * 
		 * 
		 * public static void multiBrowser(String browser) throws
		 * InterruptedException{ if(browser.equalsIgnoreCase("firefox")){
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Home\\November\\SeleniumEasy\\jars\\geckodriver.exe"); driver =
		 * new FirefoxDriver(); }if(browser.equalsIgnoreCase("chrome")){
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Home\\November\\SeleniumEasy\\jars\\chromedriver.exe"); driver =
		 * new ChromeDriver(); }
		 * 
		 */

		e_driver = new EventFiringWebDriver(driver);
		// Going to create eventListner object to register with event driver.
		eventListner = new WebEventListener();
		e_driver.register(eventListner);
		// assigning e_driver to main driver
		driver = e_driver;

		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICTWAITTIMEOUT, TimeUnit.SECONDS);
		//String myUrl = prop.getProperty("https://topfan-web-qa.herokuapp.com/");
		//driver.get("https://topfan-web-qa.herokuapp.com/");
	}
}
