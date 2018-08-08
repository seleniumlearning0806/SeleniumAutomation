package july8;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart Method is executed: "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method is executed: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method is executed: "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method is executed: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage Method is executed: "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart Method is executed: "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish Method is executed: "+context.getName());
		
	}

}
