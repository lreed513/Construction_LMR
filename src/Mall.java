/**
 * This is the base Mall object 
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		super();
		int numRentedUnits = 0;
		double medianUnitSize = 0.0;
		int numParkingSpaces = 0;
	}//end empty constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor
	
	public void Draw() {
		
	}//end draw
	
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData()); 
		sb.append("NumRentedUnits: " + getNumRentedUnits()+"\n");
		sb.append("MedianUnitSize: " + getMedianUnitSize()+"\n");
		sb.append("NumParkingSpaces: " + getNumParkingSpaces()+"\n");
		sb.append("==================================\n");

		return sb.toString();
		
	}//end display
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString
	
	
	

}//end class
