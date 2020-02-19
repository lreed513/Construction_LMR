/**
 * This is the base Business object from which
 * Mall will be derived. 
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class Business extends Building{
	protected int numRentableUnits;
	
	public Business() {
		super();
		int numRentableUnits = 5;
	}//end empty constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred-constructor
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	

}//end class
