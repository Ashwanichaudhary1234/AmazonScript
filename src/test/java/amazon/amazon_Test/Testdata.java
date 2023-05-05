package amazon.amazon_Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import amazon.amazon_Pages.Loginpage;
import amazon.amazon_testbase.testbase;

public class Testdata extends testbase 
    {
	Loginpage LP;
	String actual_title;
	@BeforeSuite
	public void Launch() throws Exception 
	{
		initialization();
		LP = new Loginpage();
	}

	@Test(priority = 1)
	public void accesibility() {
		actual_title = driver.getTitle();
		System.out.println("Actual title : " + actual_title);
		Assert.assertEquals(actual_title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		System.out.println("Website is accessible and verified that Actual title and Current  title");
	}

	@Test(priority = 2)
	public void logovisiblity() {
		Assert.assertEquals(LP.logo_element().isDisplayed(), true);
		System.out.println("Logo is displayed");
	}

	@Test(priority = 3)
	public void Iconlocationvisiblity() {
		Assert.assertEquals(LP.Iconlocation_element().isDisplayed(), true);
		System.out.println("Iconlocation is displayed");
	}
	@Test(priority = 4)
	public void Iconsearchbox() {
		Assert.assertEquals(LP.Iconsearchbox_element().isDisplayed(), true);
		System.out.println("Iconsearchbox is displayed");
	}
	@Test(priority = 5)
	public void Iconsignin() {
		Assert.assertEquals(LP.Iconsignin_element().isDisplayed(), true);
		System.out.println("Iconsignin is displayed");
	}
		@Test(priority = 6)
		public void Iconmenu() {
			Assert.assertEquals(LP.Iconmenu_element().isDisplayed(), true);
			System.out.println("Iconmenu is displayed");
		
	}
		@Test(priority = 7)
		public void Iconminitv() {
			Assert.assertEquals(LP.Iconminitv_element().isDisplayed(), true);
			System.out.println("Iconminitv is displayed");
		
	}
		@Test(priority = 8)
		public void Iconsell() {
			Assert.assertEquals(LP.Iconsell_element().isDisplayed(), true);
			System.out.println("Iconsell is displayed");
		
	}
		@Test(priority = 9)
		public void Iconbestsell() {
			Assert.assertEquals(LP.Iconbestsell_element().isDisplayed(), true);
			System.out.println("Iconbestsell is displayed");
		
	}
		@Test(priority = 10)
		public void Iconmobiles() throws InterruptedException {
			Assert.assertEquals(LP.Iconmobiles_element().isDisplayed(), true);
			System.out.println("Iconmobiles is displayed");
			//Thread.sleep(300);
		
	} 
		
		@Test(priority = 11)
		public void click() throws InterruptedException
		{
		LP.Iconlocation_element().click();
		//Thread.sleep(3000);
		driver.navigate().refresh();


	}
		@Test(priority = 26)
		public void Iconsignin1() throws InterruptedException
		{
		LP.Iconsignin_element().click();
		//driver.navigate().back();
		Thread.sleep(4000);
		}
		@Test(priority = 27)
		public void Continue() throws InterruptedException
		{
		LP.Continue_element().click();
		Assert.assertEquals(LP.alert_element().getText(),"Enter your email or mobile phone number");
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		}
		
		@Test(priority = 28)
		public void Email() throws InterruptedException
		{
		LP.Email_element().sendKeys("6397372561");
		//driver.navigate().back();
		Thread.sleep(400);
		}
		@Test(priority = 29)
		public void Continue1() throws InterruptedException
		{
		LP.Continue_element().click();
		//driver.navigate().back();
		Thread.sleep(400);
		}
		
		@Test(priority = 30)
		public void signinbutton() throws InterruptedException
		{
		LP.signinbutton_element().click();
		Assert.assertEquals(LP.alert1_element().getText(),"Enter your password");
		
		driver.navigate().refresh();
		Thread.sleep(400);
		}
		@Test(priority = 31)
		public void password() throws InterruptedException
		{
		LP.password_element().sendKeys("Ashwani@134");
		Thread.sleep(400);
		}
		@Test(priority = 32)
		public void signinbutton1() throws InterruptedException
		{
		LP.signinbutton_element().click();
		Assert.assertEquals(LP.alert2_element().getText(),"Your password is incorrect");
		driver.navigate().refresh();
		Thread.sleep(400);
		}
		@Test(priority = 33)
		public void forgotpassword() throws InterruptedException
		{
		LP.forgotpassword_element().click();
		Thread.sleep(400);
		}
		@Test(priority = 34)
		public void Continue2() throws InterruptedException
		{
		LP.Continue_element().click();
		//driver.navigate().back();
		Thread.sleep(4000);
		}
		
		@Test(priority = 12)
		public void Iconcart() throws InterruptedException
		{
		LP.Iconcart_element().click();
		driver.navigate().back();
		Thread.sleep(400);
		}
		@Test(priority = 13)
		public void Iconmenu1() throws InterruptedException
		{
		LP.Iconmenu_element().click();
		driver.navigate().refresh();
		Thread.sleep(4000);
		}
		@Test(priority = 14)
		public void Iconminitv1() throws InterruptedException
		{
		LP.Iconminitv_element().click();
		driver.navigate().back();
		Thread.sleep(4000);
		}
		@Test(priority = 15)
		public void Iconsell1() throws InterruptedException
		{
		LP.Iconsell_element().click();
		driver.navigate().back();
		Thread.sleep(4000);
		}
		@Test(priority = 16)
		public void Iconmobiles1() throws InterruptedException
		{
		LP.Iconmobiles_element().click();
		driver.navigate().back();
		Thread.sleep(4000);
		}
		
		@Test(priority = 17)
		public void Click() throws InterruptedException
		{
		LP.Iconsearchbox_element().sendKeys("Iphone12");
		//Thread.sleep(4000);
		}
		@Test(priority = 18)
		public void Clicksubmit() throws InterruptedException
		{
			
		LP.searchIcon_element().click();
		//Thread.sleep(4000);
		}
		@Test(priority = 19)
		public void Iphone() throws InterruptedException
		{
			String first=driver.getWindowHandle();
		LP.Iphone_element().click();
		Thread.sleep(4000);
        driver.switchTo().window(first);
		}
		@Test(priority = 20)
		public void cart() throws InterruptedException
		{
		LP.Iconcart_element().click();
		driver.navigate().back();
		Thread.sleep(400);
		}
		@Test(priority = 21)
		public void returnorder() throws InterruptedException
		{
		LP.returnorder_element().click();
		driver.navigate().back();
		Thread.sleep(400);
		}
		
		@Test(priority = 24)
		public void down() throws InterruptedException
		{
         Actions act = new Actions(driver);
         act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(400);
		}
		@Test(priority = 25)
		public void backtoup() throws InterruptedException
		{
		LP.backtoup_element().click();
		Thread.sleep(400);
		}
		@AfterSuite
		public void stop() throws IOException 
		{
			terminate();
		}
		
		
 }
