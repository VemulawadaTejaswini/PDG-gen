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
			vs[s].add(vs[t]);
			vs[t].add(vs[s]);
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
		for (int i = 0; i < Q; i++) {
			color(vs, v[i], d[i], c[i]);
		}
		Arrays.stream(vs).forEach(u -> System.out.println(u.col));
	}
	static int[] dist;
	static void color(V[] vs, int s, int d, int c) {
		Arrays.fill(dist, -1);
		Queue<Integer> que = new LinkedList<>();
		que.add(s);
		dist[s] = 0;
		while (que.isEmpty() == false) {
			int u = que.poll();
			vs[u].col = c;
			for (V v: vs[u]) {
				if (dist[v.id] == -1) {
					if (dist[u] < d) {
						que.add(v.id);
					}
					dist[v.id] = dist[u] + 1;
				}
			}
		}
	}
	static class V extends ArrayList<V>{
		int id;
		int col = 0;
		V(int _id) {id = _id; }
	}
}
