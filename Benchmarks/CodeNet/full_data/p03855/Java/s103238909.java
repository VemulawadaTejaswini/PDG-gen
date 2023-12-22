import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UnionFind {

	private int[] root;
	private int[] connected;

	public UnionFind(int N) {
		root = new int[N];
		for (int i = 0; i < N; ++i) {
			root[i] = i;
		}

		connected = new int[N];
		Arrays.fill(connected, 1);
	}

	public int getRootOf(int x) {
		if (x == root[x]) {
			return x;
		}

		return root[x] = getRootOf(root[x]);
	}

	public int getConnectedCount(int x) {
		return connected[getRootOf(x)];
	}

	public boolean areConnected(int x, int y) {
		return getRootOf(x) == getRootOf(y);
	}

	public void unite(int x, int y) {
		int xRoot = getRootOf(x);
		int yRoot = getRootOf(y);
		if (areConnected(xRoot, yRoot)) {
			return;
		}

		if (connected[xRoot] <= connected[yRoot]) {
			root[xRoot] = yRoot;
			connected[yRoot] += connected[xRoot];
		} else {
			unite(y, x);
		}
	}
}

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		UnionFind road = new UnionFind(n);
		UnionFind rail = new UnionFind(n);
		int k = sc.nextInt();
		int l = sc.nextInt();

		for (int i = 0; i < k + l; ++i) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if (i < k) {
				road.unite(x, y);
			} else {
				rail.unite(x, y);
			}
		}

		Map<String, Integer> pairCounter = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			String key = road.getRootOf(i) + ":" + rail.getRootOf(i);
			pairCounter.putIfAbsent(key, 0);
			pairCounter.put(key, pairCounter.get(key) + 1);
		}

		for (int i = 0; i < n; ++i) {
			String key = road.getRootOf(i) + ":" + rail.getRootOf(i);
			System.out.printf("%d%c", pairCounter.get(key), i < n - 1 ? ' ' : '\n');
		}
	}

}
