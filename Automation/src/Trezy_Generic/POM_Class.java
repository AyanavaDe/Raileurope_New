package Trezy_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class
{
	WebDriver driver;
	
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
    
    
    
    @FindBy(xpath="//button[@name='languageCurrencySelectionButton']")
    private WebElement Apply_Language_currency;
    
    
    //Login
    
    @FindBy(xpath="//a[@aria-label='login-button']")
    private WebElement Login;
    
    @FindBy(xpath="//input[@id='desktop_email']")
    private WebElement Username_Email;
    
    @FindBy(xpath="//input[@id='desktop_password']")
    private WebElement Username_pass;
    
    @FindBy(xpath="(//span[.='Login'])[3]")
    private WebElement Login_Button;
    
    
    
    @FindBy(xpath="//input[@id='originLabel']")
    private WebElement From;
    
    @FindBy(xpath="//input[@id='destinationLabel']")
    private WebElement To;
    
    //OW journey
    
    @FindBy(xpath="//*[name()='svg'][@class='inline icon']") 
    private WebElement Depart_date_picker;
    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=27]")                     //current month (Specify the date within i.e. [.=19])
//    private WebElement Depart_date;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=19]")                     //next month (Specify the date within i.e. [.=20])
    private WebElement Depart_date1;
//    
//    @FindBy(xpath="//button[@aria-label='Next']")                                                            //Click on Next (month) Button
//    private WebElement Next1;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=19]")                     //Next >> current month (Specify the date within i.e. [.=19])
//    private WebElement Depart_date2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=19]")                     //Next >> next month (Specify the date within i.e. [.=20])
//    private WebElement Depart_date3;
    
    @FindBy(xpath="//input[@id='hours']")                                               
    private WebElement Depart_time;
    
    @FindBy(xpath="(//input[@id='hours']/../../../../../following-sibling::div[1]/ul/li)[15]")                   //specify time as i.e. '7'                     
    private WebElement Depart_time_select;
    
                // Time : 1=00:00    //    5=02:00  //    9=04:00  //    13=06:00  //    17=08:00  //    21=10:00
                //        2=00:30    //    6=02:30  //   10=04:30  //    14=06:30  //    18=08:30  //    22=10:30
                //        3=01:00    //    7=03:00  //   11=05:00  //    15=07:00  //    19=09:00  //    23=11:00
                //        4=01:30    //    8=03:30  //   12=05:30  //    16=07:30  //    20=09:30  //    24=11:30
                                                                                                                 
    
    //RT journey
    
    @FindBy(xpath="//span[.='Add return trip']")
    private WebElement Return;
    
    @FindBy(xpath="//button[@data-testid='openDatepicker_returnTravel']")  
    private WebElement Return_date_picker;
    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=29]")                      //current month (Specify the date within i.e. [.=19])
//    private WebElement Return_date;
    
    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=21]")                     //next month (Specify the date within i.e. [.=20])
    private WebElement Return_date1;
//    
//    @FindBy(xpath="//button[@aria-label='Next']")                                                            //Click on Next (month) Button
//    private WebElement Next2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[1]/tbody/tr/td/div[.=19]")                     //Next >> current month (Specify the date within i.e. [.=19])
//    private WebElement Return_date2;
//    
//    @FindBy(xpath="//input[@id='hours']/../../../div[3]/table[2]/tbody/tr/td/div[.=19]")                     //Next >> next month (Specify the date within i.e. [.=20])
//    private WebElement Return_date3;
    
    @FindBy(xpath="//input[@id='hours']")                                               
    private WebElement Return_time;
    
    @FindBy(xpath="(//input[@id='hours']/../../../../../following-sibling::div[1]/ul/li)[16]")                   //specify time as i.e. '7:30'                     
    private WebElement Return_time_select;
    
                // Time : 1=00:00    //    5=02:00  //    9=04:00  //    13=06:00  //    17=08:00  //    21=10:00
                //        2=00:30    //    6=02:30  //   10=04:30  //    14=06:30  //    18=08:30  //    22=10:30
                //        3=01:00    //    7=03:00  //   11=05:00  //    15=07:00  //    19=09:00  //    23=11:00
                //        4=01:30    //    8=03:30  //   12=05:30  //    16=07:30  //    20=09:30  //    24=11:30
                                                                                                              
    
    @FindBy(xpath="//button[@aria-label='Passenger']")                                               
    private WebElement Passenger;
    
    
    @FindBy(xpath="//input[@id='passengerType-0']")                                               
    private WebElement Passenger_type;
    
    @FindBy(xpath="//input[@id='passengerType-1']")                                               
    private WebElement Passenger_type1;
    
    @FindBy(xpath="//input[@id='passengerType-2']")                                               
    private WebElement Passenger_type2;
    
    @FindBy(xpath="//input[@id='passengerType-3']")                                               
    private WebElement Passenger_type3;
    
    
    @FindBy(xpath="//li[@data-label='Adult (ages 30-59)']")                                               
    private WebElement Adult_Passenger;
    
    @FindBy(xpath="//li[@data-label='Youth (ages 0-29)']")                                               
    private WebElement Youth_Passenger;
    
    @FindBy(xpath="//li[@data-label='Senior (ages 60+)']")                                               
    private WebElement Senior_Passenger;
    
    @FindBy(xpath="//span[.='Add more passengers ']")                                               
    private WebElement Add_more_passenger;
    
    @FindBy(xpath="//button/span[.='Search']")                                               
    private WebElement Search_button;
  
    
    //Select OW result (taken 2nd ----> & change grouping id for selecting diff result)
    @FindBy(xpath="(//div[@data-testid='train-connection'])[2]")                                               
    private WebElement Search_OW_results_2nd;
    
    
    //Select OW fare (taken 2nd ----> & change grouping id for selecting diff fare)
    @FindBy(xpath="(//div[@data-testid=\"condition-card\"])[2]")                                               
    private WebElement Select_OW_fare_2nd;
    
    
    @FindBy(xpath="//button/span[.='Next']")                                               
    private WebElement Next_button_of_fare_selection_page;
    
    
    //Select RT result (taken 2nd ----> & change grouping id for selecting diff result)
    @FindBy(xpath="(//div[@data-testid='train-connection'])[1]")                                               
    private WebElement Search_RT_results_1st;
    
    
    //Select RT fare (taken 2nd ----> & change grouping id for selecting diff fare)
    @FindBy(xpath="(//div[@data-testid=\"condition-card\"])[1]")                                               
    private WebElement Select_RT_fare_1st;
    
   
    //Add passenger details
    @FindBy(xpath="//input[@value='MR']")                                               
    private WebElement title;
    
    @FindBy(xpath="//input[@id='firstName-0']")                                               
    private WebElement First_name;
    
    @FindBy(xpath="//input[@id='lastName-0']")                                               
    private WebElement Last_name;
    
    @FindBy(xpath="//input[@id='dateOfBirth-0']")                                               
    private WebElement DOB_Month;
    
    @FindBy(xpath="//input[@id='dateOfBirth-0-day']")                                               
    private WebElement DOB_Day;
    
    @FindBy(xpath="//input[@id='dateOfBirth-0-year']")                                               
    private WebElement DOB_Year;
    
    @FindBy(xpath="//input[@id='email-0']")                                               
    private WebElement Email;
    
    @FindBy(xpath="//input[@id='phoneCountryCode-0']")                                               
    private WebElement Country_code;
    
    @FindBy(xpath="//input[@id='phoneNumber-0']")                                               
    private WebElement Phone_No;
    
    @FindBy(xpath="//input[@id='countryOfResidence-0']")                                               
    private WebElement Country_of_residence;
    
    @FindBy(xpath="//button/span[.='Add to cart']")                                               
    private WebElement Add_to_cart;
    
    
    
	public POM_Class(WebDriver driver)
	{
		this.driver=driver;
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
	
	public WebElement Apply_Language_currency()
	{
		return Apply_Language_currency;
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
	
	public WebElement Depart_date_picker()
	{
		return Depart_date_picker;
	 }
	
//	public WebElement Depart_date()
//	{
//		return Depart_date;
//	 }
	
	public WebElement Depart_date1()
	{
		return Depart_date1;
	 }
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
	
	public WebElement Depart_time()
	{
		return Depart_time;
	 }
	
	public WebElement Depart_time_select()
	{
		return Depart_time_select;
	 }
		
	
	public WebElement Return()
	{
		return Return;
	 }
	
	public WebElement Return_date_picker()
	{
		return Return_date_picker;
	 }
	
//	public WebElement Return_date()
//	{
//		return Return_date;
//	 }
	
	public WebElement Return_date1()
	{
		return Return_date1;
	 }
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
	
	public WebElement Return_time_select()
	{
		return Return_time_select;
	 }
	
	public WebElement Passenger()
	{
		return Passenger;
	 }
	
	public WebElement Passenger_type()
	{
		return Passenger_type;
	 }
	
	public WebElement Passenger_type1()
	{
		return Passenger_type;
	 }
	
	public WebElement Passenger_type2()
	{
		return Passenger_type;
	 }
	
	public WebElement Passenger_type3()
	{
		return Passenger_type;
	 }
	
	public WebElement Adult_Passenger()
	{
		return Adult_Passenger;
	 }
	
	public WebElement Youth_Passenger()
	{
		return Youth_Passenger;
	 }
	
	public WebElement Senior_Passenger()
	{
		return Senior_Passenger;
	 }
	
	public WebElement Add_more_passenger()
	{
		return Add_more_passenger;
	 }
	
	public WebElement Search_button()
	{
		return Search_button;
	 }
	
	public WebElement Search_OW_results_2nd()
	{
		return Search_OW_results_2nd;
	 }
	
	public WebElement Select_OW_fare_2nd()
	{
		return Select_OW_fare_2nd;
	 }
	
	public WebElement Next_button_of_fare_selection_page()
	{
		return Next_button_of_fare_selection_page;
	 }
	
	public WebElement Search_RT_results_1st()
	{
		return Search_RT_results_1st;
	 }
	
	public WebElement Select_RT_fare_1st()
	{
		return Select_RT_fare_1st;
	 }
	
	public WebElement title()
	{
		return title;
	 }
	
	public WebElement First_name()
	{
		return First_name;
	 }
	
	public WebElement Last_name()
	{
		return Last_name;
	 }
	
	public WebElement DOB_Month()
	{
		return DOB_Month;
	 }
	
	public WebElement DOB_Day()
	{
		return DOB_Day;
	 }
	
	public WebElement DOB_Year()
	{
		return DOB_Year;
	 }
	
	public WebElement Email()
	{
		return Email;
	 }
	
	public WebElement Country_code()
	{
		return Country_code;
	 }
	
	public WebElement Phone_No()
	{
		return Phone_No;
	 }
	
	public WebElement Country_of_residence()
	{
		return Country_of_residence;
	 }
	
	public WebElement Add_to_cart()
	{
		return Add_to_cart;
	 }
	
	
	
}