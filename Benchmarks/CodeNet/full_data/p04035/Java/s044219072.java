import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int n = in.nextInt();
		int l = in.nextInt();
		int[] a = new int[n];
		int p = -1;
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			if (i != 0) {
				if (a[i] + a[i-1] >= l) p = i-1;
			}
		}

		if (p >= 0) {
			out.println("Possible");
			for (int i=0; i<p; i++) {
				out.println(i+1);
			}
			for (int i=n-1; i>p; i--) {
				out.println(i);
			}
		} else {
			out.println("Impossible");
		}
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