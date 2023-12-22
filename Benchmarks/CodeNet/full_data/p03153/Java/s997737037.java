import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String... args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line.split(" ")[0]);
		int D = Integer.parseInt(line.split(" ")[1]);

		List<String> strs = Arrays.asList(br.readLine().split(" "));
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> aListIndexKey = new ArrayList<Integer>();

		for (int i = 0; i < strs.size(); i++) {
			aList.add(Integer.parseInt(strs.get(i)));
			aListIndexKey.add(Integer.parseInt(strs.get(i)));
		}

		// 計算済みコストをキャッシュ
		Map<String, Integer> cacheCosts = new HashMap<String, Integer>();

		// 2次元目には、接続元ノード, 接続先ノード, コストが格納される
		List<Edge>[] edgeList = new List[N];
		for (int i = 0; i < N; i++) {
			edgeList[i] = new ArrayList<Edge>();
		}

		// 全島を走査
		int size = aList.size();
		for (int i = 0; i < size; i++) {

			// 最小コストを初期化
			int minCost = 0;
			int minIndex = 0;

			// 自分の島より左側の島たちのみ処理
			for (int j = 0; j < i; j++) {

				// 最小コストかを判断
				Integer cost = cacheCosts.get(j + ":" + i);
				if (cost == null) {
					cost = Math.abs(i - j) * D + aListIndexKey.get(i) + aListIndexKey.get(j);
					cacheCosts.put(j + ":" + i, cost);
				}

				// 既知最小コスト以下の場合は最小コストに設定
				if (minCost == 0 || minCost > cost) {
					minCost = cost;
					minIndex = j;
				}
			}

			// 橋一覧に追加
			edgeList[i].add(new Edge(i, minIndex, minCost));
			edgeList[minIndex].add(new Edge(minIndex, i, minCost));

			// 自分の島より右側の島たちのみ処理
			for (int j = i + 1; j < size; j++) {

				// 最小コストかを判断
				Integer cost = cacheCosts.get(i + ":" + j);
				if (cost == null) {
					cost = Math.abs(i - j) * D + aListIndexKey.get(i) + aListIndexKey.get(j);
					cacheCosts.put(i + ":" + j, cost);
					cacheCosts.put(j + ":" + i, cost);
				}

				// 既知最小コスト以下の場合は最小コストに設定
				if (minCost == 0 || minCost > cost) {
					minCost = cost;
					minIndex = j;
				}
			}

			// 橋一覧に追加
			edgeList[i].add(new Edge(i, minIndex, minCost));
			edgeList[minIndex].add(new Edge(minIndex, i, minCost));

		}

		int ans = prim(N, edgeList);
		System.out.println(ans); //最小全域木の重み
	}

	//プリム法[最小全域木(Minimum Spannig Tree)]
	static int prim(int n, List<Edge>[] edges) {
		boolean[] done = new boolean[n]; //訪問フラグ

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(0, 0, 0)); //０から(ダミー)

		int totalCost = 0; //最小全域木の重み
		while (!q.isEmpty()) {
			Edge e = q.poll(); //最小コストの辺を取り出す
			if (done[e.target]) {
				continue;
			}

			done[e.target] = true; //訪問済にする
			totalCost += e.cost;
			q.addAll(edges[e.target]); //隣接しているすべての辺を追加
		}

		return totalCost;
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
		return this.cost - o.cost;
	}

	@Override
	public String toString() { //デバッグ用
		return "source = " + source + ", target = " + target + ", cost = " + cost;
	}
}
