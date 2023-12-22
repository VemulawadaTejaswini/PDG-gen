import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

  ArrayList<LinkedList<Edge>> tree;
  boolean[] visited ;
  int[] colors;

  public static void main(String[] args) {

    new Main().run();
  }
  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(System.out)) {

      int n = Integer.parseInt(in.readLine());
      tree = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
        tree.add(new LinkedList<Edge>());
      }
      String[] lines;
      for (int i = 0; i < n-1; i++) {
        lines = in.readLine().split(" ");
        int v = Integer.parseInt(lines[0]) - 1;
        int u = Integer.parseInt(lines[1]) - 1;
        int d = Integer.parseInt(lines[2]);
        tree.get(v).add(new Edge(u, d));
        tree.get(u).add(new Edge(v, d));
      }

      visited = new boolean[n];
      colors  = new int[n];
      Arrays.fill(colors, -1);

      bfs(0, 0);

      for (int c : colors) {
        out.println(c);
      }
      out.flush();
    }
    catch(IOException e) {

      System.err.println(e);
    }
  }

  void bfs(int fv, int fd) {
    Deque<Edge> stuck = new ArrayDeque<>();

    stuck.push(new Edge(fv, fd));

    while(!stuck.isEmpty()) {
      Edge v = stuck.pop();

      if(!visited[v.v]) {
        visited[v.v] = true;
        int d = colors[v.v] = v.d % 2 == 0 ? 0 : 1;
        for (Edge u : tree.get(v.v)) {
          stuck.push(new Edge(u.v, d + u.d));
        }
      }
    }
  }

  private class Edge {
    int v, d = -1;

    public Edge(int v, int d) {
      this.v = v;
      this.d = d;
    }
  }
}