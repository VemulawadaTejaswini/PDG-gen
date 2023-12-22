import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a_h = in.nextLong() * 5;
        long b_h = in.nextLong() * 5;
        long c_h = in.nextLong() * 5;
        long x = in.nextLong() * 10;
        long y = in.nextLong() * 10;

        long a_diff = c_h - a_h;
        long b_diff = c_h - b_h;

        long price_raw = (x * a_h + y * b_h) / 50;

        if (b_diff > a_diff) {
            // aの方がお得かも？
            //use a to half
            long a_price = x * c_h;
            long b_price = x * c_h;
            if (y > x) {
                //足りない分
                b_price += (y - x) * b_h;
            }
            System.out.println(Math.min(price_raw, (a_price + b_price) / 50));
        } else {
            //bの方がお得かも？
            // a_diff >= b_diff
            //use a to half
            long b_price = y * c_h;
            long a_price = y * c_h;
            if (x > y) {
                //足りない分
                a_price += (x - y) * a_h;
            }
            System.out.println(Math.min(price_raw, (a_price + b_price) / 50));
        }
    }
}
