import java.util.*;
import java.io.*;

public class C {

	char ask(int i) {
		out.println(i);
		out.flush();
		String s = in.nextToken();
		if (s.equals("Vacant")) {
			out.close();
			System.exit(0);
		}
		return s.charAt(0);
	}

	void solve() {
		int n = in.nextInt();
		char start = ask(0), end = ask(n - 1);
		int l = 0, r = n - 1;
		while (r - l > 2) {
			int m = (l + r) / 2;
			if (m % 2 == 1) {
				m--;
			}
			char ask = ask(m);
			if (ask == start) {
				l = m;
			} else {
				r = m;
			}
		}
		ask((l + r) / 2);
		throw new AssertionError();
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new C().run();
	}
}
