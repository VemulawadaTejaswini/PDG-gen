import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		SCC scc = new SCC();
		ArrayList<ArrayList<Integer>> parents = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			parents.add(new ArrayList<>());
		}
		for (int i = 0; i < N - 1 + M; i++) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			scc.addEdge(A, B);
			parents.get(B).add(A);
		}
		scc.calc();
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < N; i++) {
			int parent = -1;
			int min = Integer.MAX_VALUE;
			for (int p : parents.get(i)) {
				if (scc.idx[p] < min) {
					min = scc.idx[p];
					parent = p;
				}
			}
			writer.println(parent + 1);
		}
		writer.flush();
	}

	static class SCC {

		int N;
		ArrayList<ArrayList<Integer>> child = new ArrayList<>();
		ArrayList<ArrayList<Integer>> parent = new ArrayList<>();
		int[] idx;

		void addEdge(int from, int to) {
			while (child.size() <= from) {
				child.add(new ArrayList<>());
			}
			while (parent.size() <= to) {
				parent.add(new ArrayList<>());
			}
			child.get(from).add(to);
			parent.get(to).add(from);
		}

		void calc() {
			while (child.size() < parent.size()) {
				child.add(new ArrayList<>());
			}
			while (parent.size() < child.size()) {
				parent.add(new ArrayList<>());
			}
			N = child.size();
			dfs();
		}

		void dfs() {
			idx = new int[N];
			boolean[] used = new boolean[N];
			int pos = 0;
			for (int i = 0; i < N; ++i) {
				if (used[i]) continue;
				used[i] = true;
				ArrayDeque<Integer> q = new ArrayDeque<>();
				q.addAll(child.get(i));
				q.add(-i - 1);
				while (!q.isEmpty()) {
					int cur = q.pollFirst();
					if (cur < 0) {
						idx[-cur - 1] = pos++;
						continue;
					}
					if (used[cur]) continue;
					used[cur] = true;
					q.addFirst(-cur - 1);
					for (int c : child.get(cur)) {
						q.addFirst(c);
					}
				}
			}
		}
	}
}
