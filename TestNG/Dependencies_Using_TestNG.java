package framework.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dependencies_Using_TestNG 
{
	WebDriver driver;
	String url="https://facebook.com";
	String Driver_path="Drivers\\";
	
  @Test(priority=0)
  public void Browser_Launch() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }
  
  @Test(priority=1,dependsOnMethods="Browser_Launch")
  public void Load_page() 
  { 
	 driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  @Test(priority=2,enabled=false,dependsOnMethods="Load_page")
  public void Signin() 
  { 
	 driver.findElement(By.id("email")).sendKeys("kmohan80@yahoo.com");
	 driver.findElement(By.id("pass")).sendKeys("8096058015");
	 driver.findElement(By.name("login")).click();
  }
  
  /*@Test(priority=3,dependsOnMethods="Signin") 
  public void Signout() 
  {
	  driver.findElement(By.xpath("(//i[@class='hu5pjgll lzf7d6o1'])[2]")).click();
	  driver.findElement(By.xpath("(//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg'])[21]/div/span")).click();
	  
  }*/
  
  
  

  @BeforeClass
  public void beforeClass() 
  {
	 
	  System.out.println("pre-condition launched");
	  
  }

  
  @AfterClass
  public void afterClass()
  {
	  System.out.println("post condition terminated");
  }

}
