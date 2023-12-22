import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] e = new int[m][3];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int d = sc.nextInt();
            e[i][0] = l; e[i][1] = r; e[i][2] = d;
        }
        int[][][] g = buildWeightedGraph(n, e);
        int[] p = new int[n];
        boolean[] used = new boolean[n];
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if(used[i]) continue;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(i);
            used[i] = true;
            while(!q.isEmpty()){
                int v = q.poll();
                used[v] = true;
                for(int[] na : g[v]){
                    int nv = na[0], nd = na[1];
                    if(used[nv]){
                        if(p[nv] != p[v] + nd){
                            ans = false;
                            break;
                        }
                    }else{
                        p[nv] = p[v] + nd;
                        q.add(nv);
                    }
                }
                if(!ans)break;
            }
            if(!ans)break;
        }
        System.out.println(ans ? "Yes" : "No");
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
            graph[b][deg[b]][1] -= c;
        }

        return graph;
    }

}
