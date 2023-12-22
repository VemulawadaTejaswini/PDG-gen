import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		Map<Integer, Integer> cnt = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (!cnt.containsKey(x)) {
				cnt.put(x, 0);
			}
			cnt.put(x, cnt.get(x) + 1);
		}
		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
			if (!cnt.containsKey(b[i]) || cnt.get(b[i]) == 0) {
				out.println("NO");
				return;
			}
			cnt.put(b[i], cnt.get(b[i]) - 1);
		}
		out.println("YES");
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
