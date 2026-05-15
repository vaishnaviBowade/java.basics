public class operator {
    public static void main(String[] args){
        int a = 7 , b  = 3;
        double c = a/b;
        System.out.println(c); // gives output 2.0


        int d = 7 ;
        double e  = 3;
        double f = d/e;
        System.out.println(f); // gives output 2.3333333333333335

/*
        int g = 7 ;
        double h  = 3;
        int i = g/h;
        System.out.println(i); // gives an error incompatible types: possible lossy conversion from double to int
*/
        char ch = '0';
        System.out.println(ch++);
        System.out.println(ch++); // picks 0 at first then covert to 1 bcz ch++ so next time it prints 1
        char ch1 = 'a';
        System.out.println(ch1++);
        System.out.println(ch1++); // picks a at first then covert to b bcz ch++ so next time it prints b

        char ch2 = 'a';
        System.out.println(ch2++ + ch2);

        char ch3 = 'a';
        System.out.println(ch3+++ch3); // consider it as ch3++ + ch3 actually after formatting its automatically coverted into this


        int k = 9;
        k += 5; //basically it is the shorter version of k = k + 5;
        System.out.println(k);




    }
}
