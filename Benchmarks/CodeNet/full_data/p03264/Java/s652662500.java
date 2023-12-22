import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = 1000000007;
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws Exception {

		long res = solution(nextInt());
//		Helper.tr(freq);
		out.println(res);
	}

	private long solution(int N) {
		
		return (N+1)/2*(N/2);
	}

	private long f(long cnt) {
		if (cnt <= 0)
			return 0;
		return cnt * cnt;
	}

	private int[][] nextInts(int r, int c) throws IOException {
		int[] a[];
		a = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				a[i][j] = nextInt();
		return a;
	}

	private int[] nextTuple(int n) throws IOException {
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	private int[] nextInts(int n) throws IOException {
		return nextTuple(n);
	}

	static int nextInt() throws IOException {
		return parseInt(next());
	}

	static long nextLong() throws IOException {
		return parseLong(next());
	}

	static double nextDouble() throws IOException {
		return parseDouble(next());
	}

	static String next() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	public static void main(String[] args) {
		new Thread(null, null, "Main", 0x4000000) {
			public void run() {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					out = new PrintWriter(new OutputStreamWriter(System.out));
					new Main().solve();
					in.close();
					out.close();
				} catch (Throwable e) {
					e.printStackTrace();
					exit(1);
				}
			}
		}.start();
	}
}
