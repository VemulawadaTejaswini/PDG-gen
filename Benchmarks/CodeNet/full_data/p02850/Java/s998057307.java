
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMainD1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer,
	 * Integer> hm = new HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq
	 * = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char
	 * i = 'a'; i <= 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainD1 sc = new FastScannerMainD1(System.in);

		try {
			int N = sc.nextInt();
			// long startTime = System.currentTimeMillis();
			NodeList[] nls = new NodeList[N];
			EdgeList[] els = new EdgeList[N - 1];

			for (int i = 0; i < N; i++) {
				NodeList nodelist = new NodeList();
				nls[i] = nodelist;
			}

			for (int i = 0; i < N - 1; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				nls[a].neighbours.add(b);
				EdgeList el = new EdgeList();
				el.i = i;
				el.from = a;
				el.to = b;
				nls[a].edges.add(el);
				els[i] = el;
			}

			bfs(0, nls, els, N);
			// long endTime = System.currentTimeMillis();
			// System.out.println("開始時刻：" + startTime + " ms");
			// System.out.println("終了時刻：" + endTime + " ms");
			// System.out.println("処理時間：" + (endTime - startTime) + " ms");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void bfs(int start, NodeList[] nls, EdgeList[] els, int N) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(start);
		boolean[] visit = new boolean[N];
		visit[start] = true;
		int maxcolor = 0;

		while (pq.size() > 0) {
			int loc = pq.poll();
			int color = 1;
			visit[loc] = true;

			for (int i = 0; i < nls[loc].neighbours.size(); i++) {
				// System.out.println(
				// "color:" + color + ",loc:" + loc + " ,i:" + i + " ,from:" +
				// nls[loc].edges.get(i).from + " ,to:"
				// + nls[loc].edges.get(i).to + ",colors:" + nls[loc].edges.get(i).color + " ,
				// nei:"
				// + nls[loc].neighbours.get(i) + " visit:" +
				// visit[nls[loc].neighbours.get(i)]);
				int next = nls[loc].neighbours.get(i);

				if (nls[loc].colors.contains(color)) {
					color = nls[loc].colors.stream().max(Integer::compare).get() + 1;
				}

				// nls[loc].edges.get(i).color = color;
				nls[loc].colors.add(color);
				nls[next].colors.add(color);
				els[nls[loc].edges.get(i).i].color = color;
				pq.offer(next);
				if (maxcolor < color) {
					maxcolor = color;
				}
				color++;
			}

		}

		/*
		 * System.out.println("---------"); for (int i = 0; i < N - 1; i++) {
		 * System.out.println(i + " " + nls[i].neighbours); }
		 * System.out.println("---------"); for (int i = 0; i < N; i++) {
		 * System.out.println("--"); for (int j = 0; j < nls[i].edges.size(); j++) {
		 * System.out.println(i + " ,from:" + nls[i].edges.get(j).from + " ,to:" +
		 * nls[i].edges.get(j).to + ",color:" + nls[i].edges.get(j).color); } }
		 */
		// System.out.println("Ans---------");
		System.out.println(maxcolor);
		for (int i = 0; i < N - 1; i++) {
			System.out.println(els[i].color);
		}

	}
}

class NodeList {
	ArrayList<Integer> neighbours = new ArrayList<Integer>();
	ArrayList<EdgeList> edges = new ArrayList<EdgeList>();
	ArrayList<Integer> colors = new ArrayList<Integer>();
}

class EdgeList {
	int i;
	int from;
	int to;
	int color;
}

// 高速なScanner
class FastScannerMainD1 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD1(InputStream in) {
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
