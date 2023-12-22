import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] a = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			sa = br.readLine().split(" ");
			for (int j = 0; j < sa.length; j++) {
				int o = Integer.parseInt(sa[j]) - 1;
				o = 1 << o;
				c[i] |= o;
			}
		}
		br.close();

		int n2 = 1 << n;
		int[] dp = new int[n2];
		Arrays.fill(dp, 100000000);
		dp[0] = 0;
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < m; j++) {
				int k = c[j] | i;
				dp[k] = Math.min(dp[k], dp[i] + a[j]);
			}
		}
		if (dp[n2 - 1] == 100000000) {
			System.out.println(-1);
		} else {
			System.out.println(dp[n2 - 1]);
		}
	}

	static class Key {
		int a, b, c;
	}
}
