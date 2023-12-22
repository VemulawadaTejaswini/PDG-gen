import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[N];
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        if (a[0] > x) {
            a[0] = x;
        }
        for (int i = 1; i < N; i++) {
            if (a[i - 1] + a[i] > x) {
                a[i] = x - a[i - 1];
            }
        }
        for (int i = 0; i < N; i++) {
            ans += a[i];
        }
        System.out.println(sum-ans);
    }
}