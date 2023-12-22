
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	//2 ≤ N ≤10^5
	//1 ≤ hi ≤ 10^4
	public void run() {
		FastScannerFrog12 sc = new FastScannerFrog12(System.in);

		//Refer to https://qiita.com/drken/items/dc53c683d6de8aeacf5a
		int N = sc.nextInt();
		int h[] = new int[N];
		int dp[] = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			if (i == 1) {
				dp[i] = Math.abs(h[i] - h[i - 1]);
			} else {
				int jump1 = Math.abs(h[i] - h[i - 1]) + dp[i - 1];
				int jump2 = Math.abs(h[i] - h[i - 2]) + dp[i - 2];

				dp[i] = Math.min(jump1, jump2);

			}
		}
		System.out.println(dp[N - 1]);
	}
}

//高速なScanner
class FastScannerFrog12 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerFrog12(InputStream in) {
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
