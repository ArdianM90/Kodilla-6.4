package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName = "Square";
    private double field;
    //private double a;

    public Square(double a) {
        //this.a = a;
        this.field = Math.pow(a, 2);
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
