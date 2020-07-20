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
    @Override
    public int hashCode() {
        return (int)this.field * this.getShapeName().length();
    }
    @Override
    public boolean equals(Shape givenShape){
        return this == givenShape;
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return field;
    }
}
