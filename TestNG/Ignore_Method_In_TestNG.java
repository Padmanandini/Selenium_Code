package framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_Method_In_TestNG
{
  @Test
  public void Test1()
  {
	  Reporter.log("Test1 Executed");
  }
  
  @Test(enabled=false)
  public void Test2()
  {
	  Reporter.log("Test2 Executed");
  }
}
