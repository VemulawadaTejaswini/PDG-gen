import java.util.*;

public class Main {

	private static int[] a;
	private static boolean[] visited;
	private static List<Integer>[] g;
	//private static Map<Integer, Map<Integer, Integer>> ws;
	private static int[][] ws;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		g = new ArrayList[n];
		//ws = new HashMap<>();
		ws = new int[n][n];

		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<>();
			//ws.put(i, new HashMap<>());
			Arrays.fill(ws[i], 0);
		}

		//for (int i = 0; i < ws.length; i++) {
		//	Arrays.fill(ws[i], Integer.MAX_VALUE);
		//}

		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = sc.nextInt() % 2;
			g[u].add(v);
			g[v].add(u);
			ws[u][v] = w;
			ws[v][u] = w;
			//ws[u][v] = w;
			//ws[v][u] = w;
		}

		a = new int[n];
		visited = new boolean[n];

		dfs(0, 0);
		for (int i : a) System.out.println(i);

		//int[] a = new int[n];
		//boolean[] visited = new boolean[n];
		//Queue<Integer> q = new LinkedList<>();
		//Queue<Integer> r = new LinkedList<>();
		//q.offer(0);
		//
		//while (!q.isEmpty()) {
		//	while (!q.isEmpty()) {
		//		int p = q.poll();
		//		if (visited[p]) continue;
		//		visited[p] = true;
		//		a[p] = 0;
		//
		//		for (Integer x : g[p]) {
		//			if (!visited[x]) {
		//				if (ws[p][x] == 0) {
		//					q.offer(x);
		//				} else {
		//					r.offer(x);
		//				}
		//			}
		//		}
		//	}
		//
		//	while (!r.isEmpty()) {
		//		int p = r.poll();
		//		if (visited[p]) continue;
		//		visited[p] = true;
		//		a[p] = 1;
		//
		//		for (Integer x : g[p]) {
		//			if (!visited[x]) {
		//				if (ws[p][x] == 0) {
		//					r.offer(x);
		//				} else {
		//					q.offer(x);
		//				}
		//			}
		//		}
		//	}
		//}

		//for (int i : a) {
		//	System.out.println(i);
		//}
	}

	private static void dfs(int v, int c) {
		if (visited[v]) return;
		visited[v] = true;
		a[v] = c;
		for (int i = 0; i < g[v].size(); i++) {
			int x = g[v].get(i);
			if (visited[x]) continue;
			if (ws[v][x] == 0) dfs(x, c);
			else dfs(x, c == 0 ? 1 : 0);
		}
	}
}
