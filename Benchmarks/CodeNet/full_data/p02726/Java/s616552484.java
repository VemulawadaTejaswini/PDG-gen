
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {}
	 * System.out.println();
	 * HashMap<Integer, Integer> hm = new HashMap<>();
	 * int[] s = new int[M];
	 * ArrayDeque<Integer> deq = new ArrayDeque<>();
	 *
	 * 文字列のSort
	 * String sorted = S.chars()
						.sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
						.toString();
	 * for (char i = 'a'; i <= 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			long[][] dp = new long[N][N];
			WarshallFloyd wf = new WarshallFloyd(N);

			for (int i = 0; i < N - 1; i++) {
				int from = i;
				int to = i + 1;
				wf.set(from, to, 1);
				wf.set(to, from, 1);
			}

			wf.set(X - 1, Y - 1, 1);
			wf.set(Y - 1, X - 1, 1);

			wf.calc();

			dp = wf.getd();

			long[] ans = new long[N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//System.out.println(dp[i][j]);
					if (i != j) {
						ans[(int) dp[i][j]]++;
					}
				}

			}

			for (int i = 1; i < N; i++) {
				System.out.println(ans[i] / 2);
			}

			//System.out.println(Arrays.deepToString(dp));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class WarshallFloyd {

	private final long INF = Long.MAX_VALUE / 3;
	private long[][] d;
	private int V;

	/**
	 * 初期化
	 *
	 * @param n 頂点の数
	 */
	public WarshallFloyd(int n) {
		this.d = new long[n][n];
		for (long[] ls : this.d) {
			Arrays.fill(ls, this.INF);
		}
		this.V = n;
	}

	public void set(int from, int to, long cost) {
		this.d[from][to] = cost;
	}

	/**
	 * すべての2頂点間の最短距離を計算する O(|V|^3)
	 */
	public void calc() {
		for (int k = 0; k < this.V; k++) {
			for (int i = 0; i < this.V; i++) {
				for (int j = 0; j < this.V; j++) {
					this.d[i][j] = Math.min(this.d[i][j], this.d[i][k] + this.d[k][j]);
				}
			}
		}
	}

	/**
	 * 全ての配列を返却
	 * @return d
	 */
	public long[][] getd() {
		return this.d;
	}

	/**
	 * fromからtoまでの最短距離を返す O(1).<br>
	 * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
	 *
	 * @param from
	 * @param to
	 * @return fromからtoまでの最短距離
	 */
	public long distance(int from, int to) {
		return this.d[from][to];
	}

}

//高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
