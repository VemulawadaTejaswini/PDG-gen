import java.util.Scanner;

public class Main {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n, a, b;

        n = cin.nextInt();
        a = cin.nextInt();
        b = cin.nextInt();

        long sum = pow(2, n) - 1;

        sum -= choose(n, a);
        sum -= choose(n, b);
        if (sum < 0) {
            sum += mod;
        }

        System.out.println(sum);
    }

    public static long pow(long n, int m) {
        long prod = 1;
        while (m > 0) {
            if (m % 2 != 0) {
                prod *= n;
                prod %= mod;
            }
            n *= n;
            n %= mod;
            m /= 2;
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
