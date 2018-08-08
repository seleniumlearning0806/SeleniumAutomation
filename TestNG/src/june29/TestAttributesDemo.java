package june29;

import org.testng.annotations.Test;

public class TestAttributesDemo {
	@Test(description="Initiate Driver")
	public static void test200() {
		System.out.println("@Test -- test200");
	}
	@Test(description="Login to the application", invocationCount=1, invocationTimeOut=1000)
	public static void test201() throws Exception{		
		Thread.sleep(500);
		System.out.println("@Test -- test201");
	}
	@Test(alwaysRun=true,dependsOnMethods="test204",description="Delete Employee", invocationCount=3)
	public static void test202() {
		System.out.println("@Test -- test202");
	}
	@Test(description="Add Employee", enabled=false)
	public static void test203() {
		System.out.println("@Test -- test203");
	}
	@Test(description="logout")
	public static void test204() throws Exception{
		System.out.println("@Test -- test204");
		//throw new Exception();
	}
	@Test(expectedExceptions=NumberFormatException.class)
	public static void test205() {
		System.out.println("@Test --test205");
		int i=Integer.parseInt("Sagar");
		System.out.println(i);
	}
}
