package com.hcl4;

public class Triangle extends Shape{
	private Double base;
	private Double height;
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public void computeArea() {
	 area = base * height * 0.5;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
}
