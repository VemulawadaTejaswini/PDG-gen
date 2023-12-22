

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
				Edge ed = new Edge();
				hm.put(i, ed);
			}

			int a = 0;
			int b = 0;

			for (int i = 0; i < N - 1; i++) {
				a = sc.nextInt();
				b = sc.nextInt();

				hm.get(a).connected.add(b);
				hm.get(b).connected.add(a);
				hm.put(a, hm.get(a));

				hm.get(a).count = 0;

			}
			/*
			for (Entry<Integer, Edge> entry : hm.entrySet()) {
				System.out.println("------------------------------");
				System.out.println(entry.getKey());
				System.out.println("  connected");
				for (int i = 0; i < entry.getValue().connected.size(); i++) {
					System.out.println("  " + entry.getValue().connected.get(i));
				}
			
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
		//System.out.println("p:" + p + "  visit:" + hm.get(p).visit);
		if (hm.get(p).connected.size() == 0 || hm.get(p).visit) {
			if (!hm.get(p).visit) {
				ans[p] += x + hm.get(p).count;
			}
		} else {
			if (!hm.get(p).visit) {
				ans[p] += x + hm.get(p).count;
			}
			hm.get(p).visit = true;
			for (int i = 0; i < hm.get(p).connected.size(); i++) {
				//System.out
				//		.println("   p:" + p + "  visit:" + hm.get(p).visit + " connected:" + hm.get(p).connected.get(i)
				//				+ " ans[p]:" + ans[p]);
				dfs(hm, hm.get(p).connected.get(i), ans[p], ans);
			}
		}
		hm.get(p).visit = true;
	}
}

class Edge {
	ArrayList<Integer> connected = new ArrayList<Integer>();
	long count;
	boolean visit = false;
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
