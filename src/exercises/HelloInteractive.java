package exercises;
import java.util.Scanner;

public class HelloInteractive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String firstName = in.nextLine();
        System.out.println("Hello," + firstName);
    }
}
