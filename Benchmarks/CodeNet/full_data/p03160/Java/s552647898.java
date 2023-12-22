import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int h[] = new int[n + 1];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			h[i + 1] = Integer.parseInt(str[i]);
		}

		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {
			dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]), dp[i - 2] + Math.abs(h[i] - h[i - 2]));
		}

		System.out.println(dp[n]);
	}
}
