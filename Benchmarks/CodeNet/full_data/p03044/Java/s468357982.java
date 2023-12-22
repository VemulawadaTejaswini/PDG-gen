import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

  Node[] tree;
  boolean[] visited ;
  int[] colors;

  public static void main(String[] args) {

    new Main().run();
  }
  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(System.out)) {

      int n = Integer.parseInt(in.readLine());
      tree = new Node[n];
      for (int i = 0; i < n; i++) {
        tree[i] = new Node(i);
      }
      String[] lines;
      for (int i = 0; i < n-1; i++) {
        lines = in.readLine().split(" ");
        int v = Integer.parseInt(lines[0]) - 1;
        int u = Integer.parseInt(lines[1]) - 1;
        int d = Integer.parseInt(lines[2]);
        tree[v].edge.add(new Edge(u, d));
        tree[u].edge.add(new Edge(v, d));
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
        for (Edge e : tree[v.v].edge) {
          stuck.push(new Edge(e.u, d + e.d));
        }
      }
    }
  }

  private class Node {
    int v;
    List<Edge> edge;

    public Node(int v) {
      this.v = v;
      edge = new LinkedList<>();
    }
  }

  private class Edge {
    int u, d = -1;

    public Edge(int u, int d) {
      this.u = u;
      this.d = d;
    }
  }
}