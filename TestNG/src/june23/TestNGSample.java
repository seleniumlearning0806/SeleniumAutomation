package june23;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	@Test
	public static void test() {
		System.out.println("@Test --TestNGSample --Sample functionality");
		System.out.println();
	}
	@BeforeMethod
	public static void login() {
		System.out.println("@BeforeMethod --TestNGSample --Sample Login to application");
		System.out.println();
	}
	
	@AfterMethod
	public static void logout() {
		System.out.println("@AfterMethod --TestNGSample --Sample Logout from application");
		System.out.println();
	}
	@BeforeClass
	public static void initiateDriver() {
		System.out.println("@BeforeClass --TestNGSample --Sample Initiate WebDriver");
		System.out.println();
	}
	@AfterClass
	public static void closeDriver() {
		System.out.println("@Afterclass --TestNGSample --Sample Close WebDriver");
		System.out.println();
	}
}
