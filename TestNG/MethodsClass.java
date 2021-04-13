package framework.TestNG;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MethodsClass
{
  
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	String Screen_Path="C:\\Users\\nandu\\Desktop\\Nandu_Workspace\\Selenium_Libraries\\New_Project_One\\Screenshots\\";
	
	 Date d=new Date();
	 //Set format
	 SimpleDateFormat S_date=new SimpleDateFormat("YY-MM-DD -hh-mm-ss");
	 String new_date=S_date.format(d);
	 
	 

	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver c_Driver=new Webdriver().create("chrome");
		setdriver(c_Driver);
	
		//driver.manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void setdriver(WebDriver c_Driver)
	{
		driver.set(c_Driver);
	}
	
	public WebDriver getdriver()
	{
		 return driver.get();
	}
	
	@AfterMethod
	public void method2() throws Exception
	{
		/*File screen_shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen_shot, new File(Screen_Path+new_date+"image10.png"));*/
		
		Thread.sleep(5000);
		getdriver().close();
		driver.set(null);
		
		
	}
  
}
