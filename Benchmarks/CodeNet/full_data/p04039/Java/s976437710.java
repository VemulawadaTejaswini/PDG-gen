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
		int k = in.nextInt();
		int[] d = new int[k];
		boolean[] ok = new boolean[10];
		Arrays.fill(ok, true);
		for (int i=0; i<k; i++) {
			d[i] = in.nextInt();
			ok[d[i]] = false;
		}

		for (long i=n; ; i++) {
			long x = i;
			boolean f = true;
			while (x != 0) {
				if (!ok[(int)(x%10)]) {
					f = false;
					break;
				}
				x /= 10;
			}
			if (f) {
				out.println(i);
				return;
			}
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