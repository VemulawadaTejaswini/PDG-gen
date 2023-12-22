import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskF solver = new TaskF();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskF {

    ArrayList<ii>[] g;
    int[] a;
    int res;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      g = new ArrayList[n];
      for (int i = 0; i < n; ++i) {
        g[i] = new ArrayList<>();
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt();
        int y = in.nextInt();
        int c = in.nextInt();
        g[x].add(new ii(y, c));
        g[y].add(new ii(x, c));
      }
      a = new int[16];
      res = 0;
      dfs(0, -1);
      int mask = 0;
      for (int i = 0; i < 16; ++i) {
        mask |= (a[i] << i);
        res -= a[i];
      }
      Assert.assertTrue(res % 2 == 0);
      res /= 2;

      // ArrayList<DijkstraHeap.Edge>[] G = new ArrayList[1 << 16];
      // for (int i = 0; i < G.length; ++i)
      //     G[i] = new ArrayList<>();
      // for (int m = 1; m < (1 << 16); ++m) {
      //     for (int i = 0; i < 16; ++i) {
      //         {
      //             int nm = m ^ (1 << i);
      //             G[m].add(new DijkstraHeap.Edge(nm, 1));
      //         }
      //         for (int j = i + 1; j < 16; ++j) {
      //             int k = (i ^ j);
      //             int inc = 1;
      //             int nm = m ^ (1 << i) ^ (1 << j);
      //             if ((nm >> k) % 2 == 1) {
      //                 ++inc;
      //             }
      //             nm ^= (1 << k);
      //             G[m].add(new DijkstraHeap.Edge(nm, (long) inc));
      //         }
      //     }
      // }
      // long[] prio = new long[G.length];
      // int[] pred = new int[G.length];
      // DijkstraHeap.shortestPaths(G, mask, prio, pred);

      int[] d = new int[1 << 16];
      Arrays.fill(d, Integer.MAX_VALUE);
      d[mask] = 0;
      int[][] q = new int[3][(1 << 15) + 2];
      int[] ql = new int[3];
      q[0][ql[0]++] = mask;
      for (int dist = 0; dist < 100; ++dist) {
        int[] curQ = q[dist % 3];
        int curL = ql[dist % 3];
        int[] nextQ = q[(dist + 1) % 3];
        ql[(dist + 1) % 3] = 0;
        int[] nnextQ = q[(dist + 2) % 3];
        ql[(dist + 2) % 3] = 0;
        int qr = 0;
        while (curL > qr) {
          int m = curQ[qr++];
          int val = d[m];
          for (int i = 0; i < 16; ++i) {
            {
              int nm = m ^ (1 << i);
              if (d[nm] > val + 1) {
                d[nm] = val + 1;
                nextQ[ql[(dist + 1) % 3]++] = nm;
              }
            }
            for (int j = i + 1; j < 16; ++j) {
              int k = (i ^ j);
              int inc = 1;
              int nm = m ^ (1 << i) ^ (1 << j);
              if ((nm >> k) % 2 == 1) {
                ++inc;
              }
              nm ^= (1 << k);
              if (d[nm] > val + inc) {
                d[nm] = val + inc;
                if (inc == 1) {
                  nextQ[ql[(dist + inc) % 3]++] = nm;
                } else {
                  nnextQ[ql[(dist + inc) % 3]++] = nm;
                }
              }
            }
          }
        }
      }
      // for (int nbits = 1; nbits <= 16; ++nbits) {
      //     for (int m = 1; m < (1 << 16); ++m) if (Integer.bitCount(m) == nbits) {
      //         d[m] = 1000000;
      //         for (int i = 0; i < 16; ++i) if ((m >> i) % 2 == 1) {
      //             {
      //                 int nm = m ^ (1 << i);
      //                 d[m] = Math.min(d[m], d[nm] + 1);
      //             }
      //             for (int j = i + 1; j < 16; ++j) if ((m >> j) % 2 == 1) {
      //                 int k = (i ^ j);
      //                 int inc = 1;
      //                 int nm = m ^ (1 << i) ^ (1 << j);
      //                 if ((nm >> k) % 2 == 1) {
      //                     ++inc;
      //                 }
      //                 nm ^= (1 << k);
      //                 d[m] = Math.min(d[m], d[nm] + inc);
      //             }
      //         }
      //     }
      //     // for (int m = 1; m < (1 << 16); ++m) if ((m & mask) == m && Integer.bitCount(m) == nbits) {
      //     //     int tot = 0;
      //     //     for (int i = 0; i < 16; ++i) if ((m >> i) % 2 == 1)
      //     //         tot ^= i;
      //     //     if (tot != 0) continue;
      //     //     mask ^= m;
      //     //     res += nbits - 1;
      //     // }
      // }

      //res += Integer.bitCount(mask);
      //res += d[mask];
      //res += (int) prio[0];
      res += d[0];
      out.printLine(res);
    }

    private int dfs(int x, int p) {
      int mask = 0;
      for (ii e : g[x]) {
        if (e.first != p) {
          int val = dfs(e.first, x);
          val ^= e.second;
          if (val != 0) {
            ++res;
            a[val] ^= 1;
          }
          mask ^= val;
        }
      }
      return mask;
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }

  static class ii implements Comparable<ii> {

    public int first;
    public int second;

    public ii() {
    }

    public ii(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      ii ii = (ii) o;

      if (first != ii.first) {
        return false;
      }
      if (second != ii.second) {
        return false;
      }

      return true;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public int compareTo(ii o) {
      if (first != o.first) {
        return first < o.first ? -1 : 1;
      }
      if (second != o.second) {
        return second < o.second ? -1 : 1;
      }
      return 0;
    }


    public String toString() {
      return "{" +
          "first=" + first +
          ", second=" + second +
          '}';
    }

  }

  static class Assert {

    public static void assertTrue(boolean flag) {
//        if (!flag)
//        while (true);
      if (!flag) {
        throw new AssertionError();
      }
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }
}

