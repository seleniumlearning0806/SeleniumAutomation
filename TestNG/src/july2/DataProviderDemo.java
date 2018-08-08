package july2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	//This is a Sample Data Provide Demo class
	@DataProvider(name="selenium-test")
	public static Object[][] Demo1(){
		
		Object[][] data=new Object[4][1];
		data[0][0]="Sagar";
		data[1][0]="Test";
		data[2][0]="Selenium";
		data[3][0]="DataProvider";
		
		return data;
	}
	
	@Test(dataProvider="selenium-test")
	public static void test(String param1) {
		
		System.out.println("Parameter value is: "+param1);
		
	}

}
