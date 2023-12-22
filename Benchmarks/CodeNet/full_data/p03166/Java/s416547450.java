

import java.io.*;
import java.util.*;

public class Main {
    private static int n, m;
    private static ArrayList[] graph;
    private static int[] max;

    private static int dfs(int i) {
        if (max[i] != -1) {
            return max[i];
        }
        int dist = 0;
        for (Integer neigh : (ArrayList<Integer>) graph[i]) {
            dist = Math.max(dist, 1 + dfs(neigh));
        }
        return max[i] = dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        max = new int[n + 1];
        Arrays.fill(max, -1);
        graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i <= m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            graph[p].add(q);
        }

        for (int i = 1; i <= n; i++) {
            dfs(i);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, max[i]);
        }
        System.out.println(ans);
    }
}