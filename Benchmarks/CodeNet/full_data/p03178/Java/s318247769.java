import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] k = sc.next().toCharArray();
		int d = sc.nextInt();
		sc.close();

		int n = k.length;
		int mod = 1000000007;
		long[][] dp0 = new long[n + 1][d];
		long[][] dp1 = new long[n + 1][d];
		dp0[0][0] = 1;
		for (int i = 0; i < n; i++) {
			int c = k[i] - '0';
			for (int j = 0; j < d; j++) {
				for (int j2 = 0; j2 < c; j2++) {
					dp1[i + 1][(j + j2) % d] += dp0[i][j];
				}
				dp0[i + 1][(j + c) % d] += dp0[i][j];
				for (int j2 = 0; j2 < 10; j2++) {
					dp1[i + 1][(j + j2) % d] += dp1[i][j];
				}
			}
			for (int j = 0; j < d; j++) {
				dp0[i + 1][j] %= mod;
				dp1[i + 1][j] %= mod;
			}
		}
		long ans = dp0[n][0] + dp1[n][0] - 1 + mod;
		ans %= mod;
		System.out.println(ans);
	}
}
