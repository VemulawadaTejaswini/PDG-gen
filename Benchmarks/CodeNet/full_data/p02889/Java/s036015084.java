import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	FastScanner in;
	PrintWriter out;

	void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();

		long d1[][] = new long[n][n];
		long MAX = Long.MAX_VALUE / 4;

		// グラフの初期化
		for (int i = 0; i < n; ++i)
			Arrays.fill(d1[i], MAX);

		// 町間の距離を入力
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();

			d1[a][b] = d1[b][a] = c;
		}

		// ワーシャルフロイド法で町間の最短距離を算出
		for (int k = 0; k < n; ++k) {
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (d1[i][j] > d1[i][k] + d1[k][j])
						d1[i][j] = d1[i][k] + d1[k][j];
				}
			}
		}

		// 燃料算出用グラフの初期化
		long d2[][] = new long[n][n];
		for (int i = 0; i < n; ++i) {
			Arrays.fill(d2[i], MAX);
		}

		// 燃料算出用グラフの入力
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (d1[i][j] <= l) {
					d2[i][j] = d2[j][i] = 1;
				}
			}
		}
		d1 = d2;

		// ワーシャルフロイド法で町間の最小燃料量を算出
		for (int k = 0; k < n; ++k) {
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (d1[i][j] > d1[i][k] + d1[k][j])
						d1[i][j] = d1[i][k] + d1[k][j];
				}
			}
		}

		int q = in.nextInt();
		for (int i = 0; i < q; ++i) {
			int s = in.nextInt() - 1;
			int t = in.nextInt() - 1;

			long x = d1[s][t];
			out.println(x == MAX ? -1 : x - 1);
		}

	}

	void run() {
		try {
			in = new FastScanner(new File("Main.in"));
			out = new PrintWriter(new File("Main.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Main().runIO();
	}
}
