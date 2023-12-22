import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long f = INF;
        long s = INF;
        for (long i = L; i <= R; i++) {
            if (i % 2019 < f) {
                s = f;
                f = i % 2019;
            } else if (s == INF) {
                s = i % 2019;
            }
            if (f == 0) {
                System.out.println("0");
                return;
            }
        }
        System.out.println((f * s) % 2019);
    }

    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}