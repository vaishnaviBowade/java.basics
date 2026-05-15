import java.util.Scanner;
public class firstprogram {
    public static void main(String[] args) {
        System.out.println("first program");
        Scanner sc = new Scanner("10 20 30");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " & " + b);

        Scanner sc1 = new Scanner(System.in);
        int age = sc1.nextInt();
        System.out.println(age);

    }
}




