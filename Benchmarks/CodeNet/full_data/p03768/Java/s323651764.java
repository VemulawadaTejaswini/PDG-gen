import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    private void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[] adjList = new ArrayList[n];
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            adjList[a[i]].add(b[i]);
            adjList[b[i]].add(a[i]);
        }
 
        int q = sc.nextInt();
        int[] v = new int[q];
        int[] d = new int[q];
        int[] c = new int[q];
        for (int i = 0; i < q; i++) {
            v[i] = sc.nextInt() - 1;
            d[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
 
        boolean[][] visited = new boolean[n][11];
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = q - 1; i >= 0; i--) {
            dfs(adjList, visited, color, v[i], d[i], c[i]);
        }
        for (int clr : color) {
            System.out.println(clr == -1 ? 0 : clr);
        }
    }
 
    private void dfs(ArrayList<Integer>[] adjList, boolean[][] visited, int[] color, int v, int d, int c) {
        if (visited[v][d]) {
            return;
        }
        if (color[v] == -1 && d == 0) {
            color[v] = c;
        } else {
            dfs(adjList, visited, color, v, d - 1, c);
            for (int adj : adjList[v]) {
                dfs(adjList, visited, color, adj, d - 1, c);
            }
        }
        visited[v][d] = true;
    }
 
    public static void main(String[] args) {
        // new B_SplatterPainting().solve();
        new Main().solve();
    }
}