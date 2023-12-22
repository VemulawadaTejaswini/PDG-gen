

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer>[] g;
    static boolean[] vis;
    static int V, N, ans;

    static void dfs(int u) {
	vis[u] = true;
	N++;
	for (int v : g[u])
	    if (!vis[v])
		dfs(v);
	if (N == V)
	    ans++;
	vis[u] = false;
	N--;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	V = sc.nextInt();
	int m = sc.nextInt();
	g = new ArrayList[V];
	for (int i = 0; i < V; i++)
	    g[i] = new ArrayList<>();
	for (int i = 0; i < m; i++) {
	    int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
	    g[u].add(v);
	    g[v].add(u);
	}
	vis = new boolean[V];
	dfs(0);
	System.out.println(ans);
    }

}
