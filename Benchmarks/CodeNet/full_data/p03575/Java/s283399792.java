import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] a, b;
	static boolean[] vis;
	static boolean[][] connected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m]; b = new int[m]; connected = new boolean[n][n]; vis = new boolean[n];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			a[i]--; b[i]--;
			connected[a[i]][b[i]] = connected[b[i]][a[i]] = true;
		}
		int ans = 0;
		for(int i = 0 ; i < m ; i++) {
			connected[a[i]][b[i]] = connected[b[i]][a[i]] = false;
			for(int j = 0 ; j < n ; j++) vis[j] = false;
			dfs(0);
			boolean bridge = false;
			for(int j = 0 ; j < n ; j++) {
				if(vis[j] == false) bridge = true;
			}
			if(bridge) ans++;
			connected[a[i]][b[i]] = connected[b[i]][a[i]] = true;
		}
		System.out.println(ans);
	}

	public static void dfs(int x) {
		vis[x] = true;
		for(int i = 0 ; i < n ; i++) {
			if(connected[x][i] == false) continue;
			if(vis[i] == true) continue;
			dfs(i);
		}
	}
}
