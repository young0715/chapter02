package com.bit2018.paint.shape;

public class Circle extends Shape {
	private int x1;
	private int y1;
	private int radius;
	
	public Circle() {
		System.out.println("Circle");
	}
	
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle");		
	}
	
}
