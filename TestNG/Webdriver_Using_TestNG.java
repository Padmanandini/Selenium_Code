package framework.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Webdriver_Using_TestNG 
{
	WebDriver driver;
	String Driver_Path="Drivers\\";
	
	
  @Test
  public void Tc001()
  {
	  WebElement roundtrip=driver.findElement(By.id("RoundTrip"));
	  roundtrip.click();
	  
  }
  
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("https://cleartrip.com");
	  driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void afterMethod() throws Exception
  {
	  File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String Screen_path="Screenshots\\test_image.png";
	  FileHandler.copy(screen, new File(Screen_path));
  }

  
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", Driver_Path+"chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(4000);
	  driver.close();
  }

}
