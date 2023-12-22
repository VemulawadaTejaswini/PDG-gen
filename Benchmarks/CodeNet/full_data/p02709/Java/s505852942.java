import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> o2.a - o1.a);
		long[][] dp = new long[n + 1][n + 1];
		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= n; j++) {
//				System.out.print(dp[i][j] + "\t");
//			}
//			System.out.println();
			for (int j = 0; j <= i; j++) {
				long val1 = (long) Math.abs(n - 1 - (i - j) - arr[i].i) * arr[i].a;
				dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + val1);
				long val2 = (long) Math.abs(arr[i].i - j) * arr[i].a;
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + val2);
			}
		}

		long ans = 0;
		for (int j = 0; j <= n; j++) {
			ans = Math.max(ans, dp[n][j]);
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a;
	}
}
