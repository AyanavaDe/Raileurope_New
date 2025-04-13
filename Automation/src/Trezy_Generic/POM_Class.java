package Trezy_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class
{
	@FindBy(xpath = "//a[@id='idp1']")     
	private WebElement Azure_AD_SSO_CloudFlare_Access;
	
	@FindBy(xpath="//input[@id='i0116']")
	private WebElement RailEurope_Login_id;
	
	@FindBy(xpath="//input[@value='Next']")
	private WebElement Next;
		
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement RailEurope_Login_pass;
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement SignIn;
	
    @FindBy(xpath="//input[@id='KmsiCheckboxField']")
    private WebElement Stay_signed_in_checkbox;
	
    @FindBy(xpath="//input[@value='Yes']")
    private WebElement Yes;
    
    @FindBy(xpath="//span[.='Login']/../../following-sibling::div[1]/a")
    private WebElement Login;
    
    @FindBy(xpath="//input[@id='desktop_email']")
    private WebElement Username_Email;
    
    @FindBy(xpath="//input[@id='desktop_password']")
    private WebElement Username_pass;
    
    @FindBy(xpath="(//a[@href='/password-reset']/following-sibling::button[1]/span)[1]")
    private WebElement Login_Button;
    
    @FindBy(xpath="//input[@id='from']")
    private WebElement From;
    
    @FindBy(xpath="//input[@id='to']")
    private WebElement To;
    
    ////OW  
    
    @FindBy(xpath="//button[@data-testid='openDatepicker_travel-date']")
    private WebElement Depart;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=19]")                     //current month (Specify the date within i.e. [.=19])
    private WebElement Depart_date;
    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=20]")                     //next month (Specify the date within i.e. [.=20])
//    private WebElement Depart_date1;
//    
//    @FindBy(xpath="//button[@aria-label='Next']")                                                            //Click on Next (month) Button
//    private WebElement Next1;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=19]")                     //Next >> current month (Specify the date within i.e. [.=19])
//    private WebElement Depart_date2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=20]")                     //Next >> next month (Specify the date within i.e. [.=20])
//    private WebElement Depart_date3;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[4]/div/input[1]")                                               
    private WebElement Depart_time_dropdown;
    
    @FindBy(xpath="//div[@id='6zMNDvkZPK']")                                               
    private WebElement Depart_time_container;
   
    @FindBy(xpath="//li[@data-label='08:00']")                                               
    private WebElement Time_selection;
    
  
    
    ////RT
    
    @FindBy(xpath="//button[@data-testid='addReturn']")
    private WebElement Return;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=21]")                     //current month (Specify the date within i.e. [.=21])
    private WebElement Return_date;
    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=20]")                     //next month (Specify the date within i.e. [.=20])
//    private WebElement Return_date1;
//    
//    @FindBy(xpath="//button[@aria-label='Next']")                                                            //Click on Next (month) Button
//    private WebElement Next2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=19]")                     //Next >> current month (Specify the date within i.e. [.=19])
//    private WebElement Return_date2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=20]")                     //Next >> next month (Specify the date within i.e. [.=20])
//    private WebElement Return_date3;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[4]/div/input[1]")                                               
    private WebElement Return_time;
    
//    @FindBy(xpath="//div[@id='Ffc3nPaxhe']/ul")                                               
//    private WebElement Return_time_container;
    
    
	
	public POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	 }
	
	public WebElement Azure_AD_SSO_CloudFlare_Access()
	{
		return Azure_AD_SSO_CloudFlare_Access;
	 }
	
	public WebElement RailEurope_Login_id()
	{
		return RailEurope_Login_id;
	 }
	
	public WebElement Next()
	{
		return Next;
	 }
	
	public WebElement RailEurope_Login_pass()
	{
		return RailEurope_Login_pass;
	 }
	
	public WebElement SignIn()
	{
		return SignIn;
	 }
	
	public WebElement Stay_signed_in_checkbox()
	{
		return Stay_signed_in_checkbox;
	 }
	
	public WebElement Yes()
	{
		return Yes;
	 }
	
	public WebElement Login()
	{
		return Login;
	 }
	
	public WebElement Username_Email()
	{
		return Username_Email;
	 }
	
	public WebElement Username_pass()
	{
		return Username_pass;
	 }
	
	public WebElement Login_Button()
	{
		return Login_Button;
	 }
	
	public WebElement From()
	{
		return From;
	 }
	
	public WebElement To()
	{
		return To;
	 }
	
	public WebElement Depart()
	{
		return Depart;
	 }
	
	//OW
	
	public WebElement Depart_date()
	{
		return Depart_date;
	 }
	
//	public WebElement Depart_date1()
//	{
//		return Depart_date1;
//	 }
//	
//	public WebElement Next1()
//	{
//		return Next1;
//	 }
//	
//	public WebElement Depart_date2()
//	{
//		return Depart_date2;
//	 }
//	
//	public WebElement Depart_date3()
//	{
//		return Depart_date3;
//	 }
	
	public WebElement Depart_time_dropdown()
	{
		return Depart_time_dropdown;
	 }
	
	public WebElement Depart_time_container()
	{
		return Depart_time_container;
	 }
		
	public WebElement Time_selection()
	{
		return Time_selection;
	 }
	
	
	
	
	//RT
	
	public WebElement Return()
	{
		return Return;
	 }
	
	public WebElement Return_date()
	{
		return Return_date;
	 }
	
//	public WebElement Return_date1()
//	{
//		return Return_date1;
//	 }
//	
//	public WebElement Next2()
//	{
//		return Next2;
//	 }
//	
//	public WebElement Return_date2()
//	{
//		return Return_date2;
//	 }
//	
//	public WebElement Return_date3()
//	{
//		return Return_date3;
//	 }
	
	public WebElement Return_time()
	{
		return Return_time;
	 }
  
//	public WebElement Return_time_container()
//	{
//		return Return_time_container;
//	 }
    
    
 	
	
}