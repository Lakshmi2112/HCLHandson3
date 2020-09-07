package com.hcl4;

public class Circle extends Shape {
	
	private Double radius;
	public void computeArea() {
		area = 3.14 * radius * radius;
		
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public Circle(Double radius) {
		this.radius = radius;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
}
