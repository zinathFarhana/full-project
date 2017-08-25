package cstech.com.Testngtest.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import cstech.com.Testngtest.DTO.FlightFinderDTO;

import cstech.com.Testngtest.DataProvider.FlightFinderDataProvider;

import cstech.com.Testngtest.Utils.DriverManager;
//import cstech.com.Testngtest.Utils.UrlTextUtils;
//import org.testng.Assert;
import cstech.com.Testngtest.Utils.UrlTextUtils;
import cstech.com.Testngtest.Utils.XpathUtils;

public class FlightFinder {
	private WebDriver driver = null;



	@Test(priority=1)
	public void checkFlightFindPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.Flightfind.DROPDOWN_PASSENGERS)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Flightfinder_PAGE_TITLE2);
		
		System.out.println("Flight Find Page Title Verified !!");
	}
	
	@Test(priority=2, dataProvider = "flightfinderDataProvider", dataProviderClass = FlightFinderDataProvider.class)
	public void flightfinderTest2(List<FlightFinderDTO> flightfinders) throws InterruptedException {
		
		for(FlightFinderDTO flightfinderexcel : flightfinders){
			
			
			System.out.println("Flight Find Test Execution started --- ");
			
		driver.findElement(By.xpath(XpathUtils.Flightfind.RADIO_ONE_WAY)).click();
		System.out.println(" ONE WAY selected successfully !!!" );

		Select passengers = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_PASSENGERS)));
		passengers.selectByValue(flightfinderexcel.getPassengers());
		
		System.out.println(" PASSENGERS:3 selected successfully !!!" );
	
		Select departingFrom = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_DEPARTING_FROM)));
		departingFrom.selectByValue(flightfinderexcel.getDepartingFrom());
		
		System.out.println("Departing From:london selected successfully !!!" );
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select departingOnMonth = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_DEPARTING_FROM_ON)));
		departingOnMonth.selectByValue(flightfinderexcel.getDepartingOnMonth());
		
		Select departingOnDate = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_DEPARTING_FROM_ON_DATE)));
		departingOnDate.selectByValue(flightfinderexcel.getDepartingOnDate());

		System.out.println("On:March 9 selected successfully !!!" );
		
		Select arrivingIn = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_ARRIVING_IN)));
		arrivingIn.selectByValue(flightfinderexcel.getArrivingIn() );
		
		System.out.println("Arriving In:frankfurt selected successfully !!!" );
		
		Select returningMonth = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_Returning_IN)));
		returningMonth.selectByValue(flightfinderexcel.getReturningMonth());
		
		Select returningDate = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_Returning_IN_DATE)));
		returningDate.selectByValue(flightfinderexcel.getReturningDate());
		
		System.out.println("Returning:February 2 selected successfully !!!" );
		
		driver.findElement(By.xpath(XpathUtils.Flightfind.RADIO_BUSINESS_CLASS)).click();

		System.out.println("BUSINESS CLASS selected successfully !!!" );

		//Select airlinePreference = new Select(driver.findElement(By.xpath(XpathUtils.Flightfind.DROPDOWN_AIRLINES)));
		//airlinePreference.selectByValue(flightfinderexcel.getAirlinePreference());
		
		//System.out.println("Airline:Blue skies airlines selected successfully !!!" );
		
		driver.findElement(By.xpath(XpathUtils.Flightfind.BUTTON_CONTINUE)).click();
		
		System.out.println("Flightfinder page completed successfully !!!" );
	}
	
	}
	


}