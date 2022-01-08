import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);

//Make a program that reads three double-precision floating-point values: A, B, and C. Then calculate and show: 
// A) the area of ​​the right triangle that has A for its base and C for its height.
// B) the area of ​​the circle of radius C. (pi = 3.14159).
// C) the area of ​​the trapeze that has A and B for bases and C for height.
// D) the area of ​​the square that has side B.
// E) the area of ​​the rectangle that has sides A and B.

double  a,b,c;

System.out.println("Enter the value A: ");
 a = sc.nextDouble();

System.out.println("Enter the value B: ");
 b = sc.nextDouble();

System.out.println("Enter the value C: ");
 c = sc.nextDouble();

double triangle, circle, trapezium, square, rectangle;

 triangle = a*c/2.0;
 circle = 3.14159*c*c;
 trapezium = (a+b)/2.0*c;
 square = b*b;
 rectangle = a*b;

System.out.printf("the area of the right triangle is: %.3f%n", triangle);
System.out.printf("the area of the circle of radius is: %.3f%n", circle);
System.out.printf("the area of the trapeze is: %.3f%n", trapezium);
System.out.printf("the area of the square is: %.3f%n", square);
System.out.printf("the area of the rectangle is: %.3f%n", rectangle);

sc.close();
}
}
