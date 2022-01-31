package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3 {
	public static void main(String arg[]) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyalin");
	driver.findElement(By.name("birthDate")).sendKeys("25-03-1995");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
	driver.findElement(By.name("departmentName")).sendKeys("CSE");
	Thread.sleep(2000);
	
	driver.findElement(By.name("numberEmployees")).sendKeys("500");
	Thread.sleep(2000);
	driver.findElement(By.name("tickerSymbol")).sendKeys("TST");
	Thread.sleep(2000);
	driver.findElement(By.name("lastNameLocal")).sendKeys("Dany");
	Thread.sleep(2000);

	WebElement campaign=driver.findElement(By.name("marketingCampaignId"));
	Select marketing=new Select(campaign);
	marketing.selectByVisibleText("Automobile");

	WebElement SourceId=driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source=new Select(SourceId);
	source.selectByVisibleText("Employee");
	driver.findElement(By.name("firstNameLocal")).sendKeys("Priya");
	Thread.sleep(2000);
	
	driver.findElement(By.name("personalTitle")).sendKeys("Mrs");
	Thread.sleep(2000);
	
	driver.findElement(By.name("generalProfTitle")).sendKeys("Student");
	Thread.sleep(2000);
	
	driver.findElement(By.name("annualRevenue")).sendKeys("100000");
	Thread.sleep(2000);
	
	WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select industry1=new Select(industry);	
	industry1.selectByValue("IND_FINANCE");
	Thread.sleep(2000);
	
	WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select owner=new Select(ownership);
	owner.selectByIndex(2);
	
	driver.findElement(By.name("sicCode")).sendKeys("1234");
	Thread.sleep(2000);
	
	driver.findElement(By.name("description")).sendKeys("New to this IT Field");
	Thread.sleep(2000);
	
	driver.findElement(By.name("importantNote")).sendKeys("Fresher");
	Thread.sleep(2000);
	

	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
	Thread.sleep(2000);
	driver.findElement(By.name("primaryPhoneExtension")).sendKeys("964");
	Thread.sleep(2000);
	
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9443869452");
	Thread.sleep(2000);
	
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyalindany@gmail.com");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Father");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("primaryWebUrl")).sendKeys("https://developer.mozilla.org");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalToName")).sendKeys("Hoff");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalAddress1")).sendKeys("No:1 HB");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalCity")).sendKeys("Chennai");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalPostalCode")).sendKeys("118");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalPostalCodeExt")).sendKeys("600118");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Arth");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("generalAddress2")).sendKeys("B-2/6,MH Nagar");
	 Thread.sleep(2000);
	 
	    WebElement s=driver.findElement(By.name("generalStateProvinceGeoId"));  
		Select s1=new Select(s);	
		s1.selectByVisibleText("Indiana");
		Thread.sleep(2000);
		
		
		WebElement country=driver.findElement(By.name("generalCountryGeoId")); 
	    Select c2=new Select(country);	
	    c2.selectByVisibleText("Belgium");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submitButton")).click();
		
		
	 
	

	 
	}
}
