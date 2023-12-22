import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] x = new int[M];
		int[] y = new int[M];
		for (int i = 0; i < M; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		// 隣接リスト
		List<List<Integer>> g = new ArrayList<>();
		List<List<Integer>> rev = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			g.add(new ArrayList<>());
			rev.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			g.get(x[i]).add(y[i]);
			rev.get(y[i]).add(x[i]);
		}

		sc.close();

		// トポロジカルソートする

		// 入次元
		int[] indegree = new int[N + 1];
		for (int i = 0; i < M; i++) {
			indegree[y[i]]++;
		}

		Deque<Integer> que = new ArrayDeque<>();

		for (int i = 0; i <= N; i++) {
			if (indegree[i] == 0) {
				que.add(i);
			}
		}

		List<Integer> sorted = new ArrayList<>();
		while (!que.isEmpty()) {
			int a = que.poll();
			sorted.add(a);

			for (int n : g.get(a)) {
				indegree[n]--;
				if (indegree[n] == 0) {
					que.add(n);
				}
			}
		}

		int[] d = new int[N + 1];

		for (int i : sorted) {
			for (int j : rev.get(i)) {
				d[i] = Math.max(d[j] + 1, d[i]);
			}
		}

		int ans = 0;
		for (int i = 0; i <= N; i++) {
			ans = Math.max(ans, d[i]);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
