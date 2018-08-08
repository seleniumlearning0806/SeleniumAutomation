package june29;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@BeforeGroups(groups="database")
	public static void startDBConnection() {
		System.out.println("@Before Groups -- StartDB Connection");
	}
	
	@AfterGroups(groups="database")
	public static void closeDBConnection() {
		System.out.println("@After Groups -- closeDB Connection");
	}
	
	@Test(groups="selenium-test")
	public static void test2() {
		System.out.println("@Test ---test2");
	}
	
	@Test(groups= {"database","selenium-test"})
	public static void test3() {
		System.out.println("@Test ---test3");
	}
	
	@Test(groups="selenium-test")
	public static void test4() {
		System.out.println("@Test ---test4");
	}
	
	@Test(groups="database")
	public static void test5() {
		System.out.println("@Test ---test5");
	}
	
	@Test(dependsOnGroups= {"selenium-test"})
	public static void test1() {
		System.out.println("@Test --test1");
	}

}
