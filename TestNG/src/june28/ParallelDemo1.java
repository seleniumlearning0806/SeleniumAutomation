package june28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParallelDemo1 {
	@Test
	public static void test100() throws Exception{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Drivers\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=cWW0WqfVDeSvX9jMsKgN");
	System.out.println("Google Search is opened");
	driver.manage().window().maximize();
	driver.findElement(By.id("lst-ib")).sendKeys("India");
	System.out.println("India is entered in Google search box");
	Thread.sleep(1000);
	driver.findElement(By.id("lst-ib")).submit();
	System.out.println("Page is submitted");
	Thread.sleep(4000);
	driver.findElement(By.linkText("India - Wikipedia")).click();
	System.out.println("Wikipedia page is opened");
	Thread.sleep(3000);
	
	/*String pagesource=driver.getPageSource();
	System.out.println(pagesource);*/
	
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	
	driver.navigate().back();
	System.out.println("Single backward in browser history");
	Thread.sleep(3000);
	driver.navigate().forward();
	System.out.println("Single forward in browser history");
	Thread.sleep(3000);
	driver.navigate().refresh();
	System.out.println("Current page is refreshed");
	driver.navigate().to("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	Thread.sleep(3000);
	//driver.close();
	
	}
	
	
	@Test
	public static void test91() {
		for(int i=0;i<1000;i++) {
			System.out.println("test91 - ParallelDemo :"+i);
		}
	}
}
