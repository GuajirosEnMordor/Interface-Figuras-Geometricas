package cipher;

import java.util.Scanner;

public class Main {

    public static void Circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Radius: ");
        double r = input.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Area is: \n" + circle.area());
        System.out.println("Perimeter is: \n" + circle.perimeter());
    }

    public static void Triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input side A/Hyp:");
        double a = input.nextDouble();
        System.out.println("Input side B/Base:");
        double b = input.nextDouble();
        System.out.println("Input side C:");
        double c = input.nextDouble();
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Area is: \n" + triangle.area());
        System.out.println("Perimeter is: \n" + triangle.perimeter());
    }

    public static void Rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Width: ");
        double width = input.nextDouble();
        System.out.println("Input Height: ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area is: \n" + rectangle.area());
        System.out.println("Perimeter is: \n" + rectangle.perimeter());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;

        do{
            System.out.println(" What do you wanna calculate? Circle(1) Triangle(2) Rectangle(3) EXIT (0):");
            i = input.nextInt();

            switch (i) {
                case 1:{
                    Circle();
                    break;
                }
                case 2:{
                    Triangle();
                    break;
                }
                case 3:{
                    Rectangle();
                    break;
                }
                case 0:{
                    break;
                }
                default :{
                    System.out.println("Try again, please.");
                }
            }
        }while(i!=0);
        System.out.println("Goodbye!");
        System.exit(0);
}
}