package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private double field;
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
        this.field = a*h/2;
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return field;
    }
    public Boolean equals(Shape shape) {
        return true;
    }
}
