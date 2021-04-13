package framework.TestNG;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;


public class Listener extends TestListenerAdapter 
{
  public void onTestSucess(ITestResult tr)
  {
	  Reporter.log("Test Pass",true);
	 
  }
  
  public void onTestFails(ITestResult tr)
  {
	  Reporter.log("Test Fail", true);  
	  
  }
}
