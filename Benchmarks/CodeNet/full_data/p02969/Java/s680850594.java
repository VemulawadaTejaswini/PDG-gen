import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        long ans = 3 * r * r;
        System.out.println(ans);
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