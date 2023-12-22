import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	static boolean edges[][];
	static long nodes[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		edges = new boolean[n][n];
		nodes = new long[n];

		for (int i = 0; i < n - 1; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edges[a][b] = true;
		}

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int index = Integer.parseInt(str[0]) - 1;
			int add = Integer.parseInt(str[1]);

			nodes[index] += add;
		}
		dfs(n, 0);
		for (Long i : nodes) {
			System.out.println(i);
		}
	}

	static void dfs(int n, int s) {
		Deque<Integer> stack = new ArrayDeque<>();
		// boolean done[] = new boolean[n];

		stack.addFirst(s);

		while (!stack.isEmpty()) {
			int cur = stack.removeLast();
			long value = nodes[cur];
			// System.out.println(cur);

			for (int i = 0; i < edges[cur].length; i++) {
				if (edges[cur][i]) {
					nodes[i] += value;
					// done[i] = true;
					stack.addFirst(i);
				}
			}
		}
	}
}
