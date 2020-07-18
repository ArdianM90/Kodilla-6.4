package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private double field;
    //private double a;
    //private double h;

    public Triangle(double a, double h) {
        //this.a = a;
        //this.h = h;
        this.field = a*h/2;
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
