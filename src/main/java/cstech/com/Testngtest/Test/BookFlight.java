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
import org.testng.annotations.Test;
import cstech.com.Testngtest.DTO.BookFlightDTO;
import cstech.com.Testngtest.DataProvider.BookFlightDataProvider;
import cstech.com.Testngtest.Utils.DriverManager;
import cstech.com.Testngtest.Utils.UrlTextUtils;
import cstech.com.Testngtest.Utils.XpathUtils;

public class BookFlight {
	private WebDriver driver = null;
	//@Test(priority=1)
	//public void SelectFlightTest(){ 
		//driver= DriverManager.driver;
		//SelectFlight b = new SelectFlight();
		//b.flightfinderTest();
		//b.waitforpageload2();
	//	b.SelectFlight2();
	//}
	
	@Test(priority=1)
	public void checkBookFlightPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookFlight.Dropdown_Button9)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.BookFlight_PAGE_TITLE);
		
		System.out.println("Flight Find Page Title Verified !!");
	}
	@Test(priority=2, dataProvider = "bookflightDataProvider", dataProviderClass = BookFlightDataProvider.class)
	public void bookflightTest(List<BookFlightDTO> BookFlights) throws InterruptedException {
		
		for(BookFlightDTO bookflightexcel : BookFlights){
			
			//navigate("http://newtours.demoaut.com/mercuryreservation.php");
			System.out.println("Book Flight Test Execution started --- ");
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name)).sendKeys(bookflightexcel.getFirst_Name());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name)).sendKeys(bookflightexcel.getLast_Name());
		//Select dropdown9 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button9)));
		//dropdown9.selectByValue(bookflightexcel.getDropdown_Button9());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name2)).sendKeys(bookflightexcel.getFirst_Name2());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name2)).sendKeys(bookflightexcel.getLast_Name2());
		//Select dropdown10 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button10)));
		//dropdown10.selectByValue(bookflightexcel.getDropdown_Button10());

		Select dropdown11 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button11)));
		dropdown11.selectByValue(bookflightexcel.getDropdown_Button11());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.Number)).sendKeys(bookflightexcel.getNumber());
		Select dropdown12 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button12)));
		dropdown12.selectByIndex(1);
		Select dropdown13 = new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.Dropdown_Button13)));
		dropdown13.selectByIndex(1);
	
		driver.findElement(By.xpath(XpathUtils.BookFlight.First_Name4)).sendKeys(bookflightexcel.getFirst_Name4());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Last_Name4)).sendKeys(bookflightexcel.getLast_Name4());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Name5)).sendKeys(bookflightexcel.getName5());

		
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.Button_TICKETLESS_Travel)).click();

		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_ADDRESS))
				.sendKeys(bookflightexcel.getBillingAddress());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_CITY))
				.sendKeys(bookflightexcel.getBillingCity());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_STATE))
				.sendKeys(bookflightexcel.getBillingState());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_POSTAL))
				.sendKeys(bookflightexcel.getBillingPostalCode());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_COUNTRY))
				.sendKeys(bookflightexcel.getBillingCountry());
		
		
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.Radio_Button5)).click();
	}
}
}	
