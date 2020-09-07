package com.hcl3;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownerName;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Stall() {
		
	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public Double computeCost(String stallType, Integer squareFeet)
	{
		if(stallType.equals("Platinum"))
		{
			return (double)squareFeet * 200;
		}
		else if (stallType.equals("Diamond"))
		{
			return (double)squareFeet * 150;
		}
		else
		{
			return (double)squareFeet * 100;
		}
	}
	
	public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV)
	{
		return (double)computeCost(stallType, squareFeet) + (numberOfTV * 10000);
	}

}
// Note: The price for various types of stalls is, Platinum = Rs.200 per sqft; Diamond = Rs.150 per sqft; Gold = Rs.100 per sqft. And price for each tv is Rs.1000