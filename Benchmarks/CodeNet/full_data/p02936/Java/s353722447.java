import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		List<List<Integer>> g = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			g.get(a).add(b);
			g.get(b).add(a);
		}

		long[] counter = new long[N + 1];

		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			counter[p] += x;
		}

		sc.close();

		boolean[] visited = new boolean[N + 1];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		visited[1] = true;

		while (!q.isEmpty()) {
			int n = q.poll();

			for (int m : g.get(n)) {
				if (!visited[m]) {
					counter[m] += counter[n];
					q.add(m);
					visited[m] = true;
				}
			}
		}

		StringBuffer ans = new StringBuffer();
		for (int i = 1; i <= N; i++) {
			ans.append(counter[i]);
			ans.append(" ");
		}

		out.println(ans.substring(0, ans.length() - 1));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
