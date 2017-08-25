package cstech.com.Testngtest.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cstech.com.Testngtest.Utils.DriverManager;
import cstech.com.Testngtest.Utils.XpathUtils;

public class SelectFlight {
	private WebDriver driver = null;
	
	//@Test(priority=1)
	//public void flightfinderTest(){ 
		//driver= DriverManager.driver;
		//FlightFinder s = new FlightFinder();
		//s.login();
		//s.waitforpageload();
		//s.flightfinderTest2();
	//}
	
	@Test(priority=1)
	public void waitforpageload2(){
		driver= DriverManager.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=2)
	public void SelectFlight2(){
		
	driver.findElement(By.xpath(XpathUtils.SelectFlight.Radio_Button4)).click();
		
		driver.findElement(By.xpath(XpathUtils.SelectFlight.Radio_Button5)).click();
		
		driver.findElement(By.xpath(XpathUtils.SelectFlight.BTN_Signin3)).click();
		
		
	}
	
	
}


