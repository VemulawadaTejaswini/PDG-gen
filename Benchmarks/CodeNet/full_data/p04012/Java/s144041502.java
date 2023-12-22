import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		String w = in.next();
		boolean[] f = new boolean[26];
		for (int i=0; i<w.length(); i++) {
			f[w.charAt(i) - 'a'] = !f[w.charAt(i) - 'a'];
		}
		for (int i=0; i<26; i++) {
			if (f[i]) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
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