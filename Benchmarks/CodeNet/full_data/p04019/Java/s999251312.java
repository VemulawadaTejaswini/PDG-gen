import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Main {
	void solve() {
		char[] s = sc.next().toCharArray();
		
		int[] cnt = new int[4];
		for (char c : s) {
			cnt["NWSE".indexOf(c)]++;
		}
		
		boolean ans = true;
		if (cnt[0] == 0 && cnt[2] > 0) ans = false;
		if (cnt[0] > 0 && cnt[2] == 0) ans = false;
		if (cnt[1] == 0 && cnt[3] > 0) ans = false;
		if (cnt[1] > 0 && cnt[3] == 0) ans = false;
		out.println(ans ? "Yes":"No");
	}

	static void tr(Object... os) { System.err.println(deepToString(os)); }

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}