package Trezy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trezy_TimeDropdown_handled {
	
	@Test
	public void meethod1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		// to get the chrome driver
		driver.get("https://internal-staging.raileurope.com/en");
		Thread.sleep(2000);
		//to maximize the window
		driver.manage().window().maximize();
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.className("AuthBoxRow--name")).click();
//		Thread.sleep(2000);
//		 driver.findelement(by.cssselector("input[name='loginfmt']")).sendkeys("achatterjee@raileurope.com", Keys.ENTER);
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("i0118")).sendKeys("CqV~/5KpuKS#&cV");
//		 driver.findElement(By.id("idSIButton9")).click();
//		 Thread.sleep(15000);
//		 driver.findElement(By.name("DontShowAgain")).click();
//		 driver.findElement(By.id("idSIButton9")).click();
//		 Thread.sleep(2000);
		 driver.findElement(By.id("close-language-currency-modal")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("from")).sendKeys("london");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='scroller svelte-1y6sf78']/ul/li)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("to")).sendKeys("paris");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='scroller svelte-1y6sf78']/ul/li)[1]")).click();
		driver.findElement(By.xpath("//*[name()='svg'][@class='inline icon']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='hours']"));
		ele.click();
		//(//div[@id='gingRfuRGH']/ul/li)[last()]
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='hours']/../../../../../following-sibling::div[1]/ul/li)[last()]")).click();
		//driver.findElement(By.xpath("(//div[@class='z-50 flex max-h-[300px] flex-col overflow-hidden rounded-lg border 18 svelte-1nuxyl1']/ul/li)[16]")).click();
		Thread.sleep(4000);
		//input[@id='hours']
		 driver.quit();
		 
		//div[@role='listbox']/ul/li
		 
	}

}
