package DemoWebShopPages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class RegistrationPage1 extends BrowserOpenClose 
{
 
	@FindBy(xpath = "//a[.='Register']")
	WebElement registerlink;
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement male;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement female;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerbutton;
	
	@FindBy(xpath="//a[.='Log out']")
	WebElement LogOutLink;
	

	
	public void registerLink()
	{
		registerlink.click();
	}
	public void RadioMale() 
	{
		male.click();
	}
	
	public void RadioFeMale() 
	{
		female.click();
	}
	
	public void FirstName() 
	{
		firstname.sendKeys("Arijit");
	}
	
	public void LastName() 
	{
		lastname.sendKeys("Ayanava");
	}
	
	public void Email()
	{
		email.sendKeys("pocdemoshop11@yopmail.com");
	}
	
	public void Password()
	{
		password.sendKeys("testing123");
	}
	
	public void ConfirmPassword()
	{
		confirmpassword.sendKeys("testing123");
	}
	
	public void RegisterButton() 
	{
		registerbutton.click();
	}
	
	public void LogOutLink()
	{
		LogOutLink.click();
	}
	
	
	public RegistrationPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}