package DemoWebShopPages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPage  
{
 
	@FindBy(xpath = "//a[.='Log in']")
	WebElement LogInLink;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='RememberMe']")
	WebElement RememberMeCheckbox;
	
	@FindBy(xpath = "//a[.='Forgot password?']")
	WebElement ForgotPasswordLink;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement LogInButton;
	
	@FindBy(xpath="//a[.='Log out']")
	WebElement LogOutLink;
	
	
	public void LogInLink()
	{
		LogInLink.click();
	}
	
	public void email()
	{
		email.sendKeys("pocdemoshop13@yopmail.com");
	}
	
	public void password()
	{
		password.sendKeys("testing123");
	}
	
	public void RememberMeCheckbox()
	{
		RememberMeCheckbox.click();
	}
	
	public void ForgotPasswordLink()
	{
		ForgotPasswordLink.click();
	}
	
	public void LogInButton()
	{
		LogInButton.click();
	}
	
	public void LogOutLink()
	{
		LogOutLink.click();
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}