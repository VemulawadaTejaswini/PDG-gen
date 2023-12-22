import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			String str[] = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}

		int fennec = 0;
		int snuke = 0;

		int distF[] = bfs(edge, 0);
		int distS[] = bfs(edge, n - 1);

		for (int i = 0; i < n; i++) {
			if (distF[i] < distS[i]) {
				fennec++;
			} else if (distF[i] == distS[i]) {
				fennec++;
			} else {
				snuke++;
			}
			//System.out.println(i + " " + distF[i] + " " + distS[i]);
		}
		if (fennec > snuke) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}

	static int[] bfs(ArrayList<ArrayList<Integer>> edge, int s) {
		boolean used[] = new boolean[n];
		int[] dist = new int[n];
		Queue<Integer> queue = new ArrayDeque<>();

		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[s] = 0;
		used[s] = true;
		queue.add(s);

		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (int i = 0; i < edge.get(now).size(); i++) {
				int next = edge.get(now).get(i);
				if (!used[next]) {
					used[next] = true;
					dist[next] = dist[now] + 1;
					queue.add(next);
				}
			}
		}
		return dist;
	}
}