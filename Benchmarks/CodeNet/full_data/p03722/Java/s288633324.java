import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はScoreAttack

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerScoreAttack sc = new FastScannerScoreAttack(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] adj = new int[M][3];

			for (int i = 0; i < M; i++) {
				adj[i][0] = sc.nextInt() - 1;
				adj[i][1] = sc.nextInt() - 1;
				int cost = sc.nextInt();
				// 最長を求める問題なので、マイナスに変換すると、最小のマイナス値が返却される。なので、マイナスをつける。
				// ベルマンフォード法は最小経路を求めるアルゴリズムであるため。
				adj[i][2] = -cost;

			}

			BellmanFord bel = new BellmanFord(N, adj);
			Response res = bel.bellmanfordX(0, N - 1);

			if (res.result) {
				System.out.println(-res.costs);//マイナスをつけて符号を逆転
			} else {
				System.out.println("inf");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//有効グラムのみ対応
class BellmanFord {

	private Edge[] edges;
	private int n;

	/*
	 * n 頂点数
	 * adj 有効グラフの配列
	 */
	public BellmanFord(int v, int[][] adj) {

		this.n = v;
		//辺情報の配列を作る
		List<Edge> list = new ArrayList<Edge>();
		for (int i = 0; i < adj.length; i++) {
			list.add(new Edge(adj[i][0], adj[i][1], adj[i][2]));
		}

		//Source > Targetの順に並べなおす。
		Collections.sort(list, new Comparator<Edge>() {
			@Override
			public int compare(Edge a, Edge b) {
				if (a.source < b.source) {
					return -1;
				} else if (a.source > b.source) {
					return 1;
				} else {
					//ここに来るということは、sourceが同じだということなので、次の条件で比較する。
					return a.target - b.target;
				}
			}
		});

		/*
		for (Edge e : list) {
			System.out.println((e.source + 1) + " " + (e.target + 1) + " " + e.cost);
		}
		*/

		this.edges = list.toArray(new Edge[0]); //配列に変換

	}

	/*
	 * ベルマン-フォード法[単一始点最短経路(Single Source Shortest Path)]
	 * s : start地点
	 * g : goal地点
	 */
	// 負の経路があってもゴールまでたどり着ければ無視する
	Response bellmanford(int s, int g) {
		long[] distance = new long[n]; //始点からの最短距離
		int[] count = new int[n]; //更新カウント(負の閉路チェック用)

		Arrays.fill(distance, Long.MAX_VALUE); //各頂点までの距離を初期化(INF 値)
		distance[s] = 0; //始点の距離は０

		boolean negative = false; //負の閉路フラグ
		boolean update = true; //更新フラグ
		int cnt = 0;

		//true and falseだったら周り続ける
		while (update && !negative) {
			update = false;
			for (Edge e : edges) {
				//System.out.println((e.source + 1) + " " + (e.target + 1) + " " + e.cost + " " + distance[e.target]);
				//接続元＋接続先までの距離
				if (distance[e.source] != Long.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
					//System.out.println(" Pass1  " + distance[e.source] + " " + e.cost + " " + distance[e.target]);
					distance[e.target] = distance[e.source] + e.cost; //現在記録されている距離より小さければ更新
					update = true;

					count[e.target]++;

				}
			}
			cnt++;
			if (cnt > n) {
				negative = true;
			}
		}

		Response res = new Response();
		if (negative) {
			res.result = false;
			res.costs = Long.MIN_VALUE;
			return res; //負の閉路があったときは、-INF(Long.MIN_VALUE)を返す
		}
		//到達できなかったときは、INF(Long.MAX_VALUE)になる
		res.costs = distance[g];
		if (distance[g] == Long.MAX_VALUE) {
			res.result = false;
		} else {
			res.result = true;
		}

		return res;
	}

	/*
	 * ベルマン-フォード法[単一始点最短経路(Single Source Shortest Path)]
	 * s : start地点
	 * g : goal地点
	 */
	// 負の経路があってもゴールまでたどり着ければ無視する
	Response bellmanfordX(int s, int g) {
		long[] distance = new long[n]; //始点からの最短距離
		int[] count = new int[n]; //更新カウント(負の閉路チェック用)

		Arrays.fill(distance, Long.MAX_VALUE); //各頂点までの距離を初期化(INF 値)
		distance[s] = 0; //始点の距離は０

		boolean negative = false; //負の閉路フラグ
		boolean goalnegative = false; //負の閉路フラグ(ゴールに辿り着く間に負の閉路があるかどうかのフラグ)
		boolean update = true; //更新フラグ

		int cnt = 0;

		//true and falseだったら周り続ける
		while (update && !negative && !goalnegative) {
			update = false;
			for (Edge e : edges) {
				//System.out.println((e.source + 1) + " " + (e.target + 1) + " " + e.cost + " " + distance[e.target]);
				//接続元＋接続先までの距離
				if (distance[e.source] != Long.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
					//System.out.println(" Pass1  " + distance[e.source] + " " + e.cost + " " + distance[e.target]);
					distance[e.target] = distance[e.source] + e.cost; //現在記録されている距離より小さければ更新
					update = true;
					count[e.target]++;
				}
			}
			cnt++;
			if (cnt > n) {
				if (count[g] > n) {
					goalnegative = true;
				} else {
					negative = true;
				}
				//System.out.println(Arrays.toString(count));
			}
		}

		Response res = new Response();
		if (goalnegative) {
			res.result = false;
			res.costs = Long.MIN_VALUE;
			return res; //負の閉路があったときは、-INF(Long.MIN_VALUE)を返す
		}
		//到達できなかったときは、INF(Long.MAX_VALUE)になる
		res.costs = distance[g];
		if (distance[g] == Long.MAX_VALUE) {
			res.result = false;
		} else {
			res.result = true;
		}

		return res;
	}

	//辺情報の構造体
	class Edge {
		public int source = 0; //接続元ノード
		public int target = 0; //接続先ノード
		public int cost = 0; //重み

		public Edge(int source, int target, int cost) {
			this.source = source;
			this.target = target;
			this.cost = cost;
		}

		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}
}

//Response
class Response {
	public boolean result;
	public long costs;
}

//高速なScanner
class FastScannerScoreAttack {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerScoreAttack(InputStream in) {
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