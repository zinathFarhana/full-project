package cstech.com.Testngtest.Test;
//import java.util.concurrent.TimeUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cstech.com.Testngtest.DTO.LoginDTO;
import cstech.com.Testngtest.DataProvider.LogindataProvider;
import cstech.com.Testngtest.Utils.DriverManager;
//import cstech.com.Testngtest.Utils.ExcelUtils;
import cstech.com.Testngtest.Utils.UrlTextUtils;
import cstech.com.Testngtest.Utils.XpathUtils;
//import org.testng.Assert;

public class Logintest {
	private WebDriver driver = null;
	
	@Test(priority = 1)
	public void checkHomePageTitle() throws InterruptedException {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);

		System.out.println("Home Page Title Verified !!!");
	}
	
	@Test(priority = 2, dataProvider = "logindataprovider", dataProviderClass = LogindataProvider.class)
	public void loginTest(List<LoginDTO> logins) throws InterruptedException {
		// driver= ExecuteDriver.driver;

		for (LoginDTO loginexcel : logins) {
		//driver.get(UrlTextUtils.BASE_URL);
		driver= DriverManager.driver;
		driver.get(UrlTextUtils.Base_URL);
		driver.findElement(By.xpath(XpathUtils.Login.Login_Username)).sendKeys(loginexcel.getUsername());
		driver.findElement(By.xpath(XpathUtils.Login.Input_Password)).sendKeys(loginexcel.getPassword());
		driver.findElement(By.xpath(XpathUtils.Login.BTN_Signin)).submit();
		System.out.println("Logged In Successfully !!");
	}	
	
}
//	public void checkHomePageTitle() {
//		driver= DriverManager.driver;
//		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Flightfinder_PAGE_TITLE2);
//		System.out.println("Home Page Title Verified !!!");
//	}
}
