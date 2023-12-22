import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		long[] x = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		long[] y = new long[m];
		for (int i = 0; i < m; i++) {
			y[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int mod = 1000000007;
		long xx = 0;
		for (int i = 0; i < n; i++) {
			xx += i * x[i] - (n - i - 1) * x[i];
			xx %= mod;
		}
		long yy = 0;
		for (int i = 0; i < m; i++) {
			yy += i * y[i] - (m - i - 1) * y[i];
			yy %= mod;
		}
		long ans = xx * yy % mod;
		if (ans < 0) {
			ans += mod;
		}
		System.out.println(ans);
	}
}
