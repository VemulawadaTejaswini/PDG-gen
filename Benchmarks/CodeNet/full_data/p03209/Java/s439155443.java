import java.util.*;
import java.util.stream.*;

public class Main {

	static long[] count = new long[51];
	static long[] pa = new long[51];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long X = in.nextLong();
		count[0] = pa[0] = 1L;
		for (int i = 1; i <= 50; i++) {
			count[i] = 3L + count[i - 1] * 2L;
			pa[i] = 1L + pa[i - 1] * 2L;
		}
		System.out.println(count(N, X));
	}

	public static long count(int n, long x) {
		if (n == 0) {
			return 1;
		}
		if (x == 1) {
			return 0;
		}

		long ans = 0;

		// 一番した食べる
		x--;

		// 下のN-1次元バーガー
		if (x <= count[n - 1]) {
			return count(n - 1, x);
		} else {
			ans += pa[n - 1];
			x -= count[n - 1];
		}

		if(x < 2) {
			return ans + x;
		}
		// まだ残りがある場合はこの次元の真ん中のP
		ans++;
		x--;
		// 上のN-1次元バーガー
		if (x <= count[n - 1]) {
			return ans + count(n - 1, x);
		}
		return ans + pa[n - 1];
	}
}
