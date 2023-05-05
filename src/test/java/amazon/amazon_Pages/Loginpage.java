package amazon.amazon_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.amazon_testbase.testbase;

public class Loginpage extends testbase {
	
	public Loginpage() 
	{
	PageFactory.initElements(driver,this);
    }
	@FindBy(id="nav-logo-sprites")
	WebElement logo;
	@FindBy( id="glow-ingress-line2")
	WebElement Iconlocation ;
	@FindBy( id="twotabsearchtextbox")
	WebElement Iconsearchbox;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Iconsignin;
	@FindBy(id="nav-cart-text-container")
	WebElement Iconcart;
	@FindBy(xpath="//span[@class='hm-icon-label']")
	WebElement Iconmenu;
	@FindBy(xpath="//a[@class='nav-a  ' and contains(text(),'Amazon miniTV')]")
	WebElement Iconminitv;
	@FindBy(xpath="//a[@class='nav-a  ' and contains(text(),'Sell')]")
	WebElement Iconsell;
	@FindBy(xpath="//a[@class='nav-a  ' and contains(text(),'Best Sellers')]")
	WebElement Iconbestsell;
	@FindBy(xpath="//a[@class='nav-a  ' and contains(text(),'Mobiles')]")
	WebElement Iconmobiles;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
    WebElement searchIcon;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    WebElement Iphone;
	@FindBy(xpath="//input[@id='ap_email']")
    WebElement Email;
	@FindBy(xpath="//input[@id='continue']")
    WebElement Continue ;
	@FindBy(xpath="//*[@id=\"auth-email-missing-alert\"]/div/div")
    WebElement alert ;
	@FindBy(xpath="//input[@id='signInSubmit']")
    WebElement signinbutton ;
	@FindBy(xpath="//*[@id=\"auth-password-missing-alert\"]/div/div")
    WebElement alert1 ;
	@FindBy(xpath="//input[@id='ap_password']")
    WebElement password ;
	@FindBy(xpath="//span[@class='a-list-item']")
    WebElement alert2 ;
	@FindBy(xpath="//a[@id='auth-fpp-link-bottom']")
    WebElement forgotpassword ;
	@FindBy(xpath="//div[@class='nav-line-1-container']")
    WebElement returnorder ;
	@FindBy(xpath="//div[@class='a-carousel-col a-carousel-left celwidget']")
    WebElement backwordtab ;
	@FindBy(xpath="//div[@class='a-carousel-col a-carousel-right celwidget']")
    WebElement forwordtab ;
	@FindBy(xpath="//a[@id='navBackToTop']")
    WebElement backtoup ;
	@FindBy(xpath="//a[text()='See all']")
    WebElement summersale ;
	@FindBy(xpath="//span[text()='Expiring Soon']")
    WebElement ExpiringSoon ;
	@FindBy(xpath="//a[@id='coupon-pack-sort-type-drop-down_3']")
    WebElement ExpiringSoonoption ;
	@FindBy(xpath="//a[@href='/gp/sva/dashboard?ref_=gw_apay_travel_qcpc']")
    WebElement booktravel ;
	@FindBy(xpath="//a[@href=\"/gp/sva/addmoney?ref_=apay_deskhome_card_APayBalance_AddMoney\"]")
    WebElement addmoney;
	@FindBy(xpath="//span[text()='Add Gift Card']")
    WebElement addgiftcard;
	@FindBy(xpath="//a[@href=\"/gp/sva/account-settings?ref_=apay_deskhome_card_APayBalance_AccountSettings\"]")
    WebElement accountsetting;
	@FindBy(xpath="//a[@href=\"/pay/history?ref_=apay_deskhome_ViewStatement\"]")
    WebElement transaction;
	@FindBy(xpath="//div[@id=\"YourRewards\"]")
    WebElement Rewards;
	@FindBy(xpath="//a[@href=\"/b?node=26163663031&ref_=apay_deskhome_Covid\"]")
    WebElement donate;
	@FindBy(xpath="//a[@href=\"/b?ie=UTF8&node=14072630031&ref_=apay_deskhome_APayEMI\"]")
    WebElement EMI;
	@FindBy(xpath="//a[@href=\"/cpe/managepaymentmethods?ref_=apay_deskhome_SavedCards\"]")
    WebElement savedcard;
	@FindBy(xpath="//div[@id=\"BankAccounts\"]")
    WebElement bankid;
	@FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=202123450&ref_=apay_deskhome_Help\"]")
    WebElement FAQ;
	@FindBy(xpath="//input[@id='helpsearch']")
    WebElement help;
	@FindBy(xpath="//i[@class='a-icon a-icon-search']")
    WebElement search;
	@FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
    WebElement signin;
	@FindBy(xpath="//div[@id='glow-ingress-block']")
    WebElement deliver;
	@FindBy(xpath="//span[@class='a-button a-button-toggle GLUX_Block a-button-selected']")
    WebElement Address;
	@FindBy(xpath="//a[@id='nav-orders']")
    WebElement Orders;
	@FindBy(xpath="//span[@id='a-autoid-1-announce']")
    WebElement history;
	@FindBy(xpath="//A[@id='time-filter_2']")
    WebElement past;
	@FindBy(xpath="//li[@role='tab'][2]/span")
    WebElement buyagain;
	@FindBy(xpath="//a [text()='Not Yet Shipped']")
    WebElement Notyetshipped;
	@FindBy(xpath="//div[@id='hmenu-customer-profile']")
    WebElement youraccount;
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
    WebElement all;
	@FindBy(xpath="//li/a[text()='Customer Service']")
    WebElement services;
	@FindBy(xpath="//a[text()='Sign Out']")
    WebElement signout;
	
	
	public WebElement signout_element()
	{
		return signout;
	}
	public WebElement services_element()
	{
		return services;
	}
	public WebElement all_element()
	{
		return all;
	}
	public WebElement youraccount_element()
	{
		return youraccount;
	}
	public WebElement Notyetshipped_element()
	{
		return Notyetshipped;
	}
	public WebElement buyagain_element()
	{
		return buyagain;
	}
	public WebElement past_element()
	{
		return past;
	}
	public WebElement history_element()
	{
		return history;
	}
	public WebElement Orders_element()
	{
		return Orders;
	}
	public WebElement Address_element()
	{
		return Address;
	}
	public WebElement deliver_element()
	{
		return deliver;
	}
	public WebElement signin_element()
	{
		return signin;
	}
	public WebElement search_element()
	{
		return search;
	}

	public WebElement help_element()
	{
		return help;
	}
	public WebElement FAQ_element()
	{
		return FAQ;
	}
	public WebElement bankid_element()
	{
		return bankid;
	}
	public WebElement savedcard_element()
	{
		return savedcard;
	}
	public WebElement logo_element()
	{
		return logo;
	}
	public WebElement Iconlocation_element()
	{
		return  Iconlocation;
	}
	public WebElement Iconsearchbox_element()
	{
		return Iconsearchbox;
	}
	public WebElement Iconsignin_element()
	{
		return Iconsignin;
	}
	public WebElement Iconcart_element()
	{
		return Iconcart;
	}
	public WebElement Iconmenu_element()
	{
		return Iconmenu;
	}
	public WebElement Iconminitv_element()
	{
		return Iconminitv;
	}
	public WebElement Iconsell_element()
	{
		return Iconsell;
	}
	public WebElement Iconbestsell_element()
	{
		return Iconbestsell;
	}
	public WebElement Iconmobiles_element()
	{
		return Iconmobiles;
	}
	public WebElement searchIcon_element()
	{
		return searchIcon;
	}
	public WebElement Iphone_element()
	{
		return Iphone;
	}
	
	public WebElement Email_element()
	{
		return Email;
	}
	public WebElement Continue_element()
	{
		return Continue;
	}
	public WebElement alert_element()
	{
		return alert;
	}
	public WebElement signinbutton_element()
	{
		return signinbutton;
	}
	public WebElement alert1_element()
	{
		return alert1;
	}
	public WebElement password_element()
	{
		return password;
	}
	public WebElement alert2_element()
	{
		return alert2;
	}
	public WebElement forgotpassword_element()
	{
		return forgotpassword;
	}
	public WebElement returnorder_element()
	{
		return returnorder;
	}
	public WebElement backwordtab_element()
	{
		return backwordtab;
	}
	public WebElement forwordtab_element()
	{
		return forwordtab;
	}
	public WebElement backtoup_element()
	{
		return backtoup ;
	}
	public WebElement summersale_element()
	{
		return summersale ;
	}
	public WebElement ExpiringSoon_element()
	{
		return ExpiringSoon ;
	}
	public WebElement ExpiringSoonoption_element()
	{
		return ExpiringSoonoption ;
	}
	public WebElement booktravel_element()
	{
		return booktravel ;
	}
	public WebElement addmoney_element()
	{
		return addmoney ;
	}
	public WebElement addgiftcard_element()
	{
		return addgiftcard ;
	}
	public WebElement accountsetting_element()
	{
		return accountsetting ;
	}
	public WebElement transaction_element()
	{
		return transaction ;
	}
	public WebElement Rewards_element()
	{
		return Rewards ;
	}
	public WebElement donate_element()
	{
		return donate ;
	}
	public WebElement EMI_element()
	{
		return EMI ;
	}
	
	}
	

	

