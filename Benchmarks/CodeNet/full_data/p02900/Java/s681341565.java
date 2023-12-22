import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();

        long d = gcd(a, b);
        long p = 2;
        int cnt = 0;
        while (p * p <= d) {
            if (d % p == 0) cnt++;
            while (d % p == 0) {
                d /= p;
            }
            p++;
        }
        if (d > 1) {
            cnt++;
        }

        System.out.println(cnt + 1);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
