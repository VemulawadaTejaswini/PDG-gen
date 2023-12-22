//Do what you can't.

import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main{
  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter w = new PrintWriter(System.out);
    int n = in.nextInt();
    Point[] p = new Point[n];
    DJSet ds = new DJSet(n);
    for (int i = 0; i < n; i++) {
      p[i] = new Point(in.nextInt(), in.nextInt());
    }
    PriorityQueue<Edge> q = new PriorityQueue<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        long d = dis(p[i], p[j]);
        q.add(new Edge(i, j, d));
      }
    }
    long sum = 0;
    int con=0;
    while (con<n-1) {
      Edge eg = q.poll();
      if (!ds.equiv(eg.u,eg.v)){
        sum+=eg.cost;
        ds.union(eg.u,eg.v);
        con++;
      }
    }
    w.println(sum);
    w.close();

  }
  static class Point  {
    int x;
    int y;
    Point(int a, int b) {
      this.x = a;
      this.y = b;
    }
  }
  static class Edge implements Comparable<Edge> {
    int u;
    int v;
    long cost;
    Edge(int a, int b,long c) {
      this.u = a;
      this.v = b;
      this.cost = c;
    }
    public int compareTo(Edge e) {
      return Long.compare(this.cost, e.cost);
    }
  }
  static long dis(Point p1, Point p2) {
    return Math.min(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
  }
  public static class DJSet {
    public int[] upper;

    public DJSet(int n) {
      upper = new int[n];
      Arrays.fill(upper, -1);
    }

    public int root(int x) {
      return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    public boolean equiv(int x, int y) {
      return root(x) == root(y);
    }

    public boolean union(int x, int y) {
      x = root(x);
      y = root(y);
      if (x != y) {
        if (upper[y] < upper[x]) {
          int d = x;
          x = y;
          y = d;
        }
        upper[x] += upper[y];
        upper[y] = x;
      }
      return x == y;
    }

    public int countCompo() {
      int ct = 0;
      for (int u : upper)
        if (u < 0)
          ct++;
      return ct;
    }
  }
  static class InputReader {

    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar, snumChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int snext() {
      if (snumChars == -1)
        throw new InputMismatchException();
      if (curChar >= snumChars) {
        curChar = 0;
        try {
          snumChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (snumChars <= 0)
          return -1;
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9')
          throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public long nextLong() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = snext();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9')
          throw new InputMismatchException();
        res *= 10;
        res += c - '0';
        c = snext();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public int[] nextIntArray(int n) {
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextInt();
      }
      return a;
    }

    public String readString() {
      int c = snext();
      while (isSpaceChar(c)) {
        c = snext();
      }
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = snext();
      } while (!isSpaceChar(c));
      return res.toString();
    }

    public String nextLine() {
      int c = snext();
      while (isSpaceChar(c))
        c = snext();
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = snext();
      } while (!isEndOfLine(c));
      return res.toString();
    }

    public boolean isSpaceChar(int c) {
      if (filter != null)
        return filter.isSpaceChar(c);
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
      return c == '\n' || c == '\r' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);
    }
  }
}
