import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 * @author mj
 *
 */
public class Main implements Runnable { //クラス名はMain3

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain3 sc = new FastScannerMain3(System.in);

		try {
			int A = sc.nextInt();
			int B = sc.nextInt();

			double itemA1 = 0;
			double itemB1 = 0;
			double itemA2 = 0;
			double itemB2 = 0;

			double taxA = 0.08;
			double taxB = 0.1;

			itemA1 = A / taxA;
			itemB1 = B / taxB;
			itemA2 = (A + 1) / taxA;
			itemB2 = (B + 1) / taxB;

			if ((itemA1 - (int) itemA1) > 0) {
				//System.out.println("yes");
				itemA1 += 1;
			}
			if ((itemB1 - (int) itemB1) > 0) {
				//System.out.println("yes2");
				itemB1 -= 1;
			}

			/*
			System.out.println(itemA1 - (int) itemA1);
			System.out.println(itemA1);
			System.out.println(itemA2);
			
			System.out.println(itemB1);
			System.out.println(itemB2);
			*/

			boolean ans = false;
			for (int i = (int) itemA1; i < (int) itemA2; i++) {
				for (int j = (int) itemB1; j < (int) itemB2; j++) {
					if (i == j) {
						if (!ans) {
							System.out.println(i);
						}
						ans = true;
						break;
					}
				}
				if (ans) {
					break;
				}
			}
			if (!ans) {
				System.out.println(-1);
			}

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerMain3 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain3(InputStream in) {
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
