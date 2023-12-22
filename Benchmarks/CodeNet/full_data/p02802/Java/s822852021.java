import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はWelcomeToAtCoder

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerWelcomeToAtCoder sc = new FastScannerWelcomeToAtCoder(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] p = new int[M];
			String[] S = new String[M];
			ArrayList<Integer> ac = new ArrayList<Integer>();

			for (int m = 0; m < M; m++) {
				p[m] = sc.nextInt();
				S[m] = sc.nextLine().trim();
			}

			int ans_c = 0;
			int ans_p = 0;

			/*
			 * 1 M:同じ問題複数
			 * 2 M:なし → そもそもwhileに入らない
			 * 3 M:問題が飛ぶ → iを進めたらだめ
			 */

			for (int m = 0; m < M; m++) {
				if (ac.contains(p[m])) {
					continue;
				}

				if (S[m].equals("AC")) {
					ans_c++;
					ac.add(p[m]);
				} else {
					ans_p++;
				}
			}

			System.out.println(ans_c + " " + ans_p);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//高速なScanner
class FastScannerWelcomeToAtCoder {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerWelcomeToAtCoder(InputStream in) {
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
