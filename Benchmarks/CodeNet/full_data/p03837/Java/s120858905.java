import java.util.*;

public class Main {
    static int[] dijkstra(int[][][] graph, int node, int start) {
        int[] dist = new int[node];
        for (int i = 0; i < node; i++) {
            dist[i] = 1000000000;
        }

        dist[start] = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((array1, array2)->-array1[0]);
        int[] tmp = {0, start};
        q.add(tmp);

        while (!q.isEmpty()) {
            int[] v = q.poll();
            int cost = v[0];
            int cur_node = v[1];

            if (dist[cur_node] < cost) {
                continue;
            }

            for (int j = 0; j < graph[cur_node].length; j++) {
                int nex_cost = graph[cur_node][j][0];
                int nex_node = graph[cur_node][j][1];
                int dist_cand = dist[cur_node] + nex_cost;
                if (dist_cand < dist[nex_node]) {
                    dist[nex_node] = dist_cand;
                    tmp[0] = dist[nex_node];
                    tmp[1] = nex_node;
                    q.add(tmp);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][][] adj = new int[n][n][2];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            adj[a][i][0] = c;
            adj[a][i][1] = b;
            adj[b][i][0] = c;
            adj[b][i][1] = a;
        }
        int[][] shortest = new int[n][3];
        for (int i = 0; i < n; i++) {
            shortest[i] = dijkstra(adj, n, i);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cost = adj[i][j][0];
                int k = adj[i][j][1];
                if (cost > shortest[i][k]) {
                    ans++;
                }
            }
        }
        System.out.println(ans / 2);
    }
}