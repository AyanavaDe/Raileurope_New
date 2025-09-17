package DemoWebShopBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage 
{
	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Register']")     
	private WebElement RegistrationLink;
	
	@FindBy(xpath = "//label[.='Male']")     
	private WebElement GenderRadio1;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement GenderRadio2;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement FirstName;
		
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement RegisterButton;
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	 }
	
	public WebElement RegistrationLink()
	{
		return RegistrationLink;
	 }
	
	public WebElement GenderRadio1()
	{
		return GenderRadio1;
	 }
	
	public WebElement GenderRadio2()
	{
		return GenderRadio2;
	 }
	
	public WebElement FirstName()
	{
		return FirstName;
	 }
	
	public WebElement LastName()
	{
		return LastName;
	 }
	public WebElement Email()
	{
		return Email;
	 }
	public WebElement Password()
	{
		return Password;
	 }
	public WebElement ConfirmPassword()
	{
		return Password;
	 }
	public WebElement RegisterButton()
	{
		return RegisterButton;
	 }
	
	
	
	
	
	
	
	
	
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//		WebDriver driver;
////		driver.navigate().to("https://demowebshop.tricentis.com/register");
////		driver.manage().window().maximize();
////		Thread.sleep(7000);
//		WebElement GenderRadio1 = driver.findElement(By.xpath("//label[.='Male']"));
//		WebElement GenderRadio2 = driver.findElement(By.xpath("//label[.='Female']"));
//		WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
//		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
//		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
//		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
//		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
//		WebElement RegisterButton = driver.findElement(By.xpath("//input[@id='register-button']"));
//		
//		
////		GenderRadio1.click();
////		Thread.sleep(2000);
////		GenderRadio2.click();		
////		driver.quit();

//	}
//
}
