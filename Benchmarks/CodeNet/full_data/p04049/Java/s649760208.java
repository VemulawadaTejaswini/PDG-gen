import java.util.*;
public class Main
{
    static ArrayList<Integer> [] adj; static int root, bestDepth; static int [] depth;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            adj[a].add(b); adj[b].add(a);
        }
        root = 1; bestDepth = 0;
        dfs(1, 0, -1);
        depth = new int [n+1];
        dfs2(root, -1, 0); int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (depth[i] > k) ret++;
        }
        System.out.println(ret);
    }

    static void dfs(int cur, int dep, int par) {
        if (dep > root) {
            bestDepth = dep;
            root = cur;
        }
        for (Integer next: adj[cur]) {
            if (next != par) {
                dfs(next, dep + 1, cur);
            }
        }
    }

    static void dfs2(int cur, int par, int dep) {
        depth[cur] = dep;
        for (Integer next: adj[cur]) {
            if (next != par) {
                dfs2(next, cur, dep + 1);
            }
        }
    }


}