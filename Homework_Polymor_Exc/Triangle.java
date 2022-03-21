package Polymorphism.Homework;
import java.lang.Math;

public class Triangle extends Shape {

    private double sideX;
    private double sideY;
    private double sideZ;

    public Triangle(double sideX, double sideY, double sideZ) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.sideZ = sideZ;
        }

    public double getSideX() {
        return sideX;
    }

    public void setSideX(double sideX) {
        this.sideX = sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public void setSideY(double sideY) {
        this.sideY = sideY;
    }

    public double getSideZ() {
        return sideZ;
    }

    public void setSideZ(double sideZ) {
        this.sideZ = sideZ;
    }

    @Override
    public double circumference() {
        double trianglePerimeter = this.sideX+this.sideY+this.sideZ;
        if(this.sideX<=0 || this.sideY<=0 || this.sideZ<=0) {
            throw new ArithmeticException("Triangle's area cannot be equal to, or less than zero; \n" +
                    "There is something wrong with numbers you've provided");
        }
        else {
        System.out.println("Perimeter of the triangle (P=x+y+z) = " + trianglePerimeter);
        }
        return trianglePerimeter;
    }

    @Override
    public double area() {
        double semiPerimeter = (this.sideX+this.sideY+this.sideZ)/2;
        double triangleArea = Math.sqrt((semiPerimeter*(semiPerimeter-this.sideX)*
                (semiPerimeter-this.sideY)*(semiPerimeter-this.sideZ)));
            System.out.println("Area of the triangle (P=√s(s−x)(s−y)(s−z)) = " + triangleArea);
        return triangleArea;
        }
}
