import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int initialS = Integer.parseInt(sc.next());
    List<Edge> edgeList = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      edgeList.add(
        new Edge(
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next()),
          Integer.parseInt(sc.next())
        )
      );
    }
    Map<Integer, Node> edgeMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      Node node = new Node(
        i + 1,
        Integer.parseInt(sc.next()),
        Integer.parseInt(sc.next())
      );
      edgeList.stream().forEach(node::addRoute);
      edgeMap.put(node.i, node);
    }
    int enoughS = n * 50;
    long dp[][] = new long[n + 1][enoughS + 1];
    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j <= enoughS; j++) {
        dp[i][j] = Long.MAX_VALUE;
      }
    }
    PriorityQueue<State> queue = new PriorityQueue<>(State.DEFAULT_COMPARATOR);
    Consumer<State> push = arg -> {
      if (arg.s < 0) {
        return;
      }
      if (dp[arg.v][arg.s] <= arg.x) {
        return;
      }
      dp[arg.v][arg.s] = arg.x;
      queue.offer(arg);
    };
    push.accept(new State(1, Math.min(initialS, enoughS), 0));
    while (!queue.isEmpty()) {
      State target = queue.poll();
      int tv = target.v;
      int ts = target.s;
      long tx = target.x;
      if (dp[tv][ts] != tx) {
        continue;
      }
      Node te = edgeMap.get(tv);
      int ns = Math.min(ts + te.c, enoughS);
      push.accept(new State(tv, ns, tx + te.d));
      for (Edge edge : te.edgeList) {
        push.accept(new State(edge.to, ts - edge.a, tx + edge.b));
      }
    }
    for (int i = 2; i <= n; i++) {
      long ans = Long.MAX_VALUE;
      for (int j = 0; j < enoughS; j++) {
        ans = Math.min(ans, dp[i][j]);
      }
      pw.println(ans);
    }
  }

  static class State {

    final static Comparator<State> DEFAULT_COMPARATOR = Comparator.comparingLong(s -> s.x);

    int v;
    int s;
    long x;

    State(int v, int s, long x) {
      this.v = v;
      this.s = s;
      this.x = x;
    }

    @Override
    public String toString() {
      return "State{" +
        "v=" + v +
        ", s=" + s +
        ", x=" + x +
        '}';
    }
  }

  static class Node {

    int i;
    int c;
    int d;
    List<Edge> edgeList;

    Node(int i, int c, int d) {
      this.i = i;
      this.c = c;
      this.d = d;
      edgeList = new ArrayList<>();
    }

    void addRoute(Edge edge) {
      edgeList.addAll(edge.findFromRoute(i));
    }
  }

  static class Edge {

    int from;
    int to;
    int a;
    int b;
    Edge reverse;

    Edge(int from, int to, int a, int b) {
      this.from = from;
      this.to = to;
      this.a = a;
      this.b = b;
    }

    Edge reverse() {
      if (reverse != null) {
        return reverse;
      }
      reverse = new Edge(to, from, a, b);
      return reverse;
    }

    List<Edge> findFromRoute(int index) {
      List<Edge> r = new ArrayList<>();
      if (this.from == index) {
        r.add(this);
      }
      if (this.reverse().from == index) {
        r.add(this.reverse);
      }
      return r;
    }
  }
}
