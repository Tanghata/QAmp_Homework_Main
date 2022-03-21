package Polymorphism.Homework;

public class Rectangle extends Shape {

    private double longerSide;
    private double shorterSide;

    public Rectangle(double longerSide, double shorterSide) {
        this.longerSide = longerSide;
        this.shorterSide = shorterSide;
    }

    public double getLongerSide() {
        return longerSide;
    }

    public void setLongerSide(double longerSide) {
        this.longerSide = longerSide;
    }

    public double getShorterSide() {
        return shorterSide;
    }

    public void setShorterSide(double shorterSide) {
        this.shorterSide = shorterSide;
    }

    @Override
    public double circumference() {
        double rectanglePerimeter = 2*this.longerSide + 2*this.shorterSide;
        if (this.longerSide<=0 || this.shorterSide<=0) {
            throw new ArithmeticException("Rectangle's perimeter cannot be equal to, or less than zero; \n" +
                    "There is something wrong with numbers you've provided.");
        }
        else {
        System.out.println("Perimeter of the rectangle (O=2a+2b) = " + rectanglePerimeter);
        }
        return rectanglePerimeter;
    }

    @Override
    public double area() {
        double rectangleArea = this.longerSide*this.shorterSide;
            System.out.println("Area of the rectangle (P=a*b) = " + rectangleArea);
        return rectangleArea;
        }
}
