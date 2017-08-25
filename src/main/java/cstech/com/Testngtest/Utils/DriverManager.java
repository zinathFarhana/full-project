package cstech.com.Testngtest.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManager {

	static{
		
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
	}
	
	public static WebDriver driver = new FirefoxDriver();
	
	@Test
	public void DriverManagerTest()
	{
		System.out.println("Driver Executed !");
		System.out.println("Driver Executed !");
		System.out.println("Driver Executed !");
	}

	private DriverManager (){
		
	}
}