import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next()) - 1;
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long gcd = (c * d) / getGcd(c, d);
        long bb = b - (b / c) - (b / d) + (b / gcd);
        long aa = a - (a / c) - (a / d) + (a / gcd);
        System.out.println(bb - aa);
    }

    public static long getGcd(long a, long b) {
        long tmp;
        long x = 0;
        long y = 0;
        if (x >= y) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }
}