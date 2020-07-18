package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double field;
    //private double radius;

    public Circle(double radius) {
        //this.radius = radius;
        this.field = Math.PI * Math.pow(radius, 2);
    }
    public Boolean equals(Shape givenShape){
        if((this.shapeName == givenShape.getShapeName()) && (this.field == givenShape.getField())) {
            return true;
        }
        return false;
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return field;
    }
}
