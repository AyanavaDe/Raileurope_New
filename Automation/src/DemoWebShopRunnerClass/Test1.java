package DemoWebShopRunnerClass;

import DemoWebShopPages.BrowserOpenClose;
import DemoWebShopPages.RegistrationPage1;
 
public class Test1 extends BrowserOpenClose 
{
	//static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException 
	{
		
		BrowserOpenClose opcl= new BrowserOpenClose();
		opcl.browserOpen();
		
		RegistrationPage1 rp=new RegistrationPage1(driver);
		rp.registerLink();
		opcl.browserClose();
		
 
	}
 
}