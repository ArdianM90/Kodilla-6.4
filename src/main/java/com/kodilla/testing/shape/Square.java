package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName = "Square";
    private double field;
    private double a;

    public Square(double a) {
        this.a = a;
        this.field = Math.pow(a, 2);
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
