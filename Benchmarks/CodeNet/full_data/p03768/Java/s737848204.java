import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		V[] vs = new V[N];
		for (int i = 0; i < N; i++) {
			vs[i] = new V(i);
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			vs[s].add(t);
			vs[t].add(s);
		}
		int Q = sc.nextInt();
		int v[] = new int[Q];
		int d[] = new int[Q];
		int c[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			v[i] = sc.nextInt() - 1;
			d[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		dist = new int[N];
		Arrays.fill(dist, -1);
		for (int i = Q - 1; i >= 0; i--) {
			color(vs, v[i], d[i], c[i]);
		}
		Arrays.stream(vs).forEach(u -> System.out.println(u.col));
	}
	static int dist[];
	private static void color(V[] vs, int s, int d, int c) {
		if (dist[s] >= d) {
			return;
		}
		Queue<Integer> que = new LinkedList<>();
		que.add(s);
		dist[s] = d;
		while(que.isEmpty() == false) {
			int u = que.poll();
			if (vs[u].col == 0) { 
				vs[u].col = c;
			}
			if (dist[u] == 0) {
				continue;
			}
			for (int v: vs[u]) {
				if (dist[v] >= dist[u] - 1) {
					continue;
				}
				que.add(v);
				dist[v] = dist[u] - 1;
			}
		}
	}
	static class V extends ArrayList<Integer>{
		int id;
		int col = 0;
		V(int _id) {
			id = _id;
		}
	}
}
