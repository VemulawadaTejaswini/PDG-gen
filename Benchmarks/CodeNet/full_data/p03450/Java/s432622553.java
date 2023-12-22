import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Edge {
	Integer node;
	Integer d;

	Edge(Integer _n, Integer _d) {
		node = _n;
		d = _d;
	}
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean dfs(int idx, int newPos) {

		// 訪問済みノードの場合、記録済みの座標と新しい座標のチェックをする。（異なっていれば矛盾あり）
		if (!notVisited.contains(idx)) {
			if (pos.get(idx) == newPos) {
				return true;
			} else {
				return false;
			}
		}

		// 座標を記録し、未訪問ノードから削除する
		pos.put(idx, newPos);
		notVisited.remove(idx);

		int currentPos = newPos;
		List<Edge> edges = g.get(idx);
		for (Edge e : edges) {
			if (!dfs(e.node, currentPos + e.d)) {
				return false;
			}
		}
		return true;
	}

	Map<Integer, List<Edge>> g = new HashMap<>();
	Set<Integer> notVisited;
	Map<Integer, Integer> pos = new HashMap<>();

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			final int l = sc.nextInt();
			final int r = sc.nextInt();
			final int d = sc.nextInt();

			g.compute(l, (k, v) -> {
				if (v == null) {
					List<Edge> list = new ArrayList<>();
					list.add(new Edge(r, d));
					return list;
				} else {
					v.add(new Edge(r, d));
					return v;
				}
			});
			g.compute(r, (k, v) -> {
				if (v == null) {
					List<Edge> list = new ArrayList<>();
					list.add(new Edge(l, -d));
					return list;
				} else {
					v.add(new Edge(l, -d));
					return v;
				}
			});

		}

		sc.close();

		notVisited = new HashSet<>(g.keySet()); // 複製

		String ans = "Yes";

		Iterator<Integer> it;
		while ((it = notVisited.iterator()).hasNext()) {
			int idx = it.next();
			if (!dfs(idx, 0)) {
				ans = "No";
				break;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
