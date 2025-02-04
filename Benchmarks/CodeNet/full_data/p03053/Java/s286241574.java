import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int h = sc.nextInt();
    int w = sc.nextInt();

    boolean[][] visited = new boolean[h][w];
    Queue<Integer> edges = new LinkedList<>();
    for (int r = 0; r < h; r++) {
      String line = sc.next();
      for (int c = 0; c < w; c++) {
        if (line.charAt(c) == '#') {
          int p = encode(c, r, w);
          edges.add(p);
        }
      }
    }

    int i = 0;
    while (!edges.isEmpty()) {
      Queue<Integer> next = new LinkedList<>();
      while (!edges.isEmpty()) {
        Integer e = edges.remove();
        int r = decodeR(e, w);
        int c = decodeC(e, w);
        visited[r][c] = true;
        travel(c, r, w, h, visited, next);
      }
      edges.addAll(next);
      i++;
    }
    os.println(i - 1);
  }

  private static boolean predicate(int c, int r, int w, int h, boolean[][] visited) {
    if (c < 0 || w <= c) {
      return false;
    }
    if (r < 0 || h <= r) {
      return false;
    }
    return !visited[r][c];
  }

  private static void travel(int c, int r, int w, int h, boolean[][] visited, Collection<Integer> set) {
    if (predicate(c - 1, r, w, h, visited)) set.add(encode(c - 1, r, w));
    if (predicate(c + 1, r, w, h, visited)) set.add(encode(c + 1, r, w));
    if (predicate(c, r - 1, w, h, visited)) set.add(encode(c, r - 1, w));
    if (predicate(c, r + 1, w, h, visited)) set.add(encode(c, r + 1, w));
  }

  private static int encode(int c, int r, int w) {
    return r * w + c;
  }

  private static int decodeC(int encoded, int w) {
    return encoded % w;
  }

  private static int decodeR(int encoded, int w) {
    return encoded / w;
  }

  private static class Point {

    public Point(int c, int r) {
      this.c = c;
      this.r = r;
    }

    int c;
    int r;

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Point point = (Point) o;
      return c == point.c &&
          r == point.r;
    }

    @Override
    public int hashCode() {
      return Objects.hash(c, r);
    }

  }

  private static <P> List<P> bfs(P start, Predicate<P> isEnd, Function<P, Set<P>> travel,
      Predicate<P> toTravel) {
    Set<P> visited = new HashSet<>();
    Queue<List<P>> queue = new LinkedList<>();
    visited.add(start);
    queue.add(Collections.singletonList(start));

    while (!queue.isEmpty()) {
      List<P> path = queue.remove();
      if (isEnd.test(path.get(path.size() - 1))) {
        return path;
      }
      P head = path.get(path.size() - 1);
      Set<P> candidates = travel.apply(head);
      for (P c : candidates) {
        if (!visited.contains(c) && toTravel.test(c)) {
          List<P> p = Stream.concat(path.stream(), Stream.of(c)).collect(Collectors.toList());
          queue.add(p);
          visited.add(c);
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
