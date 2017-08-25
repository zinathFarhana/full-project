package cstech.com.Testngtest.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import cstech.com.Testngtest.Utils.ExcelUtils;

public class BookFlightDataProvider {

	@DataProvider(name = "bookflightDataProvider")
	public static Object[][] getBookFlightData() {
		try {
			return new Object[][] { 
				{ 
					ExcelUtils.getBookFlightData() 
					}, 
				};
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
