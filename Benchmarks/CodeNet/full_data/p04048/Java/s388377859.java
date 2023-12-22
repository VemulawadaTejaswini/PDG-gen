import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static long rec(long n, long x) {
		if (n%x == 0) {
			return (n/x-1)*2*x+x;
		}

		return n/x*2*x + rec(Math.max(x, n-x), Math.min(n-x,x));
	}

	static void solve() {
		long n = in.nextLong();
	 	long x = in.nextLong();
	 	out.println((rec(Math.max(x, n-x), Math.min(n-x,x))+n));
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