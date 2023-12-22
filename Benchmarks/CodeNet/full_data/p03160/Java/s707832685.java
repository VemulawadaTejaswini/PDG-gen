import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    long n;
    int[] h;
    long[] dp;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        h = new int[(int)n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp();
        System.out.println(dp[(int)n-1]);
    }
    
    private void dp() {
        dp = new long[(int)n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if(i>1) {
                dp[i] = Math.min(dp[i-1] + Math.abs(h[i-1] - h[i]), dp[i-2] + Math.abs(h[i-2] - h[i]));
            } else {
                dp[i] = dp[i-1] + Math.abs(h[i-1] - h[i]);
            }
        }
    }
}