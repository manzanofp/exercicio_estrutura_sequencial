import java.util.Scanner;
import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //make a program that reads the number of an employee, their number of hours worked, the amount they receive per hour
        //and calculate that employee's salary. Then show the employee's number and salary, with two decimal squares.

System.out.println("Enter employee number: ");
int nume = sc.nextInt();

System.out.println("Enter the amount of hours worked: ");
double hourw = sc.nextDouble();

System.out.println("enter your hourly value:");
double hourv = sc.nextDouble();

double sal = hourv * hourw;

System.out.println("number: "+ nume);
System.out.printf("salary: U$ %.2f%n", sal);



        sc.close();
    }
}
