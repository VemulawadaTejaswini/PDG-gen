import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] ti = new long[n];

        for (int i = 0; i < n; i++) {
            ti[i] = sc.nextLong();
        }
        sc.close();

        long ans = 1;

        for (int i = 0; i < n; i++) {
            ans = lcm(ans, ti[i]);
        }

        System.out.println(ans);

    }

    private static long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return m / gcd(m, n) * n;
    }

}