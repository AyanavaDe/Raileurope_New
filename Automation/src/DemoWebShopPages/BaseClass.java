package DemoWebShopPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements BaseConstant
{
public WebDriver driver;

@BeforeMethod
public void OpenApp()
   {
	System.setProperty(chrome_key, chrome_value);
	driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
   }

@AfterMethod
public void CloseApp()
   {
	driver.close();
   }
}
