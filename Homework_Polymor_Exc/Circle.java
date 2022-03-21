package Polymorphism.Homework;

public class Circle extends Shape {

    static double mathConstantPi=3.1416D;
    private double radiusLength;
    private double diameter = radiusLength*2;

    public Circle(double radiusLength) {
        this.radiusLength = radiusLength;
        this.diameter = diameter;
    }

    public double getRadiusLength() {
        return radiusLength;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadiusLength(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double calculateDiameter() {
        this.diameter = radiusLength * 2;
        return this.diameter;
    }

    @Override
    public double circumference() {
        double circleCircumference = this.radiusLength * 2 * mathConstantPi;
        if (this.radiusLength <= 0) {
            throw new ArithmeticException("Circle's circumference cannot be equal to, or less than zero; \n" +
                    "There is something wrong with numbers you've provided.");
        } else {
            System.out.println("Circumference of the circle (O=2rπ) = " + circleCircumference);
        }
        return circleCircumference;
    }

    @Override
    public double area() {
        double circleArea = this.radiusLength * this.radiusLength * mathConstantPi;
            System.out.println("Area of the circle (A=πr^2) = " + circleArea);
        return circleArea;
        }
}
