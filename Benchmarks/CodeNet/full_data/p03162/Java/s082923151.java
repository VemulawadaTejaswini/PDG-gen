import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int[] a;
    int[] b;
    int[] c;
    long[] dp;
    int[] bfr;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp = new long[n];
        Arrays.fill(dp, 0);
        bfr = new int[n];
        dp();
        System.out.println(dp[n-1]);
    }
    
    private void dp() {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[0] = max(-1, a[i], b[i], c[i], -1);
            } else {
                dp[i] = dp[i-1] + max(bfr[i-1], a[i], b[i], c[i], i);
            }
        }
    }

    private long max(int yesterday, int a, int b, int c, int cur) {
        long max = 0;
        if (cur < 0) {
            if (a > max) {
                max = a;
                bfr[0] = 1;
            }
            if (b > max) {
                max = b;
                bfr[0] = 2;
            }
            if (c > max) {
                max = c;
                bfr[0] = 3;
            }
        } else {
            if (a > max && yesterday != 1) {
                max = a;
                bfr[cur] = 1;
            }
            if (b > max && yesterday != 2) {
                max = b;
                bfr[cur] = 2;
            }
            if (c > max && yesterday != 3) {
                max = c;
                bfr[cur] = 3;
            }

        }
        return max;
    }
    
    
}