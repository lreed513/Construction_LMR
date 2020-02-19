/**
 * This is the base Building object from which
 * all other characters will be derived. 
 * @author LeAia Reed
 * @version 1.12
 * Construction_LMR
 * SP20
 */
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	public Building() {
		setProjectName("");
		setCompleteAddress("");
		double totalSquareFeet = 0.0;
		setOccupancyGroup("");
		setSubGroup("");
	}//end empty constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		this.totalSquareFeet = totalSquareFeet;
		setOccupancyGroup(occupancyGroup);
		setSubGroup(subGroup);
	}//end preferred-constructor
	
	public void Draw() {
		
	}//end draw
	public String displayData() {
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("ProjectName: "+getProjectName()+"\n");
		sb.append("CompleteAddress: "+getCompleteAddress()+"\n");
		sb.append("OccupancyGroup: "+getOccupancyGroup()+"\n");
		sb.append("SubGroup: "+getSubGroup()+"\n");
		sb.append("TotalSquareFeet: "+getTotalSquareFeet()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end displayData
	
	public String getProjectName() {
		return projectName;
	}//end getProjectName
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
	
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress
	
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
	
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet
	
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet
	
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup
	
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
	
	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup
	
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup
	
}//end class
