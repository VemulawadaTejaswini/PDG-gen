import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] a, b;
	static boolean[] vis;
	static boolean[][] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n];
		b = new int[n];
		vis = new boolean[n];
		g = new boolean[n][n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			g[a[i]][b[i]] = g[b[i]][a[i]] = true;
		}
		int ans = 0;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) vis[j] = false;
			g[a[i]][b[i]] = g[b[i]][a[i]] = false;
			dfs(0);
			boolean bridge = false;
			for(int j = 0 ; j < n ; j++) {
				if(!vis[j]) bridge = true;
			}
			if(bridge) ans++;
			g[a[i]][b[i]] = g[b[i]][a[i]] = true;
		}
		System.out.println(ans);
	}

	static void dfs(int x) {
		vis[x] = true;
		for(int i = 0 ; i < n ; i++) {
			if(!vis[i] && g[x][i]) dfs(i);
		}
		return;
	}

}