package framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups_Using_TestNG 
{
	
	
  @Test(groups="test1")
  public void a()
  {
	  Reporter.log("a executed",true);
  }
  
  @Test(groups= {"test2"})
  public void b() 
  {
	  Reporter.log("b executed",true);
  }
  
  @Test(groups= {"test1", "test2"})
  public void c() 
  {
	  Reporter.log("c is executed",true);
  }
  
  @Test(groups= {"test2"})
  public void d() 
  {
	  Reporter.log("d is exxecuted",true);
  }
}
