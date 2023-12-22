import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		int max = (int) 1e6;
		int[] cnt=  new int[max];
		for (int i = 0; i < n; i++) {
			int x=  in.nextInt() + 1;
			cnt[x - 1]++;
			cnt[x]++;
			cnt[x + 1]++;
		}
		int mx = 0;
		for (int i : cnt) {
			mx = Math.max(mx, i);
		}
		out.println(mx);
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
