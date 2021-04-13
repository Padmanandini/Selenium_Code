package framework.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_TestNG_Test 
{
  @Test
  public void a() 
  {
	  //Instead of System.out.println in TestNG use reporter log in @test annotation only
	  Reporter.log("Test Executed");
  }
}
