import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        long min_price = Long.MAX_VALUE;
        if (x < y) {
            long tmp = x;
            x = y;
            y = tmp;
            tmp = a;
            a = b;
            b = tmp;
        }
        for (long ab_num = 0; ab_num <= x * 2; ab_num += 2) {
            long a_remaining = x - ab_num / 2;
            long b_remaining = y - ab_num / 2;
            b_remaining = Math.max(0, b_remaining);
            min_price = Math.min(min_price, ab_num * c + a_remaining * a + b_remaining * b);
        }
        System.out.println(min_price);
    }
}
