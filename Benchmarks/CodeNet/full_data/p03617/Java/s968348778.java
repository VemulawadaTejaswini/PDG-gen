import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int[] a = new int[] {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
		
		for (int i  =0; i < 3; i++) {
			a[i + 1] = Math.min(a[i + 1], a[i] * 2);
		}
		for (int i = 2; i >= 0; i--) {
//			a[i] = Math.min(a[i], a[i + 1]);
		}
		long n = in.nextLong() * 4;
		long result = 0;
		
		for (int i = 3; i >= 0; i--) {
			long div = n >>> i;
			result += div * a[i];
			n -= div << i;
		}
		out.println(result);
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
