package framework.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listeners_Using_TestNG 
{
	
	
  @Test
  public void method1() 
  {
	  System.out.println("Method1 Execcuted");
  }
  
  @Test
  public void method2()
  {
	  System.out.println("Method2 Executed");
	  Assert.assertEquals(true, true);
  }
}
