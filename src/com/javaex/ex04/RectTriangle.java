package com.javaex.ex04;

public class RectTriangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public RectTriangle( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width*height*0.5;
    }

    public double getPerimeter() {
        return 2*(width+height);
    }

    public void resize(double s) {
    	width = width * s;
    	height = height * s;
    }
}