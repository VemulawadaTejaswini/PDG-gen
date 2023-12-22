
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0, k = 2;
    public static int[] h = new int[100001];
    public static long[] dp = new long[100001];
    public final static long oo = 10000000000l;

    public static long solve(int idx) {
        if (idx == n - 1) {
            return 0;
        } else {
            if (dp[idx] == -1) {
                long c1 = solve(idx + 1) + Math.abs(h[idx] - h[idx + 1]);
                long c2 = oo;
                if (n - idx > 2) {
                    c2 = solve(idx + 2) + Math.abs(h[idx] - h[idx + 2]);
                }
                return dp[idx] = Math.min(c1, c2);
            } else {
                return dp[idx];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100001; i++) {
            dp[i] = -1;
        }
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        System.out.println(solve(0));
    }

}
