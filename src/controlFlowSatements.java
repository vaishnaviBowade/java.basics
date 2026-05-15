public class controlFlowSatements {
    public static void main(String args[]) {
        //electricity bill
        int units = 676;
        double u100 = 420, u200 = 1020, u400 = 2620;
        double amount = 0.0; //always 0.0 se minimum value leni h naki 0 se bcz its a good practice
        if (units > 0 && units <= 100) {
            amount = units * 4.2;
        } else if (units > 100 && units <= 200) {
            amount = u100 + (units - 100) * 6;
        } else if (units > 200 && units <= 400) {
            amount = u200 + (units - 300) * 8;
        } else{
            amount = u400 + (units - 400) * 13;
        }
        System.out.println(amount);


        //Shop discount
                double price = 8000;
                double dis = 0.0;

                if (price > 0 && price <= 5000) {
                    price = price;

                } else if (price > 5000 && price <= 7000) {
                    dis = (5.0 / 100) * price;
                    price = price - dis;

                } else if (price > 7000 && price <= 9000) {
                    dis = (10.0 / 100) * price;
                    price = price - dis;

                } else {
                    dis = (20.0 / 100) * price;
                    price = price - dis;
                }
                System.out.println("Final Price = " + price);

                //another way
                int p = 8000;
                double d = 0;
                double totalprice = 0;
                // In Java, if both values are integers then division also becomes integer division.
                // Integer division removes the decimal part.
                // Example: 90 / 100 = 0
                // To get decimal output, at least one value must be double.
                // Example: 90.0 / 100 = 0.9

                if(p >= 0 && p <= 5000){
                    totalprice = p;
                }else if(p > 5000 && p <= 7000){
                    d = (100.0 -5)/100;
                    totalprice = p * d;
                }else if(p > 7000 && p <= 9000) {
                    d = (100.0 - 10) / 100;
                    totalprice = p * d;
                }else{
                    d = (100.0 - 20) / 100;
                    totalprice = p * d;
                }
                System.out.println("Final Price = " + totalprice);
    }
}
