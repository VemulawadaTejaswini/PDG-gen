import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int[] a = new int[n];
		int[] w = new int[n];

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			a[i] = Integer.parseInt(input[1]);
		}
		
		long ans = extendSolve(n,k,a,w);
		
		System.out.println(ans);
	}

	private static long extendSolve(int n, int k, int[] a, int[] w) {
		
		long[] dp = new long[k+1];
		
		for (int i = 0; i < n; i++) {
			for (int j = k; j>=w[i]; j--) {
				dp[j] = Math.max(dp[j], a[i]+dp[j-w[i]]);
			}
		}
		
		return dp[k];
	}
}
