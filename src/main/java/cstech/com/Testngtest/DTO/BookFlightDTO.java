package cstech.com.Testngtest.DTO;

public class BookFlightDTO {

	private String  First_Name;
	private String Last_Name;
	//private String Dropdown_Button9;	
	private String First_Name2;
	private String Last_Name2;
	//private String Dropdown_Button10;
	private String Dropdown_Button11;
	private String Number;
	//private String Dropdown_Button12;
	//private String Dropdown_Button13;
	private String First_Name4;
	private String Last_Name4;
	private String Name5;
	private String billingAddress;
	private String billingCity;
	private String billingState;
	private String billingPostalCode;
	private String billingCountry;

	
	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
////	public String getDropdown_Button9() {
////		return Dropdown_Button9;
////	}
//	public void setDropdown_Button9(String dropdown_Button9) {
//		Dropdown_Button9 = dropdown_Button9;
//	}
	public String getFirst_Name2() {
		return First_Name2;
	}
	public void setFirst_Name2(String first_Name2) {
		First_Name2 = first_Name2;
	}
	public String getLast_Name2() {
		return Last_Name2;
	}

	public void setLast_Name2(String last_Name2) {
		Last_Name2 = last_Name2;
	}

//	public String getDropdown_Button10() {
//		return Dropdown_Button10;
//	}
//
//	public void setDropdown_Button10(String dropdown_Button10) {
//		Dropdown_Button10 = dropdown_Button10;
//	}

	public String getDropdown_Button11() {
		return Dropdown_Button11;
	}

	public void setDropdown_Button11(String dropdown_Button11) {
		Dropdown_Button11 = dropdown_Button11;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

//	public String getDropdown_Button12() {
//		return Dropdown_Button12;
//	}
//
//	public void setDropdown_Button12(String dropdown_Button12) {
//		Dropdown_Button12 = dropdown_Button12;
//	}

//	public String getDropdown_Button13() {
//		return Dropdown_Button13;
//	}
//
//	public void setDropdown_Button13(String dropdown_Button13) {
//		Dropdown_Button13 = dropdown_Button13;
//	}

	public String getFirst_Name4() {
		return First_Name4;
	}


	public void setFirst_Name4(String first_Name4) {
		First_Name4 = first_Name4;
	}

	public String getLast_Name4() {
		return Last_Name4;
	}

	public void setLast_Name4(String last_Name4) {
		Last_Name4 = last_Name4;
	}

	public String getName5() {
		return Name5;
	}

	public void setName5(String name5) {
		Name5 = name5;
	}

	public String getBillingAddress() {
		return billingAddress;
	}



	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getBillingCity() {
		return billingCity;
	}


	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}


	public String getBillingState() {
		return billingState;
	}


	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}



	public String getBillingPostalCode() {
		return billingPostalCode;
	}


	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}


	public String getBillingCountry() {
		return billingCountry;
	}


	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	@Override
	public String toString(){
		return "FlightFinderDTO [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", First_Name2=" + First_Name2 + "Last_Name2=" + Last_Name2 + ",Dropdown_Button11=" + Dropdown_Button11 + ", Number=" + Number + ",First_Name4=" + First_Name4 + ", Last_Name4=" + Last_Name4 + "Name5=" + Name5 + "billingAddress=" + billingAddress + ",billingCity=" + billingCity + ",billingState=" + billingState + ",billingPostalCode=" + billingPostalCode + ",billingCountry=" + billingCountry + "]";
		
	}
}
