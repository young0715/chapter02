package com.bit2018.paint.shape;

//abstract 추상 메소드
public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("Shape call");
	}
	
	//오버로딩
	public Shape(String fillColor, String lineColor) {
		System.out.println("Shape(String, String) call");
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public abstract void draw();
}
