import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static long iniPos = (long) Math.pow(10, 15);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt() -1;
        int t = sc.nextInt() -1;
        int[][] yenEdges = new int[m][3];//{from, to, cost}
        int[][] snuukEdges = new int[m][3];
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt() -1;
            int to = sc.nextInt() -1;
            int a = sc.nextInt(); // yen
            int b = sc.nextInt(); // snuuk
            yenEdges[i] = new int[]{from, to, a};
            snuukEdges[i] = new int[]{from, to, b};
        }
        int[][][] yenGraph = buildWeightedGraph(n, yenEdges);
        int[][][] snuukGraph = buildWeightedGraph(n, snuukEdges);
        long[] yenDis = dijkstra(n, yenGraph, s);
        long[] snuukDis = dijkstra(n, snuukGraph, t);
        // 各頂点で両替した時の最小コストを降順に保持する {cost, vertex}
        PriorityQueue<long[]> q =
                new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        for (int i = 0; i < n; i++) {
            long cost = yenDis[i] + snuukDis[i];
            q.add(new long[]{cost, i});
        }
        StringBuilder sb = new StringBuilder();
        long[] a = q.peek();
        for (int i = 0; i < n; i++) {
            while(a[1] + 1 <= i){
                q.poll();
                a = q.peek();
            }
            sb.append(iniPos - a[0]).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();


    }

    public static int[][][] buildWeightedGraph(int n, int[][] edges){
        int m = edges.length;
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            deg[ edges[i][0] ]++;
            deg[ edges[i][1] ]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            graph[a][--deg[a]][0] = b;
            graph[a][deg[a]][1] = c;
            graph[b][--deg[b]][0] = a;
            graph[b][deg[b]][1] = c;
        }

        return graph;
    }

    public static long[] dijkstra(int n, int[][][] graph, int s) {
        // {sからの最短距離, 頂点}
        PriorityQueue<long[]> pq =
                new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        long[] d = new long[n]; // sからの最短距離
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        pq.add(new long[]{0, s});
        while(!pq.isEmpty()){
            long[] a = pq.poll();
            int v = (int)a[1];
            if(d[v] < a[0]) continue;
            for (int[] g: graph[v]) {
                int to = g[0];
                int cost = g[1];
                if(d[to] > d[v] + cost){
                    d[to] = d[v] + cost;
                    pq.add(new long[]{d[to], to});
                }
            }
        }

        return d;
    }

}
