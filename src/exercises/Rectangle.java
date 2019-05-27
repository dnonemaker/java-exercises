package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rectangle's width:");
        double width = in.nextDouble();
        System.out.println(("Enter the rectangle's length:"));
        double length = in.nextDouble();
        System.out.println("The area of the rectangle is: " + (width* length) + " square units.");
    }
}
