package framework.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver 
{
	static WebDriver create(String browsername)
	{
		WebDriver c_Driver = null;
		switch (browsername) {
		case "chrome":
			c_Driver=new ChromeDriver();
			break;
			
        case "Firefox":
        	c_Driver=new FirefoxDriver();
			break;

		default:
			break;
		}
		return c_Driver;
	}

}
