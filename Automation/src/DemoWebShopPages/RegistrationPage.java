package DemoWebShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebElement GenderRadio1 = driver.findElement(By.xpath("//label[.='Male']"));
		WebElement GenderRadio2 = driver.findElement(By.xpath("//label[.='Female']"));
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement RegisterButton = driver.findElement(By.xpath("//input[@id='register-button']"));
		
		
		GenderRadio1.click();
		Thread.sleep(2000);
		GenderRadio2.click();
		
		
		
		
		driver.quit();

	}

}
