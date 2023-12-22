import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はJoisinosTravel

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerJoisinosTravel sc = new FastScannerJoisinosTravel(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int R = sc.nextInt();
			int INF = Integer.MAX_VALUE;

			Integer[] travels = new Integer[R];
			for (int i = 0; i < R; i++) {
				travels[i] = sc.nextInt();
			}

			long[][] dp = new long[N][N];

			WarshallFloyd wf = new WarshallFloyd(N);

			for (int i = 0; i < M; i++) {
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int cost = sc.nextInt();
				wf.set(from, to, cost);
				wf.set(to, from, cost);
			}

			wf.calc();

			dp = wf.getd();

			/*
			for (int i = 0; i < N; i++) {
				System.out.println(Arrays.toString(dp[i]));
			}
			*/

			//System.out.println("-----------------");

			long ans = Long.MAX_VALUE;
			Permutation<Integer> p = new Permutation<>(travels);
			do {
				//System.out.println(Arrays.toString(p.getObjes()));
				Integer[] per = p.getObjes();
				long eachans = 0;
				for (int i = 0; i < per.length; i++) {
					if (i > 0) {
						eachans += wf.distance(per[i - 1] - 1, per[i] - 1);
					}
				}

				if (ans > eachans) {
					ans = eachans;
				}

			} while (p.next());

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Permutation<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private Permutation<T> subPermutation;

	public Permutation(T[] objs) {
		this(0, 0, objs.clone());
	}

	private Permutation(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutation = new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutation == null) {
			return false;
		}

		boolean result = this.subPermutation.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	public T[] getObjes() {
		return this.objs;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}

/**
 * WarshallFloyd法による全点対最短経路問題の実装.<br>
 * 負の辺があっても動作する
 */
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
class FastScannerJoisinosTravel {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerJoisinosTravel(InputStream in) {
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
