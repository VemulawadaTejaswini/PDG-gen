import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		int[] line = new int[w + 1];
		int[] line0 = new int[w + 2];
		int end = (int) Math.pow(2, w - 1);
		for (int i = 0; i < end; i++) {
			String str = Integer.toBinaryString(i);
			StringBuilder sb = new StringBuilder(str);
			while (sb.length() < w - 1) {
				sb.insert(0, '0');
			}
			if (sb.indexOf("11") == -1) {
				for (int j = 0; j < sb.length(); j++) {
					line[j + 1] += sb.charAt(j) - '0';
					if (j == 0) {
						if (sb.charAt(j) == '0') {
							line0[j + 1]++;
						}
					}
					if (j == sb.length() - 1) {
						if (sb.charAt(j) == '0') {
							line0[j + 2]++;
						}
					} else {
						if (sb.charAt(j) == '0' && sb.charAt(j + 1) == '0') {
							line0[j + 2]++;
						}
					}
				}
			}
		}
		for (int i = 0; i < line.length; i++) {
			System.out.print(line[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < line0.length; i++) {
			System.out.print(line0[i] + " ");
		}
		System.out.println();

		long[][] dp = new long[h + 1][w + 2];
		dp[0][1] = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 1; j <= w; j++) {
				// →
				long sum = dp[i][j - 1] * line[j - 1] % mod;
				// ↓
				sum += dp[i][j] * line0[j] % mod;
				sum %= mod;
				// ←
				sum += dp[i][j + 1] * line[j] % mod;
				sum %= mod;
				dp[i + 1][j] = sum;
			}
		}
		for (int i = 0; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(dp[h][k]);
	}
}
