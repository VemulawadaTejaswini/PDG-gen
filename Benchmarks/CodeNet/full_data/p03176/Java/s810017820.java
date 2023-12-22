
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.max;


public class Main {


    int MAXN = (int) (2 * 1e5 + 10);

    int N;
    long[] bit = new long[MAXN];
    int[] h = new int[MAXN];
    int[] a = new int[MAXN];
    long[] dp = new long[MAXN];

    int LSOne(int S) {
        return S & -S;
    }

    void update(int x, long val) {
        while (x <= N) {
            bit[x] = max(bit[x], val);
            x += LSOne(x);
        }
    }

    long query(int x) {
        long ans = 0;
        while (x > 0) {
            ans = max(ans, bit[x]);
            x -= LSOne(x);
        }
        return ans;
    }


    int go() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        N = scanner.nextInt();


        for (int i = 1; i <= N; i++) {
            h[i] = scanner.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            a[i] = scanner.nextInt();
        }
        for (int flower = 1; flower <= N; flower++) {
            dp[flower] = query(h[flower] - 1) + a[flower];
            update(h[flower], dp[flower]);
        }
        long best = 0;
        for (int i = 0; i <= N; i++) {
            best = max(best, dp[i]);

        }
        System.out.printf("%d\n", best);
        return 0;
    }


    public static void main(String[] args) {

        Main f = new Main();
        f.go();

    /*
    4
3 1 4 2
10 20 30 40
answer : 60

     */
    }
}