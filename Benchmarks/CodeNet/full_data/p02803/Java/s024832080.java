import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Point {
    int r;
    int c;

    public Point(int r, int c) {
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
      Point point = (Point) o;
      return r == point.r &&
          c == point.c;
    }

    @Override
    public int hashCode() {
      return Objects.hash(r, c);
    }
  }


  private static Map<Point, Map<Point, Path<Point>>> memo = new HashMap<>();


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

    int ans = 0;
    for (int s = 0; s < w * h; s++) {
      for (int t = w * h - 1; 0 <= t ; t--) {
        int sR = s / w;
        int sC = s % w;

        Point sP = new Point(sR, sC);

        int tR = t / w;
        int tC = t % w;

        if (!grid[sR][sC] || !grid[tR][tC]) continue;

        Point tP = new Point(tR, tC);
        Path<Point> path = bfs(sP, tP, p -> travel(p, c -> predicate(c, w, h, grid)), memo);
        if (path != null) {
          ans = Math.max(path.distance() - 1, ans);
        }
      }
    }
    os.println(ans);
  }

  private static Set<Point> travel(Point p, Predicate<Point> predicate) {

    Set<Point> set = new HashSet<>();
    Point next;

    next = new Point(p.r - 1, p.c);
    if (predicate.test(next)) set.add(next);

    next = new Point(p.r + 1, p.c);
    if (predicate.test(next)) set.add(next);

    next = new Point(p.r, p.c - 1);
    if (predicate.test(next)) set.add(next);

    next = new Point(p.r, p.c + 1);
    if (predicate.test(next)) set.add(next);

    return set;
  }

  private static boolean predicate(Point p, int w, int h, boolean[][] grid) {
    if (p.r < 0 || h <= p.r) return false;
    if (p.c < 0 || w <= p.c) return false;
    return grid[p.r][p.c];
  }

  private static class Path<P> {

    P s;
    P e;

    int distance;

    public Path(P s) {
      this.s = s;
      this.e = s;
      distance = 1;
    }

    public Path(Path<P> path, P next) {
      this.s = path.s;
      this.e = next;
      distance = path.distance + 1;
    }

    P getStart() {
      return s;
    }

    P getEnd() {
      return e;
    }

    int distance() {
      return distance;
    }

  }

  private static <P> Path<P> bfs(P start, P end, Function<P, Set<P>> travel, Map<P, Map<P, Path<P>>> memo) {

    if (memo.containsKey(start)) {
      if (memo.get(start).containsKey(end)) {
        return memo.get(start).get(end);
      }
    }

    Set<P> visited = new HashSet<>();
    Queue<Path<P>> queue = new LinkedList<>();
    queue.add(new Path<>(start));

    while (!queue.isEmpty()) {
      Path<P> path = queue.remove();
      P head = path.getEnd();

      if (visited.contains(head)) continue;

      // memo
      Map<P, Path<P>> map = memo.getOrDefault(path.s, new HashMap<>());
      map.put(head, path);
      memo.put(path.s, map);

      Set<P> candidates = travel.apply(head);
      visited.add(head);
      if (head.equals(end)) {
        return path;
      }
      for (P c : candidates) {
        if (!visited.contains(c)) {
          Path<P> p = new Path<>(path, c);
          queue.add(p);
        }
      }
    }
    return null;
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
