package july5;

import org.testng.annotations.Factory;

public class FactoryDemo {
	
	@Factory
	public static Object[] factorytest() {
		Object[] data=new Object[2];
		
		data[0]= new SampleTestCase2(100);
		data[1]= new SampleTestCase2(200);
		
		return data;
	}

}
