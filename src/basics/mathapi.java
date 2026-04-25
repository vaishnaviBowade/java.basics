package basics;

import java.util.Scanner;

public class mathapi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        double area;
        double parameter;
        System.out.println(area = length * width);
        System.out.println(parameter = 2*(length + width));
    }
}
