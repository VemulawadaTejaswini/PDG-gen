
import java.util.*;

public class Main {
    static long MOD = 109+7;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] xs = new int[n];
        int[] ys = new int[n];

        for(int i = 0 ; i < n;i++) {
            xs[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            ys[i] = sc.nextInt();
        }

        long ans1 = 0;

        for(int k = 1; k <= m; k++) {
            ans1 += (m + 1 - 2 * k) * ys[m - k];
            ans1 %= MOD;
        }

        long ans2 = 0;

        for(int k = 1; k <= n; k++) {
            ans2 += (n + 1 - 2 * k) * xs[n - k];
            ans2 %= MOD;
        }

        long ans = ans1 * ans2 % MOD;

        System.out.println(ans);
    }
}