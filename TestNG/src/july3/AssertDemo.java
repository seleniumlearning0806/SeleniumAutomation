package july3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	static String abc="";
	
	
	@Test(priority=1)
	public static void test() {
		//This is the Sample Assert Demo
		String keypath="webdriver.chrome.driver";
		String sChromeDriverPath="D:\\Learning\\Drivers\\Chrome\\chromedriver.exe";
		System.setProperty(keypath, sChromeDriverPath);
		WebDriver driver=new ChromeDriver();

		driver.get("http:www.google.com");
		System.out.println("google website is opened");
		driver.manage().window().maximize();
		String sActualtTitle=driver.getTitle();
		String ExpectedTitle="Google";
		Assert.assertEquals(sActualtTitle, ExpectedTitle, "The Titles are matched");
		driver.quit();
	}
	
	@Test(priority=2)
	public static void test2() {
		Assert.assertFalse(3>5, "Condition is true");
	}
	
	@Test(priority=3)
	public static void test3() {
		Assert.assertNotNull(abc);
	}

}
