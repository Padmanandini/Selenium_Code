package framework.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel 
{
	
  @Test
  public void test1() 
  {
	  System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize();
  }
}
