package Trezy_Generic;

import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;
import org.testng.annotations.Test;

import java.awt.Scrollbar;
import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test; 
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Trezy extends Base_class
{
	static String value="";
	static String value1="";
	private Object window;
	
@Test(priority = 1)

public void test1() throws InterruptedException
    {
	value=Generic_DDT_fetch.Origin_Fetch("TestCases", 2 , 5);
	value1=Generic_DDT_fetch.Destination_Fetch("TestCases", 2 , 6);
	WebDriverWait wait = new WebDriverWait(driver, 20);
    
	 POM_Class p = new POM_Class(driver);
    
	 p.Azure_AD_SSO_CloudFlare_Access().click();
     
     WebElement username = p.RailEurope_Login_id();
     username.click();
     Thread.sleep(2000);
     username.sendKeys("skoner@raileurope.com");
     Thread.sleep(3000);
     
     p.Next().click();
     
     WebElement pass = p.RailEurope_Login_pass();
     pass.click();
     Thread.sleep(3000);
     pass.sendKeys("96!Plo2");
     Thread.sleep(3000);
     
     p.SignIn().click();
     Thread.sleep(3000);
     
     p.Stay_signed_in_checkbox().click();
     Thread.sleep(2000);
     p.Yes().click();
     Thread.sleep(2000);
     
     p.Login().click();
     Thread.sleep(3000);
     
     WebElement username1 = p.Username_Email();
     username1.click();
     Thread.sleep(3000);
     username1.sendKeys("gguillet");
     Thread.sleep(3000);
     
     WebElement Password = p.Username_pass();
     Password.click();
     Thread.sleep(3000);
     Password.sendKeys("P@ssword01");
     Thread.sleep(3000);
     
     p.Login_Button().click();
     Thread.sleep(3000);
     
                                                            // ADD Soft Assert     
     
     WebElement From_station = p.From();
     From_station.click();
     Thread.sleep(4000);
     From_station.sendKeys(value);
     Thread.sleep(3000);
     From_station.sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     
     WebElement To_station = p.To();
     To_station.click();
     Thread.sleep(4000);
     To_station.sendKeys(value1);
     Thread.sleep(3000);
     To_station.sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     
     //OW
     
     p.Depart().click();
     Thread.sleep(2000);
     
     p.Depart_date().click();
     Thread.sleep(2000);
     
//     p.Depart_date1().click();
//     Thread.sleep(2000);
//     
//     p.Next1().click();
//     Thread.sleep(2000);
//     
//     p.Depart_date2().click();
//     Thread.sleep(2000);
//     
//     p.Depart_date3().click();
//     Thread.sleep(2000);
 
     
//     WebElement time3 = p.Depart_time();
//     time3.click();
//     Thread.sleep(2000);
//     WebElement select_time = time3.findElement(By.xpath("//div[@id='Ffc3nPaxhe']/ul/li[@data-label='07:00 AM']"));                                // 12 = 12:30 PM (12 no. time)
//     Thread.sleep(2000);
//     select_time.click();
//     Thread.sleep(2000);
     
     
     
    
//     // Locate and click the departure time dropdown
//     WebElement time3 = wait.until(ExpectedConditions.elementToBeClickable(p.Depart_time())); 
//     time3.click();
//
//     // Locate the scrollable container that holds time options
//     WebElement timeOptionsContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Ffc3nPaxhe']/ul"))); 
//
//     // Locate the time option you want to select
//     String timeToSelect = "08:00";
//     WebElement selectTimeOption = timeOptionsContainer.findElement(By.xpath("//li[@data-label='" + timeToSelect + "']"));
//
//     // Scroll into view
//     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectTimeOption);
//
//     // Wait until the time option is clickable and then click
//     wait.until(ExpectedConditions.elementToBeClickable(selectTimeOption)).click();
//    
     
     WebElement ele = p.Time_selection();
     Point loc = ele.getLocation();
     int a=loc.getX();
     int b=loc.getY();
     
     driver.manage().window().maximize(); 
     
     JavascriptExecutor js = (JavascriptExecutor)driver;
     //js.executeScript("window.scrollBy(a,b)");
//     js.executeScript(arguments[0].scrollIntoView(true), Scro);
     
     //RT
     
     Actions actions = new Actions(driver);
     
     WebElement target_element = p.Return();
     Thread.sleep(2000);
     actions.doubleClick(target_element);
     Thread.sleep(2000);
     
     p.Return_date().click();
     Thread.sleep(2000);
     
//     p.Return_date1().click();
//     Thread.sleep(2000);
//     
//     p.Next2().click();
//     Thread.sleep(2000);
//     
//     p.Return_date2().click();
//     Thread.sleep(2000);
//     
//     p.Return_date3().click();
//     Thread.sleep(2000);
     
//     WebElement time4 = p.Return_time();
//     time4.click();
//     Thread.sleep(2000);
//     WebElement select_time1 = time4.findElement(By.xpath("//div[@id='Ffc3nPaxhe']/ul/li[@data-label='08:00 AM']"));                                // 12 = 12:30 PM (12 no. time)
//     Thread.sleep(2000);
//     select_time1.click();
//     Thread.sleep(2000);
     
     
    
 

    }

 }