import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int['z' - 'a' + 1];
		Arrays.fill(cnt, Integer.MAX_VALUE);
		for (int i = 0; i < n; ++i) {
			char[] s = sc.next().toCharArray();
			int[] cur_cnt = new int['z' - 'a' + 1];
			for (char c : s) {
				cur_cnt[c - 'a']++;
			}
			for (int j = 0; j < cur_cnt.length; ++j) {
				cnt[j] = Math.min(cnt[j], cur_cnt[j]);
			}
		}
		String ans = "";
		for (int i = 0; i < cnt.length; ++i) {
			for (int j = 0; j < cnt[i]; ++j)
				ans += (char) ('a' + i);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}