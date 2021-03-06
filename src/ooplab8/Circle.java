package ooplab8;

public class Circle implements Shape {
    private final double pi = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double findArea() {
        return pi *(r*r);
    }
}//class