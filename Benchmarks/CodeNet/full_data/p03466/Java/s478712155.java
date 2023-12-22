import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		for (int i =0 ; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
			sb.setLength(0);
			stupid(a, b, 0, 0, getAns(a, b, 0, 0));
			out.println(sb.substring(c - 1, d).toString());
		}
	}
	StringBuilder sb = new StringBuilder();

	void stupid(int a, int b, int prevA, int prevB, int needAns) {
		if (a + b == 0) {
			return;
		}
		if (a > 0) {
			if (getAns(a - 1, b, (prevB == 0) ? prevA + 1 : 1, 0) <= needAns) {
				sb.append("A");
				stupid(a - 1, b, (prevB == 0) ? prevA + 1 : 1, 0, needAns);
				return;
			}
		}
		sb.append("B");
		stupid(a, b - 1, 0, (prevA == 0) ? prevB + 1 : 1, needAns);
	}

	private int getAns(int a, int b, int prevA, int prevB) {
		int result = Math.max(prevA,  prevB);
		result = Math.max(result, (a + prevA + b) / (b + 1));
		result = Math.max(result, (b + prevB + a) / (a + 1));
		return result;
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
