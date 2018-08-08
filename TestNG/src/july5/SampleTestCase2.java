package july5;

import org.testng.annotations.Test;

public class SampleTestCase2 {
	
	int param;
	SampleTestCase2(int parameter){
		this.param=parameter;
	}
	
	@Test(priority=1)
	public void test90() {
		System.out.println("Parameter value is: "+param);
	}
	
	@Test(priority=2)
	public void test91() {
		System.out.println("Parameter value is: "+(param+1));
	}
	
	@Test(priority=3)
	public void test92() {
		System.out.println("Parameter value is: "+(param+2));
	}
	
	@Test(priority=4)
	public void test93() {
		System.out.println("Parameter value is: "+(param+3));
	}

}
