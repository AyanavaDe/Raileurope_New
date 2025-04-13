package Trezy_Generic;

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

import net.bytebuddy.asm.Advice.Argument;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Trezy extends Base_class
{
	private static final Object Depart_time_select = null;
	static String value="";
	static String value1="";
	
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
     username.sendKeys("ade@raileurope.com");
     Thread.sleep(2000);
     
     p.Next().click();
     
     WebElement pass = p.RailEurope_Login_pass();
     pass.click();
     Thread.sleep(2000);
     pass.sendKeys("Awds#2024");
     Thread.sleep(2000);
     
     p.SignIn().click();
     Thread.sleep(2000);
     
     p.Stay_signed_in_checkbox().click();
     Thread.sleep(2000);
     p.Yes().click();
     Thread.sleep(2000);
 
     p.Apply_Language_currency().click();
     Thread.sleep(20000);
     
   //Login
     
//     p.Login().click();
//     Thread.sleep(2000);
//     
//     WebElement username1 = p.Username_Email();
//     username1.click();
//     Thread.sleep(2000);
//     username1.sendKeys("ayanava.de@datacoresystems.co.in");
//     Thread.sleep(2000);
//                                                                                                
//     WebElement Password = p.Username_pass();
//     Password.click();
//     Thread.sleep(2000);
//     Password.sendKeys("Ayanava@1998");
//     Thread.sleep(2000);
//     
//     p.Login_Button().click();
//     Thread.sleep(2000);
//     
     
     //search OD
     
     WebElement From_station = p.From();
     From_station.click();
     Thread.sleep(5000);
     From_station.sendKeys(value);
     Thread.sleep(4000);
     From_station.sendKeys(Keys.ENTER);
     Thread.sleep(5000);
     
     WebElement To_station = p.To();
     To_station.click();
     Thread.sleep(2000);
     To_station.sendKeys(value1);
     Thread.sleep(2000);
     To_station.sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     
     //OW Datepicker
     
     p.Depart_date_picker().click();
     Thread.sleep(2000);
     
//     p.Depart_date().click();
//     Thread.sleep(2000);
     
     p.Depart_date1().click();
     Thread.sleep(2000);
//     
//     p.Next1().click();
//     Thread.sleep(2000);
//     
//     p.Depart_date2().click();
//     Thread.sleep(2000);
//     
//     p.Depart_date3().click();
//     Thread.sleep(2000);
     
     WebElement time3 = p.Depart_time();
     time3.click();
     Thread.sleep(3000);
     p.Depart_time_select().click();
     Thread.sleep(3000);


     //RT Datepicker
     
    
//     Actions actions = new Actions(driver); 
//     WebElement target_element = p.Return_date_picker();
//     Thread.sleep(2000);
//     actions.doubleClick(target_element);
//     Thread.sleep(2000);
 //    --------------------------------------------------
     
     p.Return().click();
     Thread.sleep(3000);
     
     p.Return_date_picker().click();
     Thread.sleep(2000);
     
//     p.Return_date().click();
//     Thread.sleep(2000);
     
     p.Return_date1().click();
     Thread.sleep(2000);
//     
//     p.Next2().click();
//     Thread.sleep(2000);
//     
//     p.Return_date2().click();
//     Thread.sleep(2000);
//     
//     p.Return_date3().click();
//     Thread.sleep(2000);
     
      WebElement time4 = p.Return_time();
      time4.click();
      Thread.sleep(2000);
      p.Return_time_select().click();
      Thread.sleep(2000);
      
//      //1A (it's by default 1A)
//      p.Passenger().click();
//      Thread.sleep(2000);
//      
//      //2A
//      p.Passenger().click();
//      Thread.sleep(2000);
//      p.Add_more_passenger().click();
//      Thread.sleep(2000);
//      
      //1S
      p.Passenger().click();
      Thread.sleep(2000);
      p.Passenger_type().click();
      Thread.sleep(2000);
      p.Senior_Passenger().click();
      Thread.sleep(2000);
      
//      //2S
//      p.Passenger().click();
//      Thread.sleep(2000);
//      p.Passenger_type().click();
//      Thread.sleep(2000);
//      p.Senior_Passenger().click();
//      Thread.sleep(2000);
//      
//      p.Add_more_passenger().click();
//      Thread.sleep(3000);
//      
//      p.Passenger_type1().click();
//      Thread.sleep(2000);
//      p.Senior_Passenger().click();
//      Thread.sleep(2000);
      
      p.Search_button().click();
      Thread.sleep(2000);
      
      p.Search_OW_results_2nd().click();
      Thread.sleep(2000);
      p.Select_OW_fare_2nd().click();
      Thread.sleep(2000);
      p.Next_button_of_fare_selection_page().click();
      Thread.sleep(2000);
      
      p.Search_RT_results_1st().click();
      
    }

 }