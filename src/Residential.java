/**
 * This is the base Residential object from which
 * Apartment and SingleFamilyHome will be derived. 
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		int numBedrooms = 3;
		int numBathrooms = 1;
		setLaundryRoom(true);
		
	}//end empty constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		setLaundryRoom(laundryRoom);
	}//end preferred constructor
	
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
	
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
	
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom
	
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + "]";
	}//end toString
	

}//end class
