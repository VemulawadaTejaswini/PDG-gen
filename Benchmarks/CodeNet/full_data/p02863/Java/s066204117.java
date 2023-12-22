import java.util.*;

public class Main {
    static int[] times;
    static int[] greats;
    static int[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		times = new int[n];
		greats = new int[n];
		for (int i = 0; i < n; i++) {
		    times[i] = sc.nextInt();
		    greats[i] = sc.nextInt();
		}
		dp = new int[n][t];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(dp[i], -1);
		}
		int max = 0;
		for (int i = n - 1; i >= 0; i--) {
		    for (int j = i; j < n; j++) {
		        Arrays.fill(dp[j], -1);
		    }
		    max = Math.max(max, dfw(n - 1, i, t - 1) + greats[i]);
		}
		System.out.println(max);
    }
    
    static int dfw(int idx, int without, int t) {
        if (t < 0) {
            return Integer.MIN_VALUE;
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx][t] == -1) {
           dp[idx][t] = dfw(idx - 1, without, t);
           if (idx != without) {
                dp[idx][t] = Math.max(dp[idx][t], dfw(idx - 1, without, t - times[idx]) + greats[idx]);
           }
        }
        return dp[idx][t];
    }
}
