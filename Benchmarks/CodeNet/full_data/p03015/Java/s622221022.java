import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private static final long MOD = 1_000_000_007;
	long[][] dp = null;
	
	public long get(String L, int N, int upper) {
		if (upper >= 1) {
			upper = 1;
		}
		if (dp[N][upper] != -1) {
			return dp[N][upper];
		} else {
			int max = 0;
			max += upper * 2;
			if (L.charAt(N) == '1') {
				max += 1;
			}
			
			long count = 0;
			// use 0
			count = (count + get(L, N+1, max)) % MOD;
			
			// use 1
			if (max >= 1) {
				count = (count + get(L, N+1, max-1)) % MOD;
				count = (count + get(L, N+1, max-1)) % MOD;
			}
			dp[N][upper] = count;
			return count;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		String L = in.next();
		in.close();

		int N = L.length();
		
		dp = new long[N][2];
		for (int i=0; i<N; i++) {
			Arrays.fill(dp[i], -1);
		}
		if (L.charAt(N-1) == '0') {
			dp[N-1][0] = 1L;
			dp[N-1][1] = 3L;
		} else {	// '1'
			dp[N-1][0] = 3L;
			dp[N-1][1] = 3L;
		}
		
		for (int n=N-1; n>=0; n--) {
			get(L, n, 0);
			get(L, n, 1);
		}
		
		long ret = get(L, 0, 0);
		
		System.out.println(ret);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
