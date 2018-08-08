package june23;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@Test(priority=3)
	public static void deleteEmployee() {
		System.out.println("@Test --AnnotationsDemo --Delete Employee functionality");
		System.out.println();
	}
	
	@Test(priority=1)
	public static void addEmployee() {
		System.out.println("@Test --AnnotationsDemo --Add Employee functionality");
		System.out.println();
	}
	@BeforeMethod
	public static void login() {
		System.out.println("@BeforeMethod --AnnotationsDemo --Login to application");
		System.out.println();
	}
	
	@AfterMethod
	public static void logout() {
		System.out.println("@AfterMethod --AnnotationsDemo --Logout from application");
		System.out.println();
	}
	@Test(priority=2)
	public static void editEmployee() {
		System.out.println("@Test --AnnotationsDemo --Edit Employee functionality");
		System.out.println();
	}
	@BeforeClass
	public static void initiateDriver() {
		System.out.println("@BeforeClass --AnnotationsDemo --Initiate WebDriver");
		System.out.println();
	}
	@AfterClass
	public static void closeDriver() {
		System.out.println("@Afterclass --AnnotationsDemo --Close WebDriver");
		System.out.println();
	}
	
	/*@BeforeGroups
	public static void setEnvironment() {
		System.out.println("@BeforeGroups --AnnotatiosDemo --Settingup the Environment");
		System.out.println();
	}
	
	@AfterGroups
	public static void closeEnvironment() {
		System.out.println("@AfterGroups --AnnotationsDemo --close the Environment");
		System.out.println();
	}*/
	
	@BeforeTest
	public static void setEnvironment() {
		System.out.println("@BeforeTest --AnnotatiosDemo --Settingup the Environment");
		System.out.println();
	}
	
	@AfterTest
	public static void closeEnvironment() {
		System.out.println("@AfterTest --AnnotationsDemo --close the Environment");
		System.out.println();
	}
	
	@BeforeSuite
	public static void startup() {
		System.out.println("@BeforeSuite --AnnotationsDemo --startup method");
		System.out.println();
	}
	
	@AfterSuite
	public static void teardown() {
		System.out.println("@AfterSuite --AnnotationsDemo --tearDown method");
		System.out.println();
	}
	

}
