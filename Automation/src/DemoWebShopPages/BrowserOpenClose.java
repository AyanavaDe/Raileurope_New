package DemoWebShopPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class BrowserOpenClose {
 
	static String key = "webdriver.chrome.driver";
	static String value = "./Softwares/chromedriver.exe";
	public static WebDriver driver;        //Using static for call the already initialized driver (Static --> Static)
 
	public void browserOpen() throws InterruptedException {
	System.setProperty(key, value);
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	}
	
	public void browserClose() throws InterruptedException
	{
		System.setProperty(key, value);
		Thread.sleep(1000);
		driver.quit();
	}
 
}