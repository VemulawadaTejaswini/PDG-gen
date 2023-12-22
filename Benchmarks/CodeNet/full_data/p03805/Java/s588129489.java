import java.util.Scanner;

public class Main {

	static int n, m;
	static boolean[] vis;
	static boolean[][] graph;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		vis = new boolean[n];
		graph = new boolean[n][n];
		for(int i = 0 ; i < m ; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			graph[a][b] = graph[b][a] = true;
		}
		for(int i = 0 ; i < n ; i++) {
			vis[i] = false;
		}
		vis[0] = true;
		System.out.println(dfs(0));
	}

	public static int dfs(int v) {
		boolean all_vis = true;
		for(int i = 0 ; i < n ; i++) {
			if(vis[i] == false) {
				all_vis = false;
			}
		}
		if(all_vis == true) return 1;
		int ret = 0;
		for(int i = 0 ; i < n ; i++) {
			if(vis[i] == true) continue;
			if(graph[v][i] == false) continue;
			vis[i] = true;
			ret += dfs(i);
			vis[i] = false;
		}
		return ret;
	}

}
