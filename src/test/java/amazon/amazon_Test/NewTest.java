package amazon.amazon_Test;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import amazon.amazon_Pages.Loginpage;
import amazon.amazon_testbase.testbase;

public class NewTest extends testbase
	{
		Loginpage LP;

		@BeforeSuite
		public void Launch() throws Exception 
		{
			initialization();
			LP = new Loginpage();
		}
		@Test(priority = 1)
		public void summersale() throws InterruptedException
		{
		LP.summersale_element().click();
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(500,12000); ");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.click(LP.ExpiringSoon_element());
		act.click(LP.ExpiringSoonoption_element());
	    Thread.sleep(2000);
         driver.navigate().back();
		}
		@Test(priority = 2)
		public void booktravel_element() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
        LP.addmoney_element().click();
        driver.navigate().back();
        driver.navigate().back();

		Thread.sleep(2000);
        
		}
		@Test(priority = 3)
		public void booktravel_element1() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.addgiftcard_element().click();
        driver.navigate().back();
        driver.navigate().back();

		}
		@Test(priority = 4)
		public void booktravel_element2() throws InterruptedException
		{
		LP.booktravel_element().click();
		LP.accountsetting_element().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		}
		@Test(priority = 5)
		public void booktravel_element3() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.transaction_element().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		}
		@Test(priority = 6)
		public void booktravel_element4() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.Rewards_element().click();
		driver.navigate().back();
		driver.navigate().back();

		}
		@Test(priority = 7)
		public void booktravel_element5() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.donate_element().click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(500,12000); ");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();

		}
		@Test(priority = 8)
		public void booktravel_element6() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.EMI_element().click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(500,12000); ");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();

		}
		@Test(priority = 9)
		public void booktravel_element7() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.savedcard_element().click();
		driver.navigate().back();
		driver.navigate().back();

		}
		@Test(priority = 10)
		public void booktravel_element8() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.bankid_element().click();
		driver.navigate().back();
		driver.navigate().back();

		}
		@Test(priority = 11)
		public void booktravel_element9() throws InterruptedException
		{
		LP.booktravel_element().click();
		Thread.sleep(2000);
		LP.FAQ_element().click();
		LP.help_element().sendKeys("How to order");
		LP.search_element().click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().back();

		}
		
		@AfterSuite
		public void stop() throws IOException 
		{
			terminate();
		}
}
