import java.io.*;
import java.util.*;
class Main {
	public static final int MAX = 100000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = (br.readLine()).trim().split("\\s+");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(input[i]);
		}
		int dp[][] = new int[n][2];
		for(int i = n - 1; i >= 0; i--) {
			if(i == n - 1) {
				dp[i][0] = dp[i][1] = 0;
				continue;
			}
			// dp[i][0] : one step
			// dp[i][1] : two step
			if(i + 1 < n) {
				dp[i][0] = Math.min(dp[i + 1][0], dp[i + 1][1]) + (int) Math.abs(ar[i + 1] - ar[i]);
			}
			else {
				dp[i][0] = MAX;
			}
			if(i + 2 < n) {
				dp[i][1] = Math.min(dp[i + 2][0], dp[i + 2][1]) + (int) Math.abs(ar[i + 2] - ar[i]);
			}
			else {
				dp[i][1] = MAX;
			}
		}
		System.out.println(Math.min(dp[0][0], dp[0][1]));
	}
}
