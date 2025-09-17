package DemoWebShopRunnerClass;

import org.openqa.selenium.support.ui.WebDriverWait;

import DemoWebShopPages.BrowserOpenClose;
import DemoWebShopPages.LoginPage;
import DemoWebShopPages.RegistrationPage1;
 
public class Test1 extends BrowserOpenClose 
{
	WebDriverWait wait = new WebDriverWait(driver, 1000);
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		BrowserOpenClose opcl= new BrowserOpenClose();
		opcl.browserOpen();
		RegistrationPage1 r=new RegistrationPage1(driver);       //Registration
		r.registerLink();
		r.RadioMale();
		r.FirstName();
		r.LastName();
		r.Email();
		r.Password();
		r.ConfirmPassword();
		r.RegisterButton();
		r.LogOutLink();                                         //LogOut
		
				
		LoginPage l=new LoginPage(driver);                      //LogIn
		l.LogInLink();
		l.email();
		l.password();
		l.RememberMeCheckbox();
		l.LogInButton();
		l.LogOutLink();                                         //LogOut
		
		
		
		opcl.browserClose();		
		System.out.println("The test is Pass");
 
	}
 
}