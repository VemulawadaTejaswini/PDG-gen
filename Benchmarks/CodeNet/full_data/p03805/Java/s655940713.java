import java.util.Scanner;

public class Main {

	static boolean[][] graph;
	static boolean[] vis;
	static int ans = 0;
	static int n, m;
	static int[] a, b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		graph = new boolean[n][n];
		vis = new boolean[n];
		for(int i = 0 ; i < m ; i++) {
			graph[a[i]][b[i]] = true;
			graph[b[i]][a[i]] = true;
		}
		dfs(0);
		System.out.println(ans);
	}

	static void dfs(int x) {
		if(x == n - 1) {
			ans++;
			return;
		}
		vis[x] = true;
		for(int i = 0 ; i < n ; i++) {
			if(graph[x][i] && vis[i] == false) dfs(i);
		}
		return;
	}

}
