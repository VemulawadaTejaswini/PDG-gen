import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] g = new int[n][][];
        int[][] g2 = new int[n][];
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if(s[j] == '1') list.add(j);
            }
            g[i] = new int[list.size()][2];
            g2[i] = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                g[i][j][0] = list.get(j); g[i][j][1] = 1;
                g2[i][j] = list.get(j);
            }
        }
        boolean able = true;
        for (int i = 0; i < n; i++) {
            for(int b : g2[i]){
                for (int j = 0; j < g2[i].length; j++) {
                    if(0 < Arrays.binarySearch(g2[b], g2[i][j])){
                        able = false; break;
                    }
                }
            }
        }
        if(able){
            long[] d = dijkstra(n, g, 0);
            int idx = 0;
            long max = 0;
            for (int i = 1; i < n; i++) {
                if(max < d[i]){
                    idx = i; max = d[i];
                }
            }
            long[] d2 = dijkstra(n, g, idx);
            List<Integer> idxlist = new ArrayList<>();
            max = 0;
            for (int i = 0; i < n; i++) {
                if(max == d2[i]){
                    idxlist.add(i);
                }else if(max < d2[i]){
                    idxlist.clear(); idxlist.add(i); max = d2[i];
                }
            }
            if(1 < idxlist.size()) System.out.println(-1);
            else System.out.println(d2[idxlist.get(0)]+1);
        }else System.out.println(-1);
        sc.close();

    }

    public static long[] dijkstra(int n, int[][][] graph, int s) {
        // {sからの最短距離, 頂点}
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        long[] d = new long[n]; // sからの最短距離
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        pq.add(new long[] { 0, s });
        while (!pq.isEmpty()) {
            long[] a = pq.poll();
            int v = (int) a[1];
            if (d[v] < a[0])
                continue;
            for (int[] g : graph[v]) {
                int to = g[0];
                int cost = g[1];
                if (d[to] > d[v] + cost) {
                    d[to] = d[v] + cost;
                    pq.add(new long[] { d[to], to });
                }
            }
        }

        return d;
    }
}
