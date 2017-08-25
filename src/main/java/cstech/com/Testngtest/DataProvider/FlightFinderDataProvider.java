package cstech.com.Testngtest.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import cstech.com.Testngtest.Utils.ExcelUtils;

public class FlightFinderDataProvider {

	@DataProvider(name = "flightfinderDataProvider")
	public static Object[][] getliFghtFinderData() {
		try {
			return new Object[][] { { ExcelUtils.getFlightFinderData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
