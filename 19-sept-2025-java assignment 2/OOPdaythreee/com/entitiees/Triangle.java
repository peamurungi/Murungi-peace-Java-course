package com.entitiees;

	public class Triangle extends Shape {
		private double base,height,hypotenuse;

	    public Triangle() {       // default right triangle
	        this.base = 3;
	        this.height = 4;
	        this.hypotenuse = Math.sqrt(base*base + height*height); // auto calc
	    }

	    @Override
	    public double calculateArea() {
	        return 0.5 * base * height;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return base + height + hypotenuse;
	    }

	    @Override
	    public String toString() {
	        return "Base = " + base + ", Height = " + height + ", Hypotenuse = " + hypotenuse
	                + ", Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter();
	    }
}