package july3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo1 {
	
	static String xyz;
	
	@Test
	public static void test() {
		Assert.assertEquals("Hello", "Hello","Both values are not matched");
		SoftAssert ob=new SoftAssert();
		ob.assertTrue(20>50," The condition is not true");
		ob.assertNotNull(xyz, "value is not null");
		System.out.println("This is the last line of the program");
		ob.assertAll();
	}

}
