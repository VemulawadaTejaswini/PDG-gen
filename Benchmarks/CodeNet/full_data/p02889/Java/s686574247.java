import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] e = new int[m][3];
        for (int i = 0; i < m; i++) {
            e[i][0] = sc.nextInt()-1;
            e[i][1] = sc.nextInt()-1;
            e[i][2] = sc.nextInt();
        }
        int[][][] g = buildWeightedGraph(n, e);
        int[][][] d = new int[n][n][2]; // cnt, rest
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j][0] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            d[i][i][0] = 0;
            d[i][i][1] = l;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(i);
            while(!q.isEmpty()){
                int v = q.poll();
                for(int[] nv : g[v]){
                    if(l < nv[1]) continue;
                    int nc = 0, nr = 0;
                    if(nv[1] <= d[i][v][1]){
                        nc = d[i][v][0];
                        nr = d[i][v][1] - nv[1];
                    }else{
                        nc = d[i][v][0] + 1;
                        nr = l - nv[1];
                    }
                    if(nc < d[i][nv[0]][0]
                            || (nc == d[i][nv[0]][0] && d[i][nv[0]][1] < nr)){
                        d[i][nv[0]][0] = nc;
                        d[i][nv[0]][1] = nr;
                        q.add(nv[0]);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int s = sc.nextInt()-1;
            int t = sc.nextInt()-1;
            sb.append(d[s][t][0] == Integer.MAX_VALUE ? -1 : d[s][t][0]).append("\n");
        }
        System.out.print(sb.toString());
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

}
