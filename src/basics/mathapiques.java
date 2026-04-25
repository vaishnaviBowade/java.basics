/*      Problem Statement:
        Write a Java program to calculate the Compound Interest (CI).

        The program should:

        Take input for:
        Principal amount (P)
        Rate of interest (r)
        Time in years (t)
        Number of times interest is compounded per year (n)

        Calculate the compound interest using the formula:

        CI = P(1 + r/n)^(n*t) - P

        Print the compound interest.*/
package basics;
import java.util.Scanner;

public class mathapiques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();       // principal amount
        double r = sc.nextDouble(); // interest rate
        int t = sc.nextInt();       // years
        int n = sc.nextInt();       // compounding frequency

        double A = P * Math.pow((1 + r / n), (n * t)); // correct formula
        double CI = A - P;

        System.out.println(CI);
    }
}