import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int h = sc.nextInt();
    int w = sc.nextInt();

    boolean[][] grid = new boolean[h][w];

    for (int r = 0; r < h; r++) {
      String line = sc.next();
      for (int c = 0; c < w; c++) {
        grid[r][c] = line.charAt(c) == '.';
      }
    }

    Graph<GridPoint> graph = new VerticalHorizontalNeighborGridGraph(h, w, grid);

    Map<GridPoint, Map<GridPoint, Graph.VertexPath<GridPoint>>> shortest = graph.warshallFloyd();

    long ans = 0;
    for (GridPoint from : shortest.keySet()) {
      for (GridPoint dest : shortest.get(from).keySet()) {
        ans = Math.max(shortest.get(from).get(dest).getWeight(), ans);
      }
    }

    os.println(ans);

//    long ans = 0;
//    for (int s = 0; s < w * h; s++) {
//      for (int t = w * h - 1; 0 <= t; t--) {
//        int sR = s / w;
//        int sC = s % w;
//
//        GridPoint sP = new GridPoint(sR, sC);
//
//        int tR = t / w;
//        int tC = t % w;
//
//        if (!grid[sR][sC] || !grid[tR][tC]) {
//          continue;
//        }
//
//        GridPoint tP = new GridPoint(tR, tC);
//        Graph.VertexPath<GridPoint> path = graph.bfs(sP, tP);
//        if (path != null) {
//          ans = Math.max(path.getSize(), ans);
//        }
//      }
//    }
//    os.println(ans);
  }

  private static class GridPoint {

    int r;
    int c;

    public GridPoint(int r, int c) {
      this.r = r;
      this.c = c;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      GridPoint gridPoint = (GridPoint) o;
      return r == gridPoint.r &&
          c == gridPoint.c;
    }

    @Override
    public int hashCode() {
      return Objects.hash(r, c);
    }
  }

  private static class VerticalHorizontalNeighborGridGraph extends GridGraph {

    private final boolean[][] grid;

    private final Predicate<GridPoint> predicate = this::predicate;
    private int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public VerticalHorizontalNeighborGridGraph(int h, int w, boolean[][] grid) {
      super(h, w);
      this.grid = grid;
    }

    private boolean predicate(GridPoint p) {
      if (p.r < 0 || h <= p.r) {
        return false;
      }
      if (p.c < 0 || w <= p.c) {
        return false;
      }
      return grid[p.r][p.c];
    }

    private Set<Edge<GridPoint>> neighbors(GridPoint from) {

      return Arrays.stream(moves)
          .map(move -> new GridPoint(from.r + move[0], from.c + move[1]))
          .filter(predicate)
          .map(to -> new ConstantWeightEdge<>(from, to))
          .collect(Collectors.toSet());
    }

    @Override
    public Set<Edge<GridPoint>> getEdges(GridPoint from) {
      return neighbors(from);
    }
  }

  private static abstract class GridGraph implements Graph<GridPoint> {

    public GridGraph(int h, int w) {
      this.h = h;
      this.w = w;

      for (int r = 0; r < h; r++) {
        for (int c = 0; c < w; c++) {
          nodes.add(new GridPoint(r, c));
        }
      }
    }

    protected final int h;
    protected final int w;

    private final Set<GridPoint> nodes = new HashSet<>();

    @Override
    public Set<GridPoint> getNodes() {
      return nodes;
    }
  }

  private static interface Graph<V> {

    static abstract class Edge<V> {

      public Edge(V from, V to) {
        this.from = from;
        this.to = to;
      }

      final V from;


      final V to;

      V getFrom() {
        return from;
      }

      V getTo() {
        return to;
      }

      abstract long getWeight();
    }

    static class ConstantWeightEdge<V> extends Edge<V> {

      public ConstantWeightEdge(V from, V to) {
        super(from, to);
      }

      @Override
      long getWeight() {
        return 1;
      }
    }


    Set<V> getNodes();

    Set<Edge<V>> getEdges(V from);

    default VertexPath<V> bfs(V begin, V end) {
      Set<V> visited = new HashSet<>();
      Queue<VertexPath<V>> queue = new ArrayDeque<>();
      queue.add(new EfficientVertexPath<>(begin));
      visited.add(begin);

      while (!queue.isEmpty()) {
        VertexPath<V> path = queue.remove();
        V head = path.getEnd();

        Set<Edge<V>> candidates = getEdges(head);
        if (head.equals(end)) {
          return path;
        }
        for (Edge<V> c : candidates) {
          if (!visited.contains(c.getTo())) {
            VertexPath<V> p = new EfficientVertexPath<>(path, c);
            queue.add(p);
            visited.add(c.getTo());
          }
        }
      }
      return null;
    }

    /**
     * get min weight {@link VertexPath} from node to dest node. costs O(V^3).
     *
     * @return (from, dest) -> VertexPath
     */
    default Map<V, Map<V, VertexPath<V>>> warshallFloyd() {
      Map<V, Map<V, VertexPath<V>>> shortest = new HashMap<>();
      for (V from : getNodes()) {
        shortest.put(from, new HashMap<>());
        for (Edge<V> edge : getEdges(from)) {
          shortest.get(from).put(edge.getTo(), new EfficientVertexPath<>(edge));
        }
      }

      for (V relay : getNodes()) {
        for (V from : getNodes()) {
          for (V dest : getNodes()) {
            VertexPath<V> pathA = shortest.get(from).get(relay);
            VertexPath<V> pathB = shortest.get(relay).get(dest);
            if (pathA != null && pathB != null) {
              VertexPath<V> path = pathA.append(pathB);
              if (!shortest.get(from).containsKey(dest) || path.getWeight() < shortest.get(from)
                  .get(dest).getWeight()) {
                shortest.get(from).put(dest, path);
              }
            }
          }
        }
      }
      return shortest;
    }

    static interface VertexPath<V> {

      V getBegin();

      V getEnd();

      long getSize();

      long getWeight();

      VertexPath<V> append(VertexPath<V> other);
    }

    static class EfficientVertexPath<V> implements VertexPath<V> {

      final V begin;
      final V end;
      final long size;
      final long weight;

      public EfficientVertexPath(V begin) {
        this.begin = begin;
        this.end = begin;
        this.size = 0;
        this.weight = 0;
      }

      public EfficientVertexPath(Edge<V> edge) {
        this.begin = edge.getFrom();
        this.end = edge.getTo();
        this.size = 1;
        this.weight = edge.getWeight();
      }

      public EfficientVertexPath(VertexPath<V> path, Edge<V> append) {
        this.begin = path.getBegin();
        if (!path.getEnd().equals(append.getFrom())) {
          throw new IllegalStateException("not correct edge.");
        }
        this.end = append.getTo();
        this.size = path.getSize() + 1;
        this.weight = path.getWeight() + append.getWeight();
      }

      public EfficientVertexPath(VertexPath<V> pathA, VertexPath<V> pathB) {
        this.begin = pathA.getBegin();
        if (!pathA.getEnd().equals(pathB.getBegin())) {
          throw new IllegalStateException("not correct edge.");
        }
        this.end = pathB.getEnd();
        this.size = pathA.getSize() + pathB.getSize();
        this.weight = pathA.getWeight() + pathB.getWeight();
      }

      @Override
      public V getBegin() {
        return begin;
      }

      @Override
      public V getEnd() {
        return end;
      }

      @Override
      public long getSize() {
        return size;
      }

      @Override
      public long getWeight() {
        return weight;
      }

      @Override
      public VertexPath<V> append(VertexPath<V> other) {
        return new EfficientVertexPath<>(this, other);
      }

      @Override
      public boolean equals(Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        EfficientVertexPath<?> that = (EfficientVertexPath<?>) o;
        return size == that.size &&
            weight == that.weight &&
            Objects.equals(begin, that.begin) &&
            Objects.equals(end, that.end);
      }

      @Override
      public int hashCode() {
        return Objects.hash(begin, end, size, weight);
      }
    }
  }

  private static class FermatCombination {

    private long fact[];
    private long mod;

    public FermatCombination(int size, long mod) {
      this.fact = new long[size + 1];
      this.mod = mod;

      this.fact[0] = 1;

      for (int i = 1; i <= size; i++) {
        fact[i] = (fact[i - 1] * i) % mod;
      }
    }

    private long factorial(int n) {
      return fact[n];
    }

    private long inverse(long n) {
      return pow(n, mod - 2) % mod;
    }

    private long pow(long x, long n) {
      long ans = 1;
      while (n > 0) {
        if ((n & 1) == 1) {
          ans = ans * x % mod;
        }
        x = x * x % mod;
        n >>= 1;
      }
      return ans;
    }

    long combination(int n, int k) {
      long ans = 1;
      ans *= factorial(n);
      ans %= mod;
      ans *= inverse(factorial(n - k));
      ans %= mod;
      ans *= inverse(factorial(k));
      ans %= mod;
      return ans;
    }
  }

  private static class Scanner {

    private final InputStream is;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    Scanner(InputStream is) {
      this.is = is;
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = is.read(buffer);
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
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
        throw new NumberFormatException();
      }
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}
