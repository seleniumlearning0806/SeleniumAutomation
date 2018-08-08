package july8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentageDemo {
	
	int count=0;
	
	@Test(invocationCount=20, successPercentage=60)
	public void repeat() {
		System.out.println("count value is:" + (++count));
		if(count>15) {
			Assert.fail("count is greater than 15");
		}
	}

}
