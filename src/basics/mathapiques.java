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