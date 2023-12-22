import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain4

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain4 sc = new FastScannerMain4(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[][] fri = new int[N][N];
			int[][] block = new int[N][N];

			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				fri[a - 1][b - 1] = 1;
				fri[b - 1][a - 1] = 1;
			}

			for (int i = 0; i < K; i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				block[c - 1][d - 1] = 1;
				block[d - 1][c - 1] = 1;
			}

			//System.out.println(Arrays.deepToString(fri));
			//System.out.println(Arrays.deepToString(block));

			String ans = "";
			for (int i = 0; i < N; i++) {
				//System.out.println(i + " " + Arrays.toString(fri[i]));
				//System.out.println(i + " " + Arrays.toString(block[i]));
				int ansn = 0;
				for (int j = 0; j < N; j++) {
					if (i == j) {
						continue;
					} else {
						if (fri[i][j] != 1 && block[i][j] != 1) {
							ansn++;
						}
					}
				}
				ans += ansn + " ";
			}
			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMain4 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain4(InputStream in) {
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
