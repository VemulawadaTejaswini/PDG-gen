import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		String s = in.next();
		int n = s.length();
		int[][] cnt = new int[n+1][26];
		for (int i=0; i<n; i++) {
			cnt[i][s.charAt(i) - 'a']++;
			for (int j=0; j<26; j++) {
				cnt[i+1][j] = cnt[i][j];
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				if (j - i < 1) continue;
				for (int k=0; k<26; k++) {
					int x = cnt[j][k];
					if (i != 0) x -= cnt[i-1][k];
					if ((j - i + 1)/2 < x) {
						out.println((i+1)+" "+(j+1));
						return;
					}
				}
			}
		}
		out.println("-1 -1");
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