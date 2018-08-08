package july2;

import org.testng.annotations.Test;

public class DataProviderDemo2 {
	@Test(dataProvider="selenium",dataProviderClass=DataProviderDemo1.class)
	public static void test(String userName) {
		System.out.println("User Name is: "+userName);
	}
}
