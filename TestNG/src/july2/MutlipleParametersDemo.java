package july2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MutlipleParametersDemo {
	
	@Test(dataProvider="MultiDemo")
	public static void test(String FirstName, String LastName, String Email) {
		System.out.println("FirstName is: "+FirstName);
		System.out.println("LastName is: "+LastName);
		System.out.println("Email is: "+Email);
	}
	
	@DataProvider(name="MultiDemo")
	public static Object[][] test(){
		Object[][] data=new Object[2][3];
		
		data[0][0]="Sagar";
		data[0][1]="CH";
		data[0][2]="sagar.ch@gmail.com";
		
		data[1][0]="Vijetha";
		data[1][1]="A";
		data[1][2]="vijetha@gmail.com";
		
		return data;
	}

}
