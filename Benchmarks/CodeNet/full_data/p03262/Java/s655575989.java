import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long X = sc.nextLong();

        long res = 0;

        for (int i = 0; i < N; i++) {
            final long x = sc.nextLong();
            res = gcd(res, Math.abs(x-X));
        }

        System.out.println(res);
    }

    private static long gcd(final long a, final long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
