package com.entitiees;

	public class Square extends Shape {
	    private double side;
	    public Square() { this.side = 6; }

	    @Override
	    public double calculateArea() { return side * side; }

	    @Override
	    public double calculatePerimeter() { return 4 * side; }
	}

