// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final long INF = 0x3f3f3f3f3f3f3f3fL;
	boolean check(long p, long q, long r, long s) {
		return Math.abs(p - q) > Math.abs(r - s);
	}
	void main() {
		int n = sc.nextInt();
		int[] aa = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++)
			sum += aa[i] = sc.nextInt();
		long b = aa[0], c = aa[1], d = aa[2], e = sum - b - c - d;
		long ans = INF;
		for (int h = 1, i = 2, j = 3, a; i + 1 < n; i++) {
			while (h >= 2 && (a = aa[h - 1]) > 0 && check(b, c, b - a, c + a)) {
				b -= a; c += a;
				h--;
			}
			while (i - h >= 2 && (a = aa[h]) > 0 && check(b, c, b + a, c - a)) {
				b += a; c -= a;
				h++;
			}
			while (j - i >= 2 && (a = aa[j - 1]) > 0 && check(d, e, d - a, e + a)) {
				d -= a; e += a;
				j--;
			}
			while (n - j >= 2 && (a = aa[j]) > 0 && check(d, e, d + a, e - a)) {
				d += a; e -= a;
				j++;
			}
			long x = Math.min(Math.min(b, c), Math.min(d, e));
			long y = Math.max(Math.max(b, c), Math.max(d, e));
			ans = Math.min(ans, y - x);
			a = aa[i];
			c += a; d -= a;
		}
		println(ans);
	}
}
