package miscScripts;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	static Logger log=Logger.getLogger(TestNGDemo.class.getName());

	/*@Test
	public static void test() {
		PropertyConfigurator.configure("Log4j.properties");
		log.info("This is a information message");
		log.debug("This is a debug message");
	}*/
	
  @Test(priority=1, description="Add Employee")
  public void demo() {
	  
	  Reporter.log("Test1", true);
  }
  @AfterClass
  public void demo1() {
	  
	  Reporter.log("After Class", true);
  }
  @Test(priority=2,description="Edit Employee")
  public void demo2() {
	  
	  Reporter.log("Test2", true);
  }
  @Test(priority=3,description="Delete Employee")
  public void demo3() {
	  
	  Reporter.log("Test3", true);
  }
  @BeforeClass
  public void demo4() {
	  
	  Reporter.log("Before Class", true);
  }
  
  @BeforeMethod
  public void demo5() {
	  Reporter.log("Before Method", true);
  }
  
  @AfterMethod
  public void demo6() {
	  Reporter.log("After Method", true);
  }
}
