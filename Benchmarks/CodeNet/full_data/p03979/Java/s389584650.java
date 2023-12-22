import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int H, W;
	static char[][] S;

	public static void main(String[] args) {
		H = sc.nextInt();
		W = sc.nextInt();
		S = new char[H][];
		for (int i = 0; i < H; ++i) {
			S[i] = sc.next().toCharArray();
		}
		System.out.println(solve());
	}

	static int solve() {
		for (int i = 0; i < W; ++i) {
			if (S[0][i] == 'X' || S[H - 1][i] == 'X') return -1;
		}
		for (int i = 0; i < H; ++i) {
			if (S[i][0] == 'X' || S[i][W - 1] == 'X') return -1;
		}
		for (int i = 1; i < H - 1; ++i) {
			for (int j = 1; j < W - 1; ++j) {
				if (S[i][j] == 'X') {
					for (int k = 0; k < 4; ++k) {
						if (S[i + DR[k]][j + DC[k]] == '.') S[i + DR[k]][j + DC[k]] = 'F';
					}
				}
			}
		}
		MaxFlow f = new MaxFlow(2 * H * W + 2);
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (i != 0) f.add(i * W + j + H * W, (i - 1) * W + j, 99999);
				if (i != H - 1) f.add(i * W + j + H * W, (i + 1) * W + j, 99999);
				if (j != 0) f.add(i * W + j + H * W, i * W + j - 1, 99999);
				if (j != W - 1) f.add(i * W + j + H * W, i * W + j + 1, 99999);
				if (S[i][j] == 'X') {
					f.add(2 * H * W, i * W + j, 99999);
					f.add(i * W + j, i * W + j + H * W, 99999);
				} else {
					f.add(i * W + j, i * W + j + H * W, 1);
				}
			}
		}
		for (int i = 1; i < H - 1; ++i) {
			f.add(i * W + H * W, 2 * H * W + 1, 99999);
			f.add(i * W + W - 1 + H * W, 2 * H * W + 1, 99999);
		}
		for (int i = 1; i < W - 1; ++i) {
			f.add(i + H * W, 2 * H * W + 1, 99999);
			f.add((H - 1) * W + i + H * W, 2 * H * W + 1, 99999);
		}
		return f.calc(2 * H * W, 2 * H * W + 1);
	}

	static class MaxFlow {
		ArrayList<HashMap<Integer, Integer>> g = new ArrayList<>();

		MaxFlow(int size) {
			for (int i = 0; i < size; ++i) {
				g.add(new HashMap<>());
			}
		}

		void add(int from, int to, int cap) {
			g.get(from).put(to, cap);
			g.get(to).put(from, -cap);
		}

		int calc(int src, int sink) {
			int size = g.size();
			int result = 0;
			int[] prev = new int[size];
			while (true) {
				boolean[] visited = new boolean[size];
				Queue<Integer> q = new ArrayDeque<Integer>();
				q.add(src);
				visited[src] = true;
				OUT: while (!q.isEmpty()) {
					int cur = q.poll();
					for (Entry<Integer, Integer> e : g.get(cur).entrySet()) {
						if (!visited[e.getKey()] && e.getValue() > 0) {
							prev[e.getKey()] = cur;
							visited[e.getKey()] = true;
							if (e.getKey() == sink) {
								break OUT;
							}
							q.add(e.getKey());
						}
					}
				}
				if (!visited[sink]) {
					break;
				}
				int pos = sink;
				int pathCap = Integer.MAX_VALUE;
				while (pos != src) {
					int p = prev[pos];
					pathCap = Math.min(pathCap, g.get(p).get(pos));
					pos = p;
				}
				pos = sink;
				while (pos != src) {
					int p = prev[pos];
					g.get(p).put(pos, g.get(p).get(pos) - pathCap);
					g.get(pos).put(p, g.get(pos).get(p) + pathCap);
					pos = p;
				}
				result += pathCap;
			}
			return result;
		}
	}

}
