import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
  static int[] dist, color, visited;
  static int visitedCount = 0;

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();
    dist = new int[N];
    color = new int[N];
    visited = new int[N];
    for (int i = 0; i < N; i++) {
      g.add(new ArrayList<Integer>());
      dist[i] = -1;
    }
    for (int i = 0; i < M; i++) {
      int A = Integer.parseInt(sc.next()) - 1;
      int B = Integer.parseInt(sc.next()) - 1;
      g.get(A).add(B);
      g.get(B).add(A);
    }
    int Q = sc.nextInt();
    int[] V = new int[Q];
    int[] D = new int[Q];
    int[] C = new int[Q];
    for (int i = 0; i < Q; i++) {
      V[i] = Integer.parseInt(sc.next()) - 1;
      D[i] = Integer.parseInt(sc.next());
      C[i] = Integer.parseInt(sc.next());
    }
    for (int i = Q - 1; i >= 0; i--) {
      update(V[i], C[i], D[i]);
    }
    PrintWriter writer = new PrintWriter(System.out);
    for (int i = 0; i < N; i++) {
      writer.println(color[i]);
    }
    writer.flush();
  }

  static void update(int v, int c, int d) {
    visitedCount++;
    ArrayList<Integer> cur = new ArrayList<>();
    cur.add(v);
    while (d >= 0) {
      ArrayList<Integer> next = new ArrayList<>();
      for (int i = 0; i < cur.size(); i++) {
        int p = cur.get(i);
        if (dist[p] >= d) continue;
        dist[p] = d;
        if (color[p] == 0) color[p] = c;
        for (int n : g.get(p)) {
          if (visited[n] == visitedCount) continue;
          visited[n] = visitedCount;
          next.add(n);
        }
      }
      --d;
      cur = next;
    }
  }

}
