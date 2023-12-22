import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private static class Point {
    int a;
    int b;
    public Point(int a, int b) {
      this.a = a;
      this.b = b;
    }
    public int hashCode() {
      int hashCode = 17;
      hashCode = hashCode * 31 + a;
      hashCode = hashCode * 31 + b;
      return hashCode;
    }
    public boolean equals(Object o) {
      if (o instanceof Point) {
        Point that = (Point)o;
        return this.a == that.a && this.b == that.b;
      }
      return false;
    }
    public String toString() {
      return "(" + a + ", " + b + ")";
    }
  }
  private static class Square3x3 {
    int a;
    int b;
    List<Point> list = new ArrayList<>();
    public Square3x3(int a, int b) {
      this.a = a;
      this.b = b;
    }
    public boolean contains(Point that) {
      return (this.a - 1 <= that.a && that.a <= this.a + 1 && this.b - 1 <= that.b && that.b <= this.b + 1);
    }
    public void add(Point p) {
      if (contains(p)) {
        list.add(p);
      }
    }
    public int hashCode() {
      int hashCode = 17;
      hashCode = hashCode * 31 + a;
      hashCode = hashCode * 31 + b;
      return hashCode;
    }
    public boolean equals(Object o) {
      if (o instanceof Square3x3) {
        Square3x3 that = (Square3x3)o;
        return this.a == that.a && this.b == that.b;
      }
      return false;
    }
    public String toString() {
      return String.valueOf("(" + a + ", " + b + ", " + list.size() + ")");
    }
  }
  private void solve(Scanner sc, PrintWriter out) {
    long H = sc.nextInt();
    long W = sc.nextInt();
    int N = sc.nextInt();

    int M = 10; // 0 <= j <= 9

    long[] count = new long[M];

    count[0] = (H - 2) * (W - 2);

    List<Point> list = new ArrayList<>();
    for (int i = 0; i < N; ++i) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      list.add(new Point(a, b));
    }
    HashSet<Square3x3> set = new HashSet<>();
    for (Point p : list) {
      for (int x = p.a - 1; x <= p.a + 1; ++x) {
        for (int y = p.b - 1; y <= p.b + 1; ++y) {
          if (x < 2 || y < 2 || x > H - 1 || y > W - 1) {
            continue;
          }
          Square3x3 sq = new Square3x3(x, y);
          if (set.contains(sq)) {
            continue;
          }

          set.add(sq);
          for (Point q : list) {
            sq.add(q);
          }

          --count[0];
          ++count[sq.list.size()];
        }
      }
    }

    for (int i = 0; i < M; ++i) {
      out.println(count[i]);
    }
  }
  private long C(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    for (long i = r; i > 1; --i) {
      res /= i;
    }
    return res;
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}