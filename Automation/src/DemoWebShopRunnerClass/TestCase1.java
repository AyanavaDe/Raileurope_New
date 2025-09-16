package DemoWebShopRunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
;

public class TestCase1 extends DemoWebShopPages.RegistrationPage
{
	@Test(priority = 1)

	public void test1() throws InterruptedException
	    {
		
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    
	    }
}
