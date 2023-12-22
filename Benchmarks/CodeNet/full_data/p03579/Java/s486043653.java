import java.util.Scanner;

public class Main {

    static int[][] graph;
    static int[] color;
    static long wCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[M][2];
        for (int i = 0; i < M; i++) {
            edges[i][0] = sc.nextInt() -1;
            edges[i][1] = sc.nextInt() -1;
        }
        graph = buildGraph(N, edges);
        long ans = 0;
        color = new int[N];
        if (dfs(0, 0, 1)) {
            ans = wCnt * (N - wCnt) - M;
        } else{
           ans = ((long) N * (N - 1)) / 2 - M;
        }
        System.out.println(ans);
        sc.close();

    }

    private static boolean dfs(int pre, int cur, int c) {
        color[cur] = c;
        if(c == 1) wCnt++;
        boolean ret = true;
        for(int i = 0; i < graph[cur].length; i++){
            int x = graph[cur][i];
            if(color[x] != 0 && color[x] != -c){
                ret = false;
                break;
            }
            if(x == pre) continue;
            ret &= dfs(cur, x, -c);
        }

        return ret;
    }

    public static int[][] buildGraph(int n, int[][] edges){
        int m = edges.length;
        int[][] graph = new int[n][];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            deg[ edges[i][0] ]++;
            deg[ edges[i][1] ]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }

        return graph;
    }

}
