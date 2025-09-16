package DemoWebShopPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
		
		
		
		
		//driver.quit();

	}

}
