package cstech.com.Testngtest.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cstech.com.Testngtest.DTO.BookFlightDTO;
import cstech.com.Testngtest.DTO.FlightFinderDTO;
import cstech.com.Testngtest.DTO.LoginDTO;


public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;

	private  static Sheet getSheet(int sheetNo) throws IOException{
		// change the file location as per your computer
		File f = new File("src/main/java");
		File fs = new File(f,"newtours.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNo);
        return sheet;
	}
	
	public static List<LoginDTO> getLoginData() throws IOException{
		List<LoginDTO> logins=new ArrayList<LoginDTO>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            LoginDTO logindata=new LoginDTO();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					logindata.setUsername(cell.getStringCellValue());
					cellCounter++;
					break;
				case 1:
					logindata.setPassword(cell.getStringCellValue());
					break;
				default:
					break;
				}               
                 
            }
            logins.add(logindata);
        }
        close();
		return logins;
		
}


	
	
	public static List<FlightFinderDTO> getFlightFinderData() throws IOException{
		
		List<FlightFinderDTO> flightfinders=new ArrayList<FlightFinderDTO>();

		//login is the first sheet in excel so getSheet parameter set to 1
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            FlightFinderDTO flightfinderdata=new FlightFinderDTO();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					flightfinderdata.setPassengers(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					flightfinderdata.setDepartingFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					flightfinderdata.setDepartingOnMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					flightfinderdata.setDepartingOnDate(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					flightfinderdata.setArrivingIn(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					flightfinderdata.setReturningMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					flightfinderdata.setReturningDate(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					flightfinderdata.setAirlinePreference(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}               
                 
            }
            flightfinders.add(flightfinderdata);
        }
        close();
		return flightfinders;
}



	
	public static List<BookFlightDTO> getBookFlightData() throws IOException{
		
		List<BookFlightDTO> BookFlights=new ArrayList<BookFlightDTO>();

		//login is the first sheet in excel so getSheet parameter set to 1
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> iterator = ExcelUtils.getSheet(2).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            BookFlightDTO bookFlightdata=new BookFlightDTO();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					bookFlightdata.setFirst_Name(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					bookFlightdata.setLast_Name(formatter.formatCellValue(cell));
					cellCounter++;
					break;
//				case 2:
//					bookFlightdata.setDropdown_Button9(formatter.formatCellValue(cell));
//					cellCounter++;
//					break;
				case 2:
					bookFlightdata.setFirst_Name2(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					bookFlightdata.setLast_Name2(formatter.formatCellValue(cell));
					cellCounter++;
					break;
//				case 5:
//					bookFlightdata.setDropdown_Button10(formatter.formatCellValue(cell));
//					cellCounter++;
//					break;
				case 4:
					bookFlightdata.setDropdown_Button11(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					bookFlightdata.setNumber(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					bookFlightdata.setNumber(formatter.formatCellValue(cell));
					cellCounter++;
					break;
//				case 9:
//					bookFlightdata.setDropdown_Button12(formatter.formatCellValue(cell));
//					cellCounter++;
//					break;
//				case 10:
//					bookFlightdata.setDropdown_Button13(formatter.formatCellValue(cell));
//					cellCounter++;
//					break;
				case 7:
					bookFlightdata.setFirst_Name4(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 8:
					bookFlightdata.setLast_Name4(formatter.formatCellValue(cell));
					cellCounter++;
					break;

				case 9:
					bookFlightdata.setName5(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 10:
					bookFlightdata.setBillingAddress(formatter.formatCellValue(cell));
					cellCounter++;
					break;
	            case 11:
	            	bookFlightdata.setBillingCity(formatter.formatCellValue(cell));
					cellCounter++;
					break;
	            case 12:
	            	bookFlightdata.setBillingState(formatter.formatCellValue(cell));
					cellCounter++;
					break;
	            case 13:
	            	bookFlightdata.setBillingPostalCode(formatter.formatCellValue(cell));
					cellCounter++;
					break;
	            case 14:
	            	bookFlightdata.setBillingCountry(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}               
                 
            }
            BookFlights.add(bookFlightdata);
        }
        close();
		return BookFlights;
}
	
	
	
	
	
	
	
	
	

	private static void close() throws IOException{
		// TODO Auto-generated method stub
		workbook.close();
		inputStream.close();
	}
	
	
	}


