package com.hcl4;

public class Shape {
	protected Double area;
	
	public Shape(Double area) {
		super();
		this.area = area;
	}
	
	public Shape() {
		
	}

	public void computeArea() {
		area = (double)0;		
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
}
