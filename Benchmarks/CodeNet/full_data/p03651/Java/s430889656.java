import java.util.Scanner;

public class Main {
    int n;
    long k;
    long[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextLong();
        as = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
    }

    private void solve() {
        long gcd = as[0];
        long max = as[0];
        for (int i = 1; i < n; i++) {
            gcd = gcd(as[i], gcd);
            max = Math.max(max, as[i]);
        }
        if (k <= max && k % gcd == 0)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }

    private long gcd(long x, long y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
