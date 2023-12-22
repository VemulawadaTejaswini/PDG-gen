import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Main {
	static int n;
	static int m;

	static long ans = 0;

	static boolean used[];
	static int color[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		used = new boolean[n];
		color = new int[n];

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}

		if (isBipartiteGraph(edge, 0, 1)) {
			for (int i = 0; i < n; i++) {
				if (color[i] == 1) {
					ans++;
				}
			}
			System.out.println(ans * (n - ans) - m);
		} else {
			System.out.println(((long) n * (n - 1) / 2) - m);
		}
	}

	static boolean isBipartiteGraph(ArrayList<ArrayList<Integer>> edge, int now, int c) {
		color[now] = c;
		for (int next : edge.get(now)) {
			if (color[next] == c) {
				return false;
			}
			if (color[next] == 0 && !isBipartiteGraph(edge, next, -c)) {
				return false;
			}
		}
		return true;
	}
}