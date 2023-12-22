import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long INF64 = 1 << 60;
    public static void main(String[] args) {
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        int aMax = 0;
        for(int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            aMax = Math.max(aMax, a[i]);
        }
        
        long[] dp = new long[h + aMax];
        Arrays.fill(dp, 1, h + aMax, INF64);
        for(int i = 1; i < h + aMax; ++i) {
            for(int j = 0; j < n; ++j) {
                int hpIndex = Math.max(0, i - a[j]);
                dp[i] = Math.min(dp[hpIndex] + b[j], dp[i]);
            }
        }
        
        long ans = INF64;
        for(int i = h; i < h + aMax; ++i) {
            ans = Math.min(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
