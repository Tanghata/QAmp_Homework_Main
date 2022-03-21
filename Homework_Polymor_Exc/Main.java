package Polymorphism.Homework;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double radiusLength=0;
        double longerSide=0;
        double shorterSide=0;
        double sideX=0;
        double sideY=0;
        double sideZ=0;
        char response;

        Circle homeworkCircle = new Circle(radiusLength);
        Rectangle homeworkRectangle = new Rectangle(longerSide, shorterSide);
        Triangle homeworkTriangle = new Triangle(sideX, sideY, sideZ);

        do {
            System.out.println();
            String[] menu = {"Circumference, perimeter and area calculator menu:",
                    "1. Circle",
                    "2. Rectangle",
                    "3. Triangle",
                    "4. Quit"};
            for (String mainMenu : menu) {
                System.out.println(mainMenu);
            }
            System.out.print("Please specify what you want to calculate (enter the corresponding number): ");
            int typeOfCalculation = reader.nextInt();
            try {
                if (typeOfCalculation==1) {
                    System.out.print("Please enter the radius of the circle: ");
                    homeworkCircle.setRadiusLength (reader.nextDouble()); /* iz nekog razloga ovo radi kada ukucam
                    npr. 5,7 (sa zarezom), ali ne radi kada ukucam 5.7 - a onda mi broj koji sam unio ispise sa tackom */
                    // CIRCLE
                    System.out.println("\nCIRCLE: BASIC INFO");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Circle's entered radius is " + homeworkCircle.getRadiusLength() + " centimeters");
                    System.out.println("Circle's diameter is " + homeworkCircle.calculateDiameter() + " centimeters");
                    System.out.println("\nCIRCLE: CALCULATION");
                    System.out.println("-----------------------------------------------------------");
                    homeworkCircle.circumference();
                    homeworkCircle.area();
                } else if (typeOfCalculation==2) {
                    System.out.print("Please enter the length of rectangle's longer side (in centimeters): ");
                    homeworkRectangle.setLongerSide(reader.nextDouble());
                    System.out.print("Please enter the length of rectangle's shorter side (in centimeters): ");
                    homeworkRectangle.setShorterSide(reader.nextDouble());
                    // RECTANGLE
                    System.out.println("\nRECTANGLE: BASIC INFO");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Rectangle's sides (as entered) are " + homeworkRectangle.getLongerSide() + " and " +
                            homeworkRectangle.getShorterSide() + " centimeters long respectively");
                    System.out.println("\nRECTANGLE: CALCULATION");
                    System.out.println("-----------------------------------------------------------");
                    homeworkRectangle.circumference();
                    homeworkRectangle.area();
                } else if (typeOfCalculation==3) {
                    System.out.print("Please enter the length of triangle's first side (in centimeters): ");
                    homeworkTriangle.setSideX(reader.nextDouble());
                    System.out.print("Please enter the length of triangle's second side (in centimeters): ");
                    homeworkTriangle.setSideY(reader.nextDouble());
                    System.out.print("Please enter the length of triangle's third and final side (in centimeters): ");
                    homeworkTriangle.setSideZ(reader.nextDouble());
                    // TRIANGLE
                    System.out.println("\nTRIANGLE: BASIC INFO");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Triangle's sides (as entered) are " + homeworkTriangle.getSideX() + ", " +
                            homeworkTriangle.getSideY() + " and " + homeworkTriangle.getSideZ() + " centimeters long respectively");
                    System.out.println("\nTRIANGLE: CALCULATION");
                    System.out.println("-----------------------------------------------------------");
                    homeworkTriangle.circumference();
                    homeworkTriangle.area();
                } else if (typeOfCalculation==4) {
                    break;
                } else {
                    System.out.println("Something went wrong. Please try again.");
                }
            } catch(ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.print("\nDo you want to perform another calculation (Y/N)? ");
            response = reader.next().toUpperCase().charAt(0);
            if (response!='Y' && response != 'N') {
                System.out.print("We are not sure what you mean. Please enter either 'Y' or 'N': ");
                response = reader.next().toUpperCase().charAt(0);
                if (response!='Y' && response != 'N') {
                    System.out.println("Now you're just messing with us :( Calculator will now close.");
                    break;
                }
            }
        } while (response=='Y');
    }
}
