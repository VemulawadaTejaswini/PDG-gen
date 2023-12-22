import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] a, b;
	static boolean[] vis;
	static boolean[][] connect;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		vis = new boolean[n];
		connect = new boolean[n][n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			connect[a[i]][b[i]] = connect[b[i]][a[i]] = true;
		}
		vis[0] = true;
		int ans = dfs(0);
		System.out.println(ans);
	}

	public static int dfs(int x) {
		boolean all_vis = true;
		for(int i = 0 ; i < n ; i++) {
			if(!vis[i]) all_vis = false;
		}
		if(all_vis) return 1;
		int ret = 0;
		for(int i = 0 ; i < n ; i++) {
			if(vis[i]) continue;
			if(!connect[x][i]) continue;
			vis[i] = true;
			ret += dfs(i);
			vis[i] = false;
		}
		return ret;
	}

}
