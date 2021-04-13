package framework.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramater_Using_TestNG 
{
	WebDriver driver;
	String Driver_Path="Drivers\\";
	
	
	
@BeforeClass
public void Browser_Launch()
{
	System.setProperty("webdriver.chrome.driver", Driver_Path+"chromedriver.exe");
	driver=new ChromeDriver();
	
}
  
  @Parameters("url")
  @Test
  public void Load_Webpage(String Url)
  {
	  driver.navigate().to(Url);
	  driver.manage().window().maximize();
	  
	  
  }
  
  @Parameters({"uid", "pwd"})
  @Test(description="Verifying valid data")
  public void Tc001(String UID, String PWD)
  {
	  driver.findElement(By.id("email")).sendKeys(UID);
	  driver.findElement(By.id("pass")).sendKeys(PWD);
	  
	  
  }
  
  @Test(description="Verifying Invalid data")
  public void Tc002(String UID,String PWD)
  {
	  driver.findElement(By.id("email")).sendKeys(UID);
	  driver.findElement(By.id("pass")).sendKeys(PWD);
  }
  
@AfterClass
 public void afterMethod() throws Exception
 {
	 Thread.sleep(3000);
	 driver.close();
 }
 
}
