package basics;

import java.util.Scanner;

public class program {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(Math.abs(a)); // returns mode value

    System.out.println(Math.max(24 , 87)); // gives maximum value

    System.out.println(Math.cbrt(-29.355353543535454)); // gives cube root

    System.out.println(Math.ceil(64.48754487)); // gives nearest higher whole number

    IO.println(Math.pow(7 , 7));
    }
}
