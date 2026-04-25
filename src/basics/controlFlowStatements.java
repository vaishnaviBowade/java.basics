package basics;

import java.util.Scanner;

public class controlFlowStatements {
    public static void main(String[] args){
        int a = 6;
        int b = 8;
        if(a > 5 || b > 9){
            IO.println("ye chalega"); // how if else works
        }else{
            IO.println("otherwise ye chal jayega");
        }

        //maximum of 2 no.
        //Scanner sc = new Scanner(System.in);
        double c = 56.00;
        double d = 47;

        System.out.println(Math.max(c , d)); //by math.max
        //by if-else
        if(c > d){
            System.out.println(c + " is greater");
        } else{
            System.out.println(d + " is greater");
        }

        //even-odd
        if(c % 2 == 0){
            System.out.println(c + " is even");
        }else if(d % 2 == 0){
            System.out.println(d + " is even");
        }else{
            System.out.println("both are odd");
        }

        //valid voter problem
        String name = "vishu";
        int age = 22;

        if(age>=18){
            System.out.println("Hello " + name + " you are a valid voter.");
        }else{
            System.out.println("Hello , you will be eligible after " + (18-age) + (" years.") );
        }

        //weekday
        int weekday = 5;
        if(weekday==0){
            System.out.println("it's Sunday!!");
        }else if(weekday == 1){
            System.out.println("Monday");
        }else if(weekday == 2){
            System.out.println("Tuesday");
        }else if(weekday == 3){
            System.out.println("Wednesday");
        }else if(weekday == 4){
            System.out.println("Thursday");
        }else if(weekday == 5){
            System.out.println("Friday");
        }else{
            System.out.println("Saturday");
        }

        //leap year
        int year = 2004;
        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }else if(year % 4 == 0){
            System.out.println("leap year hai!!");
        }else{
            System.out.println("leap year nahi hai!!");
        }


        }
}
