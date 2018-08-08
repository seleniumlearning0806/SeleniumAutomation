package july2;

import org.testng.annotations.DataProvider;

public class DataProviderDemo1 {
	
	@DataProvider(name="selenium")
	public static Object[][] dataDemo(){
		Object[][] data=new Object[2][1];
		data[0][0]="Test";
		data[1][0]="Selenium";
		return data;
	}
	


}
