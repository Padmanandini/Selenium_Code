package framework.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class BeforeMethod_And_AfterMethod 
{
	WebDriver driver;
	String Driver_Path="Drivers\\";
	String Url="https://www.facebook.com/r.php";
	
	
  @Test
  public void Test1() 
  {
	  driver.findElement(By.name("firstname")).sendKeys("Nandini");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", Driver_Path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(Url);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void AfterClass() throws Exception
  {
	  Thread.sleep(4000);
	  driver.close();
  }

}
