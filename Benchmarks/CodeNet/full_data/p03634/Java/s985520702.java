import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class Node {
		int n;
		long d;
		public Node(int n, long d) {
			this.n = n;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] g = new long[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) g[i][j] = -1;
			}
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			g[a][b] = g[b][a] = c;
		}
		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		// k => i のノードの距離
		long[] dist = new long[n];
		boolean[] used = new boolean[n];
		used[k] = true;
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(k, 0));
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			for(int i = 0; i < n; i++) {
				if(!used[i] && g[node.n][i] >= 0) {
					queue.add(new Node(i, node.d + g[node.n][i]));
					dist[i] = node.d + g[node.n][i];
					used[i] = true;
				}
			}
		}
		for(int i = 0; i < q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			System.out.println(dist[x] + dist[y]);
		}
	}
}
