package DemoWebShopRunnerClass;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.internal.Arguments;

import DemoWebShopPages.BaseClass;
import DemoWebShopPages.RegistrationPage;
import Trezy_Generic.Base_class;
import net.bytebuddy.asm.Advice.Argument;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase1 extends BaseClass
{
//	private static final Object Depart_time_select = null;
//	static String value="";
//	static String value1="";
	WebDriver driver = null;
@Test(priority = 1)

public void test1() throws InterruptedException
    {

	//	value=Generic_DDT_fetch.Origin_Fetch("TestCases", 2 , 5);
//	value1=Generic_DDT_fetch.Destination_Fetch("TestCases", 2 , 6);
	WebDriverWait wait = new WebDriverWait(driver, 20);
    
	 RegistrationPage r = new RegistrationPage(driver);
	 
	 r.RegistrationLink().click();
	 r.GenderRadio1().click();
     
    
    }
}