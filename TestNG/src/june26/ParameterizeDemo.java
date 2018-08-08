package june26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeDemo {
	
	static WebDriver driver;	
	@Parameters({"Browser"})
	@BeforeClass
	public static void OrangeHRMBrowserLaunch(String sBrowser) throws Exception{
		System.out.println("Browser Name is: "+sBrowser);
		if(sBrowser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "D:\\Learning\\Drivers\\IE\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("IE Browser is launched");
			
		}else if(sBrowser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Drivers\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("chrome browser is launched");
			
		}else if(sBrowser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Learning\\Drivers\\Firefox\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Firefox browser is launched");
			
		}	
		Thread.sleep(20000);
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Mercury tours website is launched");
		driver.manage().window().maximize();
	}
	
	@Parameters({"username", "password"})
	@Test
	public static void orangeHRMLogin(String sUserName, String sPassword) {
		driver.findElement(By.name("userName")).sendKeys(sUserName);
		System.out.println("User Name is entered: "+sUserName);
		
		driver.findElement(By.name("password")).sendKeys(sPassword);
		System.out.println("Password is entered: "+sPassword);
		
		driver.findElement(By.name("login")).click();
		System.out.println("Login button is clicked");
	}
	
	@AfterClass
	public static void tearDown() {
		//driver.close();
	}
	
}
