/*
 *created by Kraken on 27-04-2020 at 21:31
 */
import java.util.*;
import java.io.*;

public class Main {

  private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  private static int[] dp;
  private static boolean[] vis;

  private static void bfs(int vertex) {
    vis[vertex] = true;
    dp[vertex] = 0;
    Queue<Integer> q = new LinkedList<>();
    q.add(vertex);
    while (!q.isEmpty()) {
      int curr = q.poll();
      for (int i : graph.get(curr)) {
        dp[i] = Math.max(dp[i], dp[curr] + 1);
        if (!vis[i]) q.add(i);
      }
    }
  }

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt(), m = sc.nextInt();
    vis = new boolean[n + 1];
    for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
    int[] indegree = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      graph.get(x).add(y);
      indegree[y]++;
    }
    dp = new int[n + 1];
    Arrays.fill(dp, -1);
    ArrayList<Integer> src = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (indegree[i] == 0) bfs(i);
    }
    int res = 0;
    for (int i = 1; i <= n; i++) res = Math.max(res, dp[i]);
    System.out.println(res);
  }

  static class FastReader {

    BufferedReader br;

    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
