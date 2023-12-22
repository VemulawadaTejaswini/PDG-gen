import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = S.length();
		int[][] cnt = new int[S.length()][26];
		for (int i = 0; i < S.length(); ++i) {
			cnt[i][S.charAt(i) - 'a']++;
			for (int j = 0; j < 26 && i > 0; ++j) {
				cnt[i][j] += cnt[i - 1][j];
			}
		}
		long ans = n * (n - 1) / 2 + 1;
		for (int i = n - 1; i >= 0; --i) {
			ans -= cnt[n - 1][S.charAt(i) - 'a'] - cnt[i][S.charAt(i) - 'a'];
		}
		// for (int i = 0; i + 1 < n; ++i) {
		// for (int j = 0; j < 2; ++j) {
		// int l, r;
		// if (j == 0) {
		// l = i - 1;
		// r = i + 1;
		// } else {
		// l = i;
		// r = i + 1;
		// }
		// while (l >= 0 && r < n) {
		// if (S.charAt(l) != S.charAt(r)) {
		// ++ans;
		// }
		// --l;
		// ++r;
		// }
		// }
		// }
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}