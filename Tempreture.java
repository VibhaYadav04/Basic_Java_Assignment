// Write a program to convert temperature from Celsius to Fahrenheit.
import java.util.Scanner;
class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.println("C to F: " + ((temp * 9/5) + 32));
    }
}