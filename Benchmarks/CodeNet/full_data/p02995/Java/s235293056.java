
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long a = in.nextLong();
        final long b = in.nextLong();
        final long c = in.nextLong();
        final long d = in.nextLong();

        final long gcd = gcd(c, d);
        final long target = (c / gcd) * (d / gcd) * gcd;

        final long c1 = (a - 1) / c;
        final long c2 = b / c;

        final long d1 = (a - 1) / d;
        final long d2 = b / d;

        final long t1 = (a - 1) / target;
        final long t2 = b / target;
        System.out.println(b - a + 1 - ((c2 - c1) + (d2 - d1) - (t2 - t1)));
    }

    private static long gcd(long c, long d) {
        if (d > c) {
            return gcd(d, c);
        }

        final long mod = c % d;
        if (mod == 0) {
            return d;
        }
        return gcd(d, mod);
    }
}
