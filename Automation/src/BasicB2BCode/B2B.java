package BasicB2BCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class B2B
{
public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://sandbox.era.raileurope.com/sign-in");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("etroadec");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("P@ssword01");
	driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();                                                            //signin button
	Thread.sleep(7000);
	
	
  }
}