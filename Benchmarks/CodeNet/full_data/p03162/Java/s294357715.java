import java.util.*;
import java.io.*;
import java.util.function.*;

public class Main {
	public final int MOD = (int)1e9 + 7;
	
	public void solve(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[3];
		for (int i = 0; i < n; i++) {
			int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if (i == 0) {
				dp[0] = c[0];
				dp[1] = c[1];
				dp[2] = c[2];
				continue;
			}
			int[] new_dp = new int[3];
			Arrays.fill(new_dp, -((int)1e9 + 7));
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j != k) new_dp[k] = Math.max(new_dp[k], c[k] + dp[j]);    
				}
			}
			dp[0] = new_dp[0];
			dp[1] = new_dp[1];
			dp[2] = new_dp[2];
			//System.out.println(Arrays.toString(new_dp));
		}	
		System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
	}
	
	public long mathPow(long base, long exp, long mod) {
		long res = 1;
		base = base % mod;
		while (exp > 0) {
			if ((exp & 1) == 1) res = (res * base ) % mod;
			exp = exp >> 1;
			base = (base * base) % mod;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		new Main().solve(br);
	}
}

