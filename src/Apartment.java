/**
 * This is the base Apartment object  
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		int numRentableUnits = 0;
		double avgUnitSize = 0.0;
		setParkingAvailable(true);
	}//end empty constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		setParkingAvailable(parkingAvailable);
	}//end preferred constructor
	
	public void Draw() {
		
	}//end draw
	
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData()); 
		sb.append("NumRentableUnits: " + getNumRentableUnits()+"\n");
		sb.append("AvgUnitSize: " + getAvgUnitSize()+"\n");
		sb.append("ParkingAvailable: " + isParkingAvailable()+"\n");
		sb.append("==================================\n");

		return sb.toString();
	}//end display
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
	
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}// end isParkingAvailable
	
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	
	
	

}//end class
