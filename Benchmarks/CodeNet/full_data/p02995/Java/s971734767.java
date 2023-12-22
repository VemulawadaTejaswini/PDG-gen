import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        a--;
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long total = b - a;

        long divD = b / d - a / d;
        long divC = b / c - a / c;

        long lcm = getLcm(c, d);
        long divL = b / lcm - a / lcm;

        System.out.println(total - (divD + divC - divL));

    }

    private static long getLcm(long n, long m) {

        long bn = n;
        long bm = m;

        while (n != m) {
            if (n < m) {
                n += bn;
            } else {
                m += bm;
            }
        }
        return n;
    }
}