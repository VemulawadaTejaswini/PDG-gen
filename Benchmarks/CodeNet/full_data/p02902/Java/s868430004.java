import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		g = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			g[u].add(v);
		}
		prev = new int[n][n];
		dist = new int[n][n];
		int ucycle = -1; int dmin = n+1;
		for(int i = 0; i < n; i++) {
			Arrays.fill(prev[i], -1);
			Arrays.fill(dist[i], -1);
			int d = bfs(i);
			if(d > 0 && d < dmin) {
				ucycle = i;
				dmin = d;
			}
		}
		if(ucycle == -1) {
			System.out.println(-1);
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append(dmin+"\n");
			ArrayList<Integer> vs = new ArrayList<Integer>();
			int i = prev[ucycle][ucycle];
			while(i != ucycle) {
				vs.add(i);
				i = prev[ucycle][i];
			}
			vs.add(ucycle);
			Collections.reverse(vs);
			for(int v: vs) {
				sb.append((v+1)+"\n");
			}
			System.out.print(sb.toString());
		}
	}
	static ArrayList<Integer>[] g;
	static int[][] prev;
	static int[][] dist;
	static int bfs(int i) {
		LinkedList<Integer> q = new LinkedList<>();
		q.add(i);
		dist[i][i] = 0;
		while(!q.isEmpty()) {
			int u = q.poll();
			for(int v: g[u]) {
				if(v == i) {
					prev[i][i] = u;
					return dist[i][u]+1;
				}
				else if(dist[i][v] < 0) {
					dist[i][v] = dist[i][u]+1;
					prev[i][v] = u;
					q.add(v);
				}
			}
		}
		return -1;
	}
}
