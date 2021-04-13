package framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description_For_Method_In_TestNG 
{
  @Test(description="Testcase1 for valid data")
  public void Testcase1() 
  {
	  Reporter.log("Test1 Method Executed");
	  
  }
  
  @Test(description="Testcase2 For invalid data")
  public void Testcase2() 
  {
	  Reporter.log("Test2 Method Executed");
  }
}
