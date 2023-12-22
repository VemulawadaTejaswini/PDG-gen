import java.util.Scanner;

public class Main {

	static int[][] graph;
	static boolean[] vis;
	static int n, m;
	static int[] l, r, d, x;
	static boolean ok = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		l = new int[m];
		r = new int[m];
		d = new int[m];
		for(int i = 0 ; i < m ; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
			d[i] = sc.nextInt();
		}
		graph = new int[n][n];
		x = new int[n];
		vis = new boolean[n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == j) continue;
				graph[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i = 0 ; i < n ; i++) x[i] = Integer.MAX_VALUE;
		for(int i = 0 ; i < m ; i++) {
			graph[l[i]][r[i]] = d[i];
			graph[r[i]][l[i]] = -d[i];
		}
		for(int i = 0 ; i < n ; i++) {
			if(x[i] == Integer.MAX_VALUE) {
				x[i] = 0;
				dfs(i);
			}
		}
		if(ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static void dfs(int y) {
		boolean all_ok = true;
		for(int i = 0 ; i < n ; i++) {
			if(!vis[i]) all_ok = false;
		}
		if(all_ok) return;
		for(int i = 0 ; i < n ; i++) {
			if(graph[y][i] != Integer.MAX_VALUE && !vis[i] && x[i] == Integer.MAX_VALUE) {
				x[i] = x[y] + graph[y][i];
				vis[i] = true;
				dfs(i);
				vis[i] = false;
			} else if(graph[y][i] != Integer.MAX_VALUE && !vis[i] && x[i] != x[y] + graph[y][i]) {
				ok = false;
			}
		}
	}

}
