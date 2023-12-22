import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
	static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
	static long nodes[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		nodes = new long[n];
		for (int i = 0; i < n; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edges.get(a).add(b);
			edges.get(b).add(a);
		}

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int index = Integer.parseInt(str[0]) - 1;
			int add = Integer.parseInt(str[1]);

			nodes[index] += add;
		}
		dfs(n, 0);
		System.out.print(nodes[0]);
		for (int i = 1; i < nodes.length; i++) {
			System.out.print(" " + nodes[i]);
		}
		System.out.print("\n");
	}

	static void dfs(int n, int s) {
		boolean[] used = new boolean[n];
		Deque<Integer> q = new ArrayDeque<>();
		q.add(0);
		used[0] = true;
		while (q.size() != 0) {
			int now = q.poll();
			for (int next : edges.get(now)) {
				if (!used[next]) {
					nodes[next] += nodes[now];
					q.add(next);
					used[next] = true;
				}
			}
		}
	}
}
