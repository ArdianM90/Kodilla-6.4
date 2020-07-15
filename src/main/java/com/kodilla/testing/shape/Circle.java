package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double field;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.field = Math.PI * Math.pow(radius, 2);
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
