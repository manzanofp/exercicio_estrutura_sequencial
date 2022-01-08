import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

//Make a program to read two integer values, and then show the sum of those numbers on the screen with an explanatory message.

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.println("Enter a value: ");
int v1 = sc.nextInt();
System.out.println("Enter another value: ");
int v2 = sc.nextInt();

int sum = v1 + v2;

System.out.println("the sum of the two values is: "+ sum);

sc.close();
	}

}
