import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		if (n > 2000) {
			throw new Exception();
		}

		int mod = 1000000007;
		long[] p = new long[n];
		p[0] = 1;
		long[] d = new long[n];
		for (int i = 1; i < n; i++) {
			p[i] = p[i - 1] * i % mod;
			d[i] = x[i] - x[i - 1];
		}
		long[][] c = new long[n][n];
		c[1][1] = 1;
		for (int i = 2; i < n; i++) {
			for (int j = 1; j < i; j++) {
				c[i][j] = c[i - 1][j] * i % mod;
			}
			c[i][i] = (c[i - 1][i - 1] * i + c[i - 1][1]) % mod;
		}

		long ans = 0;
		for (int i = 1; i < n; i++) {
			long val = c[n - 1][i] * d[i];
			ans += val;
			ans %= mod;
		}
		System.out.println(ans);
	}
}
