
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main implements Runnable { //クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {}
	 * System.out.println();
	 * HashMap<Integer, Integer> hm = new HashMap<>();
	 * int[] s = new int[M];
	 * ArrayDeque<Integer> deq = new ArrayDeque<>();
	 *
	 * 文字列のSort
	 * String sorted = S.chars()
						.sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
						.toString();
	 * for (char i = 'a'; i <= 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainD2 sc = new FastScannerMainD2(System.in);

		try {
			//String S = sc.nextLine().trim();
			// 5 2 4
			int N = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();

			int[][] ADJ = new int[(2 * N)][3];
			int i = 0;
			int count = 0;
			while (true) {
				ADJ[count][0] = i;
				ADJ[count][1] = i + 1;
				ADJ[count][2] = 1;
				count++;
				ADJ[count][0] = i + 1;
				ADJ[count][1] = i;
				ADJ[count][2] = 1;
				i++;
				count++;
				if (i >= N - 1) {
					break;
				}
			}
			ADJ[count][0] = X - 1;
			ADJ[count][1] = Y - 1;
			ADJ[count][2] = 1;
			count++;
			ADJ[count][0] = Y - 1;
			ADJ[count][1] = X - 1;
			ADJ[count][2] = 1;

			//System.out.println(Arrays.deepToString(ADJ));

			int[] ans = new int[N];
			Dijkstra dijkstra = new Dijkstra(N, ADJ);
			//System.out.println(Arrays.toString(dijkstra.dijkstras(0)));
			for (int j = 0; j < N; j++) {

				int[] each = dijkstra.dijkstras(j);
				//System.out.println(Arrays.toString(each));
				for (int k = 0; k < each.length; k++) {
					//System.out.println(each[k]);
					ans[each[k]]++;
				}
			}

			for (int j = 1; j < N; j++) {
				System.out.println(ans[j] / 2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Dijkstra {
	int n; //頂点数
	int[][] adj;
	List<Edge>[] edges;
	int[] distance;

	public Dijkstra(int N, int[][] ADJ) {
		//Wikipedia の例(図)をデータにしたもの
		this.n = N; //頂点数
		//this.s = S; //スタート頂点(頂点番号は -1 されている[元は 1])
		/**
		 * { 0, 1, 7 },
		 * { 0, 2, 9 },
		 * { 0, 5, 14 },
		 * { 1, 2, 10 },
		 * { 1, 3, 15 },
		 * { 2, 3, 11 },
		 * { 2, 5, 2 },
		 * { 3, 4, 6 },
		 * { 4, 5, 9 }
		 * s:0 → g:4 のとき、答えは 20
		 */
		this.adj = ADJ;

		//隣接リスト
		@SuppressWarnings("unchecked")
		List<Edge>[] edges = new List[n];
		for (int i = 0; i < n; i++) {
			edges[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < adj.length; i++) {
			edges[adj[i][0]].add(new Edge(adj[i][0], adj[i][1], adj[i][2]));
			//edges[adj[i][1]].add(new Edge(adj[i][1], adj[i][0], adj[i][2])); //無向グラフなので、逆方向も接続する
		}
		this.edges = edges;
	}

	static final int INF = 100100100; //INF 値(十分に大きな値)

	//ダイクストラ法[単一始点最短経路(Single Source Shortest Path)]
	int dijkstra(int s, int g) {
		distance = new int[n]; //始点からの最短距離

		Arrays.fill(distance, INF); //各頂点までの距離を初期化(INF 値)
		distance[s] = 0; //始点の距離は０

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(s, s, 0)); //始点を入れる

		while (!q.isEmpty()) {
			Edge e = q.poll(); //最小距離(cost)の頂点を取り出す
			if (distance[e.target] < e.cost) {
				continue;
			}

			//隣接している頂点の最短距離を更新する
			for (Edge v : edges[e.target]) {
				if (distance[v.target] > distance[e.target] + v.cost) { //(始点～)接続元＋接続先までの距離
					distance[v.target] = distance[e.target] + v.cost; //現在記録されている距離より小さければ更新
					q.add(new Edge(e.target, v.target, distance[v.target])); //始点～接続先までの距離
				}
			}
		}

		this.distance = distance;
		return distance[g]; //到達できなかったときは、INF となる
	}

	//ダイクストラ法[単一始点最短経路(Single Source Shortest Path)]
	int[] dijkstras(int s) {
		distance = new int[n]; //始点からの最短距離

		Arrays.fill(distance, INF); //各頂点までの距離を初期化(INF 値)
		distance[s] = 0; //始点の距離は０

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(s, s, 0)); //始点を入れる

		while (!q.isEmpty()) {
			Edge e = q.poll(); //最小距離(cost)の頂点を取り出す
			if (distance[e.target] < e.cost) {
				continue;
			}

			//隣接している頂点の最短距離を更新する
			for (Edge v : edges[e.target]) {
				if (distance[v.target] > distance[e.target] + v.cost) { //(始点～)接続元＋接続先までの距離
					distance[v.target] = distance[e.target] + v.cost; //現在記録されている距離より小さければ更新
					q.add(new Edge(e.target, v.target, distance[v.target])); //始点～接続先までの距離
				}
			}
		}

		this.distance = distance;
		return distance; //到達できなかったときは、INF となる
	}
}

//辺情報の構造体
class Edge implements Comparable<Edge> {
	public int source = 0; //接続元ノード
	public int target = 0; //接続先ノード
	public int cost = 0; //重み

	public Edge(int source, int target, int cost) {
		this.source = source;
		this.target = target;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost; //重みの小さい順
	}

	@Override
	public String toString() { //デバッグ用
		return "source = " + source + ", target = " + target + ", cost = " + cost;
	}
}

//高速なScanner
class FastScannerMainD2 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD2(InputStream in) {
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
