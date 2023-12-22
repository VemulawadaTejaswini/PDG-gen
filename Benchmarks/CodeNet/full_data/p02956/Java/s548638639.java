import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;
	static long[] pow2;
	static int N;

	public static void main(String[] args) {
		N = sc.nextInt();
		pow2 = new long[N + 1];
		pow2[0] = 1;
		for (int i = 0; i < N; i++) {
			pow2[i + 1] = pow2[i] * 2 % MOD;
		}
		for (int i = 0; i <= N; i++) {
			pow2[i] = (pow2[i] + MOD - 1) % MOD;
		}
		Point[] ps = new Point[N];
		for (int i = 0; i < N; i++) {
			int X = Integer.parseInt(sc.next());
			int Y = Integer.parseInt(sc.next());
			ps[i] = new Point(X, Y);
		}
		Arrays.sort(ps, (p1, p2) -> Integer.compare(p1.x, p2.x));
		long ans = count(ps);
		for (int i = 0; i < N; i++) {
			ps[i].x *= -1;
		}
		for (int i = 0; i < N / 2; i++) {
			Point tmp = ps[i];
			ps[i] = ps[N - 1 - i];
			ps[N - 1 - i] = tmp;
		}
		ans += count(ps);
		for (int i = 1; i < N; i++) {
			ans += pow2[i] * 2;
			ans %= MOD;
		}
		System.out.println((N * pow2[N] + MOD - ans) % MOD);
	}

	static long count(Point[] ps) {
		TreeSet<Integer> set = new TreeSet<>();
		long ret = 0;
		for (int i = 0; i < N; i++) {
			int upper = set.tailSet(ps[i].y).size();
			int lower = i - upper;
			ret += pow2[i];
			ret += MOD - pow2[upper];
			ret += MOD - pow2[lower];
			ret %= MOD;
			set.add(ps[i].y);
		}
		return ret;
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
