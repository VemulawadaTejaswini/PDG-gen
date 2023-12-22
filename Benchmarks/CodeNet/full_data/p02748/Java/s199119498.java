import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 *
 */
public class Main implements Runnable { //クラス名はMain2

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain2 sc = new FastScannerMain2(System.in);

		try {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int M = sc.nextInt();
			int[] a = new int[A + 1];
			int[] b = new int[B + 1];
			ArrayList<Costs> sums = new ArrayList<>();

			long ans = 0;

			long minA = Long.MAX_VALUE;
			for (int i = 1; i <= A; i++) {
				a[i] = sc.nextInt();
				if (minA > a[i]) {
					minA = a[i];
				}
			}

			long minB = Long.MAX_VALUE;
			for (int i = 1; i <= B; i++) {
				b[i] = sc.nextInt();
				if (minB > b[i]) {
					minB = b[i];
				}
			}

			long min = Long.MAX_VALUE;
			Costs cost = new Costs();
			for (int i = 1; i <= M; i++) {
				cost.x = sc.nextInt();
				cost.y = sc.nextInt();
				cost.cos = sc.nextInt();
				cost.sum = a[cost.x] + b[cost.y] - cost.cos;
				if (min > cost.sum) {
					min = cost.sum;
				}
			}

			if ((minA + minB) > min) {
				System.out.println(min);
			} else {
				System.out.println((minA + minB));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Costs {
	int x;
	int y;
	int cos;
	long sum;
}

//高速なScanner
class FastScannerMain2 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain2(InputStream in) {
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
