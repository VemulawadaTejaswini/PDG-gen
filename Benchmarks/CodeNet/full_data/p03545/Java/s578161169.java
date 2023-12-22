
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			String S = sc.nextLine().trim();
			ArrayList<String> arr = new ArrayList<String>();

			dfs(S, (String) S.subSequence(0, 1), Integer.valueOf((String) S.subSequence(0, 1)), 1, arr);
			System.out.println(arr.get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void dfs(String os, String news, long ans, int next, ArrayList<String> arr) {
		if (next == 4) {
			//System.out.println("news:" + news + " ans:" + ans);
			if (ans == 7) {
				arr.add(news + "=7");
			}
		} else {
			String news1 = news + "+" + (String) os.subSequence(next, next + 1);
			long ans1 = ans + Long.valueOf((String) os.subSequence(next, next + 1));

			dfs(os, news1, ans1, next + 1, arr);

			long ans2 = ans - Long.valueOf((String) os.subSequence(next, next + 1));

			String news2 = news + "-" + (String) os.subSequence(next, next + 1);
			dfs(os, news2, ans2, next + 1, arr);
		}
	}
}

//高速なScanner
class FastScannerMain1 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain1(InputStream in) {
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
