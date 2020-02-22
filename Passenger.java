
public class Passenger implements Comparable<Passenger> {
	
	//instance variables
	private int bookingReference;			//Booking Reference
	private Name name;						//Name of the passenger
	private String flightCode;				//Flight code
	private boolean checkedIn;				//Passenger is checked in or not
	private double fee;						//Total fees for excess volume or weight
	private double bagWeight;				//Total weight of checked-in baggage per passenger
	private double bagVol;					//Total volume of checked-in baggage per passenger

	
	//Constructor
	public Passenger(int bookref, Name name, String fcode, boolean checkin, double fee, double weight, double vol) 
	{
		bookingReference = bookref;
		this.name = name;
		flightCode = fcode;
		checkedIn = checkin;
		this.fee = fee;
		bagWeight = weight;
		bagVol = vol;
	}
	
	//Used for TreeSet: Compares by booking reference and then by Passenger Name
	public int compareTo(Passenger other) {
		int thisBookRef = bookingReference;
		String thisName = name.getFullName();
	
		if (thisBookRef != other.getBookingReference()) {
			return thisBookRef - other.getBookingReference();
		}
		return thisName.compareTo(other.getPassengerName().getFullName());
	}
	
	//Get Methods
	public int getBookingReference() {
		return bookingReference;
	}
	public Name getPassengerName() {
		return name;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public boolean getCheckedIn() {
		return checkedIn;
	}
	public double getFee() {
		return fee;
	}
	public double getBagWeight() {
		return bagWeight;
	}
	public double getBagVolume() {
		return bagVol;
	}
	
	//Necessary set methods
	public void setFee(int newFee) {
		fee = newFee;
	}
	public void setBagWeight(double newWeight) {
		bagWeight = newWeight;
	}
	public void setBagVolume(double newVol) {
		bagVol = newVol;
	}
	
}
