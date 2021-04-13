package framework.TestNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DataProvider_Using_TestNG 
{
	WebDriver driver;
	String Driver_Path="Drivers\\";
	
	@BeforeClass
	public void Browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver", Driver_Path+"chromedriver.exe");
		driver=new ChromeDriver();
	}
	
@Parameters("URL")	
@Test(priority=0)
public void method1(String url)
{
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	

  @Test(priority=1,dataProvider="data")
  public void SignUp_page(String firstname, String lastname,String email,String retype_email) 
  {
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	  driver.findElement(By.id("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(email);
	  driver.findElement(By.name("reg_email_confirmation__")).sendKeys(retype_email);
  }

  
  @DataProvider(name="data")
  public String[][] Inputdata() 
  {
     String[][] data=new String[1][4];
	  data[0][0]="Nandini";
	  data[0][1]="Nandu";
	  data[0][2]="abc@gamil.com";
	  data[0][3]="abc@gmail.com";
	  
	  return data;
      
  }
    
    
    
    
  
}
