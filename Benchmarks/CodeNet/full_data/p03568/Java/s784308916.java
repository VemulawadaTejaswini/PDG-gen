import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		int resOdd = 1, resEven = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x % 2 == 0) {
				resEven = resOdd + resEven * 3;
				resOdd *= 2;
			} else {
				resEven = resOdd * 2 + resEven * 3;
				resOdd *= 1;
			}
		}
		out.println(resEven);
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
		new Main().run();
	}
}
