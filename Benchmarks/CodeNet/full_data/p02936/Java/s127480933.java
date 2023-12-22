import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static long[] score;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        graph = new ArrayList[n + 1];
        score = new long[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 0; i < q; i++) {
            score[sc.nextInt()] += sc.nextInt();
        }
        calc(1, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            if (i != 1) {
                sb.append(" ");
            }
            sb.append(score[i]);
        }
      System.out.println(sb);
    }
    
    static void calc(int idx, long add) {
        if (visited[idx]) {
            return;
        }
        visited[idx] = true;
        score[idx] += add;
        for (int x : graph[idx]) {
            calc(x, score[idx]);
        }
    }
    
}
