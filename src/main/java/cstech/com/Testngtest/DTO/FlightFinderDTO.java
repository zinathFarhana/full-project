package cstech.com.Testngtest.DTO;

public class FlightFinderDTO {

	private String passengers;
	private String departingFrom;
	private String departingOnMonth;
	private String departingOnDate;
	private String ArrivingIn;
	private String returningMonth;
	private String returningDate;
	private String airlinePreference;

	




	public String getPassengers() {
		return passengers;
	}






	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}






	public String getDepartingFrom() {
		return departingFrom;
	}






	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}






	public String getDepartingOnMonth() {
		return departingOnMonth;
	}






	public void setDepartingOnMonth(String departingOnMonth) {
		this.departingOnMonth = departingOnMonth;
	}






	public String getDepartingOnDate() {
		return departingOnDate;
	}






	public void setDepartingOnDate(String departingOnDate) {
		this.departingOnDate = departingOnDate;
	}






	public String getArrivingIn() {
		return ArrivingIn;
	}






	public void setArrivingIn(String arrivingIn) {
		ArrivingIn = arrivingIn;
	}






	public String getReturningMonth() {
		return returningMonth;
	}






	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}






	public String getReturningDate() {
		return returningDate;
	}






	public void setReturningDate(String returningDate) {
		this.returningDate = returningDate;
	}






	public String getAirlinePreference() {
		return airlinePreference;
	}






	public void setAirlinePreference(String airlinePreference) {
		this.airlinePreference = airlinePreference;
	}






	@Override
	public String toString(){
		return "FlightFinderDTO [passengers=" + passengers + ", departingFrom=" + departingFrom + "departingOnMonth=" + departingOnMonth + ", departingOnDate=" + departingOnDate + "ArrivingIn=" + ArrivingIn + ", returningMonth=" + returningMonth + "returningDate=" + returningDate + ", airlinePreference=" + airlinePreference + "]";
		
	}
}
