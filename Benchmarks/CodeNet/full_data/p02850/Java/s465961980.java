import java.util.*;

public class Main {

    static int[][] g;
    static int[][] e;
    static boolean[] used;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        used = new boolean[n];
        g = buildGraph(sc, n, n-1);
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        used[0] = true;
        dfs(0, 0, map);
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            int c = map.get(e[i][0]).get(e[i][1]);
            sb.append(c).append("\n");
            if(max < c) max = c;
        }
        System.out.println(max);
        System.out.print(sb.toString());
        sc.close();

    }

    private static void dfs(int v, int pre, Map<Integer, Map<Integer, Integer>> map) {
        int c = 1;
        for(int nv : g[v]){
            if(used[nv]) continue;
            if(c == pre) c++;
            int min = Math.min(v, nv);
            int max = Math.max(v, nv);
            if(!map.containsKey(min)) map.put(min, new HashMap<>());
            map.get(min).put(max, c);
            used[nv] = true;
            dfs(nv, c++, map);
        }
    }

    public static int[][] buildGraph(Scanner sc, int n, int m) {
        int[][] graph = new int[n][];
        e = new int[m][2];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            e[i][0] = a;
            e[i][1] = b;
            deg[a]++;
            deg[b]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0; i < m; i++) {
            int a = e[i][0];
            int b = e[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }

        return graph;
    }

}
