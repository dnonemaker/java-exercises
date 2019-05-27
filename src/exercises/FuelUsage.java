package exercises;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FuelUsage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your miles driven:");
        double miles = in.nextDouble();
        System.out.println(("Enter the gallons used:"));
        double gallons = in.nextDouble();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("You got " + df.format(miles / gallons) + " miles per gallon.");
    }
}
