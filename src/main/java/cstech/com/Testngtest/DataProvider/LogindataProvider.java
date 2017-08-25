package cstech.com.Testngtest.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import cstech.com.Testngtest.Utils.ExcelUtils;



public class LogindataProvider {

	@DataProvider(name = "logindataprovider")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcelUtils.getLoginData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
