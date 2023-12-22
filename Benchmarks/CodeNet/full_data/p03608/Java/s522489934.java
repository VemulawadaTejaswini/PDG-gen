
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int n;
	static long m;
	static int r;
	static ArrayList<Integer> route = new ArrayList<Integer>();
	static int[][] map;
	static int[][] dis;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextLong();
			r = sc.nextInt();

			for (int i = 0; i < r; i++) {
				route.add(sc.nextInt() - 1);
			}

			map = new int[n][n];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				map[a][b] = map[b][a] = sc.nextInt();
			}

			// 各最短ルート作成
			dis = new int[n][n];
			for (int i = 0; i < r; i++) {
				dijkstra(route.get(i), dis[route.get(i)]);
			}

			System.out.println(calc(new ArrayList<Integer>(), (ArrayList<Integer>)route.clone(), Long.MAX_VALUE));

		}
	}

	static long calc(ArrayList<Integer> a, ArrayList<Integer> b, long result) {
		if (b.size() == 0) {
			long tmp = 0;
			for (int i = 0; i < a.size() - 1; i++) {
				tmp += dis[a.get(i)][a.get(i + 1)];
			}
			if (tmp < result) {
				return tmp;
			} else {
				return result;
			}
		} else {
			for (int i = 0; i < b.size(); i++) {
				ArrayList<Integer> newA = (ArrayList<Integer>)a.clone();
				ArrayList<Integer> newB = (ArrayList<Integer>)b.clone();
				newA.add(b.get(i));
				newB.remove(i);
				long tmp = calc(newA, newB, result);
				if (tmp < result) {
					result = tmp;
				}
			}

		}

		return result;
	}

	public static void dijkstra(int src, int[] distance) {
		int nTown = distance.length;
		boolean[] fixed = new boolean[nTown]; // 最短距離が確定したかどうか
		for (int i = 0; i < nTown; i++) { // 各都市について初期化する
			distance[i] = Integer.MAX_VALUE; // 最短距離の初期値は無限遠
			fixed[i] = false; // 最短距離はまだ確定していない
		}
		distance[src] = 0; // 出発地点までの距離を0とする
		while (true) {
			// 未確定の中で最も近い都市を求める
			int marked = minIndex(distance, fixed);
			if (marked < 0)
				return; // 全都市が確定した場合
			if (distance[marked] == Integer.MAX_VALUE)
				return; // 非連結グラフ
			fixed[marked] = true; // その都市までの最短距離は確定となる
			for (int j = 0; j < nTown; j++) { // 隣の都市(i)について
				if (map[marked][j] > 0 && !fixed[j]) { // 未確定ならば
					// 旗の都市を経由した距離を求める
					int newDistance = distance[marked] + map[marked][j];
					// 今までの距離よりも小さければ、それを覚える
					if (newDistance < distance[j])
						distance[j] = newDistance;
				}
			}
		}
	}

	// まだ距離が確定していない都市の中で、もっとも近いものを探す
	static int minIndex(int[] distance, boolean[] fixed) {
		int idx = 0;
		for (; idx < fixed.length; idx++) // 未確定の都市をどれか一つ探す
			if (!fixed[idx])
				break;
		if (idx == fixed.length)
			return -1; // 未確定の都市が存在しなければ-1
		for (int i = idx + 1; i < fixed.length; i++) // 距離が小さいものを探す
			if (!fixed[i] && distance[i] < distance[idx])
				idx = i;
		return idx;
	}
}
