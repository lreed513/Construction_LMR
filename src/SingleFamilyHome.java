/**
 * This is the base SingleFamilyHome object  
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		setGarage(true);
	}//end empty constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		setGarage(garage);
	}//end preferred constructor
	
	public void Draw() {
		
	}//end draw
	
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData()); 
		sb.append("Garage: " + isGarage()+"\n");
		sb.append("==================================\n");

		return sb.toString();
	}//end display
	
	public boolean isGarage() {
		return garage;
	}//end getGarage
	
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	
	
	

}//end class
