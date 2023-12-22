// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[] xx = new long[n + 2];
		int[] vv = new int[n + 2];
		long[] pp = new long[n + 2];
		long[] qq = new long[n + 2];
		for (int i = 1; i <= n; i++) {
			xx[i] = sc.nextLong();
			pp[i] = qq[i] = vv[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++)
			pp[i] += pp[i - 1];
		for (int i = n; i >= 1; i--)
			qq[i] += qq[i + 1];
		long ans = 0, z = 0;
		for (int i = 1; i <= n; i++) {	// p p q
			long p2 = pp[i] - xx[i] * 2;
			long q = qq[i] - (c - xx[i]);
			ans = Math.max(ans, z + q);
			z = Math.max(z, p2);
		}
		z = 0;
		for (int i = n; i >= 1; i--) {	// q q p
			long p = pp[i] - xx[i];
			long q2 = qq[i] - (c - xx[i]) * 2;
			ans = Math.max(ans, z + p);
			z = Math.max(z, q2);
		}
		println(ans);
	}
}
