import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static Station[] ss;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		ss = new Station[N];
		for (int i = 0; i < N; ++i) {
			ss[i] = new Station();
		}
		for (int i = 0; i < M; ++i) {
			int P = Integer.parseInt(sc.next()) - 1;
			int Q = Integer.parseInt(sc.next()) - 1;
			int C = Integer.parseInt(sc.next());
			ss[P].add(C, Q);
			ss[Q].add(C, P);
		}
		System.out.println(solve());
	}

	static int solve() {
		boolean[] visited = new boolean[N];
		visited[0] = true;
		ArrayList<Integer> cur = new ArrayList<>();
		cur.add(0);
		for (int i = 0; !cur.isEmpty(); ++i) {
			ArrayList<Integer> next = new ArrayList<>();
			for (int pos : cur) {
				HashMap<Integer, ArrayList<Integer>> map = ss[pos].next;
				for (int c : map.keySet()) {
					ArrayList<Integer> ns = map.get(c);
					ArrayList<Integer> cand = new ArrayList<>();
					for (int j = 0; j < ns.size(); ++j) {
						if (!visited[ns.get(j)]) {
							cand.add(ns.get(j));
							visited[ns.get(j)] = true;
						}
					}
					for (int j = 0; j < cand.size(); ++j) {
						if (cand.get(j) == N - 1) return i + 1;
						ArrayList<Integer> nlist = ss[cand.get(j)].next.get(c);
						for (int n : nlist) {
							if (!visited[n]) {
								cand.add(n);
								visited[n] = true;
							}
						}
					}
					next.addAll(cand);
					for (int j = 0; j < cand.size(); ++j) {
						ss[cand.get(j)].next.remove(c);
					}
				}
				ss[pos].next.clear();
			}
			cur = next;
		}
		return -1;
	}

	static class Station {
		HashMap<Integer, ArrayList<Integer>> next = new HashMap<>();

		void add(int c, int id) {
			if (next.containsKey(c)) {
				next.get(c).add(id);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(id);
				next.put(c, list);
			}
		}
	}
}
