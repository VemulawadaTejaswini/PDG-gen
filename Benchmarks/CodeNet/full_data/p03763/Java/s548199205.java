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
		String[] s = new String[n];
		int[][] cnt = new int[n][26];
		for (int i=0; i<n; i++) {
			s[i] = in.next();
			for (int j=0; j<s[i].length(); j++) {
				cnt[i][s[i].charAt(j) - 'a']++;
			}
		}
		
		int[] min = new int[26];
		Arrays.fill(min, Integer.MAX_VALUE/2);
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<26; j++) {
				min[j] = Math.min(min[j], cnt[i][j]);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for (int i=0; i<26; i++) {
			for (int j=0; j<min[i]; j++) {
				ans.append((char)(i + 'a'));
			}
		}
		
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