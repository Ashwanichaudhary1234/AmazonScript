package amazon.amazon_Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import amazon.amazon_Pages.Loginpage;
import amazon.amazon_testbase.testbase;


	@Test
	public class Signin extends testbase
	{
		Loginpage LP;
		@BeforeSuite
		public void Launch() throws Exception 
		{
			initialization();
			LP = new Loginpage();
		}
		@AfterSuite
		public void stop() throws IOException 
		{
			terminate();
		}
		@Test(priority = 1)
        public void Signin1() throws InterruptedException 
		{
		LP.signin_element().click();
		LP.Email_element().sendKeys("6397372561");;
		LP.Continue_element().click();
		LP.password_element().sendKeys("Ashwani@123");
		LP.Continue_element().click();
		Thread.sleep(20000);
		}
		
		@Test(priority = 2)
        public void deliver() throws InterruptedException 
		{
		LP.deliver_element().click();
		LP.Address_element().click();
		Assert.assertEquals(LP.deliver_element().isDisplayed(), true);
		Thread.sleep(1000);
		driver.navigate().refresh();
		}
		
		@Test(priority = 3)
        public void Orders() 
		{
		LP.Orders_element().click();
		LP.history_element().click();
		LP.past_element().click();
		driver.navigate().back();
		
		 }
		
		@Test(priority = 4)
        public void Order1() throws InterruptedException 
		{
	    LP.all_element().click();
	    Thread.sleep(2000);
		LP.youraccount_element().click();
	    Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		a.sendKeys(Keys.PAGE_UP).build().perform();	
	    Thread.sleep(2000);
        driver.navigate().back();
		 }
		
		
		@Test(priority = 5)
        public void Order2() throws InterruptedException 
		{
		Thread.sleep(2000);
	    LP.all_element().click();
	    Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LP.services_element());
	    Thread.sleep(2000);
        driver.navigate().back();
		 }
		@Test(priority = 6)
        public void Order3() throws InterruptedException 
		{
		LP.all_element().click();
	    Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LP.signout_element());
		Thread.sleep(2000);	
		}
		
	
		
	
 }

