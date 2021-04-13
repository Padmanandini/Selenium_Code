package framework.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Test_Using_TestNG extends MethodsClass 
{
	

  @Parameters({"URL","email", "pswd"})
  @Test
  public void tc_001(String url, String email_id, String password) throws Exception 
  {
	  Thread.sleep(5000);
	  getdriver().navigate().to(url);
	  Thread.sleep(5000);
	  getdriver().findElement(By.cssSelector("input[id='email']")).sendKeys(email_id);
	  Thread.sleep(5000);
	  getdriver().findElement(By.cssSelector("input[id='pass']")).sendKeys(password);
	  Thread.sleep(5000);
	  
  }
  
  
  @Parameters({"URL1","email1","pswd1"})
  @Test
  public void tc_002(String url, String email_id, String password ) throws Exception 
  {
	  Thread.sleep(5000);
	  getdriver().navigate().to(url);
	  Thread.sleep(5000);
	  getdriver().findElement(By.cssSelector("input[id='email']")).sendKeys(email_id);
	  Thread.sleep(5000);
	  getdriver().findElement(By.cssSelector("input[id='pass']")).sendKeys(password);
	  Thread.sleep(5000);
	  
  }
  
  
  
  
  
}
