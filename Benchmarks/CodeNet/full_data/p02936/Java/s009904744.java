

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
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
			//String S = sc.nextLine().trim();
			int N = sc.nextInt();
			int Q = sc.nextInt();
			HashMap<Integer, Edge> hm = new HashMap<>();
			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int i = 1; i <= N; i++) {
				hm.put(i, new Edge());
			}

			int a = 0;
			int b = 0;

			for (int i = 0; i < N - 1; i++) {
				a = sc.nextInt();
				b = sc.nextInt();

				hm.get(a).to.add(b);
				hm.get(a).count = 0;
				hm.put(a, hm.get(a));
			}

			/*
			for (Entry<Integer, Edge> entry : hm.entrySet()) {
				System.out.println("------------------------------");
				System.out.println(entry.getKey());
				System.out.println("children");
				for (int i = 0; i < entry.getValue().to.size(); i++) {
					System.out.println(entry.getValue().to.get(i));
				}
				System.out.println(entry.getValue().count);
			}
			*/

			int p = 0;
			long x = 0;
			for (int i = 0; i < Q; i++) {
				p = sc.nextInt();
				x = sc.nextLong();

				hm.get(p).count += x;
			}

			long[] ans = new long[N + 1];
			dfs(hm, 1, 0, ans);

			for (int i = 1; i <= N; i++) {
				System.out.print(ans[i] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void dfs(HashMap<Integer, Edge> hm, int p, long x, long[] ans) {
		if (hm.get(p).to.size() == 0) {
			ans[p] += x + hm.get(p).count;
		} else {
			ans[p] += x + hm.get(p).count;
			for (int i = 0; i < hm.get(p).to.size(); i++) {
				//System.out.println("p:" + p + " to:" + hm.get(p).to.get(i) + " ans[p]:" + ans[p]);
				dfs(hm, hm.get(p).to.get(i), ans[p], ans);
			}
		}
	}
}

class Edge {
	ArrayList<Integer> to = new ArrayList<Integer>();
	long count;
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
