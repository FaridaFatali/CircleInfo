import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=WHrplLcz2jw&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=7
 * @author Farida Fatali
 */

/*
Calculate area, circumference and arc of the circle by asking radius and angle from the user.
 */

public class CircleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = scan.nextDouble();

        System.out.print("Enter angle of the circle: ");
        double angle = scan.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);

        double arc = (3.14 * (Math.pow(radius, 2)) * angle) / 360;
        System.out.println("Arc of the circle: " + arc);

    }
}
