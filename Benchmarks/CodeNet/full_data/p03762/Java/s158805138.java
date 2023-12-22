
import java.util.Scanner;


public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        int n = 0, m = 0;
        long[] xs, ys;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        xs = new long[n];
        ys = new long[m];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextLong();
        }
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            ys[i] = sc.nextLong();
        }
        long[][] areas = new long[n-1][m-1];
                long tmp1, tmp2;
        long ans = 0l;
        long num = 0l;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                num = ((((i+1) * (n - i - 1)) % MOD) * (((j+1) * (m - j - 1)) % MOD) % MOD);
                tmp1 = (xs[i+1] - xs[i]) % MOD;
                tmp2 = (ys[j+1] - ys[j]) % MOD;
                areas[i][j] = (tmp1 * tmp2) % MOD;
                ans += (areas[i][j] * num) % MOD;
            }
        }
        System.out.println(ans);
    }
}
