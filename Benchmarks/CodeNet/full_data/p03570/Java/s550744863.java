import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int n = s.length;
		int[] a = new int[n];
		int now = 0;
		for (int i = 0; i < n; i++) {
			int k = s[i] - 'a';
			now ^= 1 << k;
			a[i] = now;
		}
		if (a[n - 1] == 0) {
			System.out.println(1);
			return;
		}

		int[] dp = new int[1 << 26];
		Arrays.fill(dp, 100000000);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < 26; k++) {
				int pre = a[i] ^ (1 << k);
				dp[a[i]] = Math.min(dp[a[i]], dp[pre] + 1);
			}
		}
		System.out.println(dp[a[n - 1]]);
	}
}
