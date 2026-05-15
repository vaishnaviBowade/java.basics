import java.util.Scanner;

public class scanner {
    public static void main(String[] args){

//       how to take input from user : example of double
//        Scanner sc = new Scanner(System.in);
//        double age = sc.nextDouble();
//        System.out.println(age);

//      how system.in and system.out works
//        Scanner sc1 = new Scanner(System.in); //System.in - input from user
//        System.out.println("Enter your roll no."); //system.out - output
//        int roll = sc.nextInt();
//        System.out.println("this is your roll no : " + roll);

//        how scanner reads different types of data
        Scanner sc2 = new Scanner(System.in);

//        System.out.println("enter int:");
//        int a = sc2.nextInt(); // for int
//        sc2.nextLine();
//
//        System.out.println("Enter float:");
//        float b = sc2.nextFloat(); //for float
//        sc2.nextLine();
//
//        System.out.println("Enter double:");
//        double c = sc2.nextDouble(); //for double
//
//        sc2.nextLine();
//
//        System.out.println("Enter string:");
//        String name = sc2.next(); //for string
//
//        sc2.nextLine();
//
//        System.out.println("enter sentence:");
//        String line = sc2.nextLine();
//
//        System.out.println("enter char");
//        char ch = sc2.next().charAt(0);
//
//
//        System.out.println(a + " " + b + " " + c);
//        System.out.println(name);
//        System.out.println(line);
//        System.out.println(ch);


        System.out.println("enter data");
        if(sc2.hasNextInt()){
            int g = sc2.nextInt();
            System.out.println("data " + g);
        }
//        int g = sc2.nextInt(); if write abc throws an exeception of inputmismatch


    }
}
