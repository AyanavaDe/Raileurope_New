package DemoWebShopPages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class RegistrationPage1 extends BrowserOpenClose 
{
 
	@FindBy(xpath = "//a[.='Register']")
	WebElement registerlink;
	
	public void registerLink()
	{
		registerlink.click();
	}
		
	public RegistrationPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}