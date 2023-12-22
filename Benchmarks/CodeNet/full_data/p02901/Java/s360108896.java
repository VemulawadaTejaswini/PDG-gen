import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int c[] = new int[M];
		
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			for(int j = 0; j < b[i]; j++) {
				c[i] |= 1 << (sc.nextInt() - 1);
			}
		}
		
		int dp[] = new int[1 << N];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 0; i < 1 << N; i++) {
			for(int j = 0; j < M; j++) {
				if(dp[i] != Integer.MAX_VALUE) {
					int t = i | c[j];
					int cost = dp[i] + a[j];
					dp[t] = Math.min(dp[t], cost);
				}
			}
		}
		
		System.out.println(dp[(1 << N) - 1] == Integer.MAX_VALUE ? -1 : dp[(1 << N) - 1]);
	}
}
