import java.util.Scanner;

public class Main {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n, k;

        n = cin.nextInt();
        k = cin.nextInt();

        if (k >= n - 1) {
            System.out.println(choose(2 * n - 1, n -1));
        } else {
            long sum = 0;
            for (int i = 0; i <= k; i++) {
                sum += ((pow(choose(n - 1, Math.min(n - i - 1, i)), 2) * (n * pow (n - i, mod - 2)) % mod) + mod) % mod;
            }
            System.out.println(sum);
        }
    }

    public static long pow(long n, int m) {
        long prod = 1;
        while (m > 0) {
            if ((m & 1) == 1) {
                prod = (prod * n) % mod;
            }
            n = (n*n) % mod;
            m >>= 1;
        }
        return prod;
    }

    public static long choose(int a, int b) {
        long numerator = 1;
        long denominator = 1;
        for (int i = 1; i <= b; i++) {
            numerator *= a - i + 1;
            denominator *= b - i + 1;
            numerator %= mod;
            denominator %= mod;
        }
        return (numerator * pow(denominator, mod - 2)) % mod;
    }
}
