import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
//Make a program to read the radius of a circle, and then show the area value of this circle to four decimal places.

Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);

System.out.println("Enther the radius: ");
double radius = sc.nextDouble();

double pi = 3.14159;

double area = pi * radius * radius;

System.out.printf("radius = %.4f%n", area);


sc.close();
    }
}
