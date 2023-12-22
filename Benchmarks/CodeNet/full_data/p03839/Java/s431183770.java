import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static long req(int n, int k, long psum, int[] a) {
		int l = 0, r = k;
		long sub = 0, plu = 0;
		for (int i=l; i<r; i++) {
			if (a[i] < 0) sub += -a[i];
			else plu += a[i];
		}

		long res = 0;

		while (r <= n) {
			res = Math.max(res, Math.max(psum - plu, psum - sub));

			if (a[l] < 0) sub -= -a[l];
			else plu -= a[l];
			if (a[r] < 0) sub += -a[r];
			else plu += a[r];
			l++; r++;
		}

		return res;
	}

	static void solve() {
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1]; // rev

		long sum = 0;
		long psum = 0;

		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			b[n-1-i] = a[i];
			sum += a[i];
			if (a[i] > 0) psum += a[i];
		}

		long ans = req(n, k, psum, a);

		out.println(ans);
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}