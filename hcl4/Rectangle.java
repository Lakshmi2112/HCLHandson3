package com.hcl4;

public class Rectangle extends Shape{
	private Double length;
	private Double breadth;
	public void computeArea() {
		area = (double)length * breadth;
	}
	public Rectangle(Double length, Double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getBreadth() {
		return breadth;
	}
	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}
}
