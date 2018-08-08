package july8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(july8.ListenerDemo.class)
public class OrangeHRMLogin extends TestListenerAdapter{
	
	static WebDriver driver;
	int count=0;
	
	@BeforeClass
	public static void before() {
		System.out.println("This is starting of before class method");
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://seleniumlearns-trials641.orangehrmlive.com");
		System.out.println("OrangeHRM website is launched");
		driver.manage().window().maximize();
		System.out.println("This is End of before class method");
	}
	
	@Test(priority=1) 
	public static void login() {
		System.out.println("This is starting of login Method");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("UserName is entered");
		driver.findElement(By.id("txtPassword")).sendKeys("SeleniumTest");
		System.out.println("Password is entered");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login button is clicked");
		System.out.println("This is End of login Method");
	}
	
	@Test(priority=2)
	public static void AddEmployee() {
		System.out.println("This is starting of the AddEmployee Method");
		driver.findElement(By.id("fhsdjkfhsdj")).click();
		System.out.println("This is End of AddEmployee Method");
	}
	
	@Test(priority=3, dependsOnMethods="AddEmployee")
	public static void logout() {
		System.out.println("This is starting of logout Method");
		driver.findElement(By.xpath("*//i[text()='keyboard_arrow_down']")).click();
		System.out.println("Logout menu is clicked");
		driver.findElement(By.xpath("*//a[text()='Logout']")).click();
		System.out.println("Logout link is clicked");		
		System.out.println("This is End of logout Method");
	}
	
	@Test(priority=4,invocationCount=6, successPercentage=50)
	public void repeat() {
		System.out.println("count value is:" + (++count));
		if(count>3) {
			Assert.fail("count is greater than 3");
		}
	}
	

	@AfterClass
	public static void after() {
		System.out.println("This is the starting of the AfterClass");
		driver.quit();
		System.out.println("This is the End of the AfterClass");
	}
	
	
}
