import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

//Make a program to read the part code 1, the number of pieces 1, the unit value of each part 1
//The part code 2, the number of pieces 2 and the unit price of each part 2. Calculate and show the amount to be paid.

System.out.println("Enter the part code 1: ");
int cod1 = sc.nextInt();

System.out.println("Enter the number of pieces 1: ");
int pie1 = sc.nextInt();

System.out.println("Enter the value of part 1: ");
double val1 = sc.nextDouble();

System.out.println("Enter the part code 2: ");
int cod2 = sc.nextInt();

System.out.println("Enter the number of pieces 2: ");
int pie2 = sc.nextInt();

System.out.println("Enter the value of part 2: ");
double val2 = sc.nextDouble();

double amount = val1 * pie1 + val2 * pie2;

System.out.printf("amount to be paid is: U$ %.2f%n", amount);

        sc.close();
    }
}
