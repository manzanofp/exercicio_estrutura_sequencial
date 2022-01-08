import java.util.Scanner;;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Make a program to read four integer values ​​A,B,C and D. calculate and show the difference of the product of A and B
        //by the product of C and D.

System.out.println("Enter 4 integer values and see his difference: ");

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();

int dif = (a*b - c*d);

System.out.println("the difference is: "+ dif);

        sc.close();
    }
}
