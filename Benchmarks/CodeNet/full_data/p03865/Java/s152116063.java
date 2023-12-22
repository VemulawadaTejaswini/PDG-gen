import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static HashMap<String,Boolean> dp = new HashMap<>();

	static boolean rec(String s) {
		if (dp.containsKey(s)) {
			return dp.get(s);
		}
		int n = s.length();

		if (n == 3) {
			if (s.charAt(0) != s.charAt(n-1)) {
				dp.put(s, true);
				return true;
			} else {
				dp.put(s, false);
				return false;
			}
		}

		boolean f = false;
		for (int i=1; i<n-1; i++) {
			if (s.charAt(i-1) != s.charAt(i+1)) {
				if (!rec(s.substring(0, i) + s.substring(i+1, n))) {
					f = true;
					break;
				}
			}
		}

		dp.put(s, f);

		return f;
	}

	static void solve() {
		String s = in.next();
		int n = s.length();
		out.println(rec(s) ? "First" : "Second");
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