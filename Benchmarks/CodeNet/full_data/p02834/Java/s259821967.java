/**
 * Created at 21:26 on 2019-12-22
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {

    ArrayList<Integer>[] to;
    int[] par;
    public Solver() {

      int N = sc.nextInt();

      int u = sc.nextInt() - 1;
      int v = sc.nextInt() - 1;

      par = new int[N];
      Arrays.fill(par, -1);
      to = new ArrayList[N];
      for (int i=0; i<N; i++) {
        to[i] = new ArrayList<Integer>();
      }

      for (int i=0; i<N-1; i++) {
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        to[a].add(b);
        to[b].add(a);
      }

      int[] depth = new int[N];

      ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
      Q.add(v);
      while (!Q.isEmpty()) {
        int f = Q.removeFirst();
        if (par[f] != -1) to[f].remove((Integer)par[f]);
        for (int t : to[f]) {
          depth[t] = depth[f] + 1;
          Q.add(t);
          par[t] = f;
        }
      }

      int[] rdepth = new int[N];
      Integer[] order = new Integer[N];
      for (int i=0; i<N; i++) {
        order[i] = i;
      }
      Arrays.sort(order, (i, j)->depth[j]-depth[i]);

      for (int i : order) {
        if (par[i] != -1) {
          rdepth[par[i]] = Math.max(rdepth[par[i]], rdepth[i] + 1);
        }
      }

      long ans = 0;
      int w = u;
      for (int i=0; i<=(depth[u]-1)/2; i++) {
        ans = Math.max(ans, rdepth[w]+(depth[u]-i-1)); //(i + depth[u]-2*i - 1)
        w = par[w];
      }

      out.println(ans);

    }

    public class Graph {

      //使うときはこれを削除
      FastScanner sc;

      public int oneBased = 1;

      static final long INF = Long.MAX_VALUE / 2;

      Node[] nodes;

      int V,E;

      public void addEdge(int from, int to, long cost, boolean directed) {
        Edge e = new Edge(from, to, cost);
        nodes[from].edgesTo.add(e);
        nodes[to].edgesFrom.add(e);
        if (!directed) {
          Edge e2 = new Edge(to,from, cost);
          nodes[from].edgesFrom.add(e2);
          nodes[to].edgesTo.add(e2);
        }
        E++;
      }

      public void init(int N) {
        V = N;
        nodes = new Node[N];
        for (int i=0; i<N; i++) {
          nodes[i] = new Node(i, INF);
        }
      }

      public void read(int N, int M, boolean hasCost) {
        read(N, M, hasCost, true);
      }

      /*
       * N: 頂点の数
       * M: 辺の数
       * hasCost: 辺にコストがあるか
       * directed: 有向グラフかどうか
       */
      public void read(int N, int M, boolean hasCost, boolean directed) {
        init(N);

        for (int i=0; i<M; i++) {
          int from = sc.nextInt()-oneBased;
          int to = sc.nextInt()-oneBased;
          long cost = (hasCost ? sc.nextLong() : 1);
          addEdge(from, to, cost, directed);
        }
      }

      public class Node {
        int id;
        long cost;
        int prev;
        int depth;
        LinkedList<Edge> edgesFrom = new LinkedList(); //このノードを終点とする辺
        LinkedList<Edge> edgesTo = new LinkedList(); //このノードを始点とする辺
        boolean done = false;

        public Node(int id, long cost) {
          this.id = id;
          this.cost = cost;
          prev = -1;
          depth = 0;
        }

        //木構造だった場合
        public Node parent() {
          return nodes[edgesFrom.get(0).to];
        }
      }

      public class Edge implements Comparable<Edge> {
        int from, to;
        long cost;
        public Edge(int from, int to, long cost) {
          this.from = from;
          this.to = to;
          this.cost = cost;
        }
        public Node from() {
          return nodes[from];
        }
        public Node getFrom() {return from(); }
        public Node to() {
          return nodes[to];
        }
        public Node getTo() { return to(); }

        public int compareTo(Edge e) {
          if (cost == e.cost) return 0;
          else return cost > e.cost ? 1 : -1;
        }
      }

      public boolean[] reachableFrom(int s) {
        boolean[] visited = new boolean[V];

        LinkedList<Node> stack = new LinkedList<Node>();

        stack.add(nodes[s]);

        while(!stack.isEmpty()) {
          Node from = stack.getLast();
          visited[from.id] = true;
          for (Edge e: from.edgesTo) {
            if (!visited[e.to]) {
              stack.add(e.to());
            }
          }
        }

        return visited;
      }

      public boolean[] reachableTo(int g) {
        boolean[] visited = new boolean[V];

        LinkedList<Node> stack = new LinkedList<Node>();

        stack.add(nodes[g]);

        while(!stack.isEmpty()) {
          Node to = stack.removeLast();
          visited[to.id] = true;
          for (Edge e: to.edgesFrom) {
            if (!visited[e.from]) {
              stack.add(e.from());
            }
          }
        }

        return visited;
      }

      long prim() {
        PriorityQueue<Edge> es = new PriorityQueue<Edge>();
        es.addAll(nodes[0].edgesTo);

        boolean[] done = new boolean[V];
        done[0] = true;
        int count = 1;

        long res = 0;
        while(count < V && !es.isEmpty()) {

          Edge e = es.remove();

          if (done[e.to]) continue;

          done[e.to] = true;
          count++;
          res += e.cost;
          es.addAll(e.to().edgesTo);

        }

        return count == V ? res : -1;
      }

    }

  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
  }

  static class FastScanner {
    private InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;


    public void load() {
      try {
        in = new FileInputStream(next());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

  static class Output extends PrintWriter {

    private long startTime;

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }

    public void start() {
      startTime = System.currentTimeMillis();
    }

    public void time(String s) {
      long time = System.currentTimeMillis() - startTime;
      println(s + "(" + time + ")");
    }

  }

}
