import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC126DEvenRelation solver = new ABC126DEvenRelation();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC126DEvenRelation {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      PotentialUnionFind puf = new PotentialUnionFind();
      StringBuilder sb = new StringBuilder();
      int n = in.nextInt();
      int[] u = new int[n];
      int[] v = new int[n];
      long[] w = new long[n];
      puf.init(n);
      for (int i = 0; i < n - 1; i++) {
        u[i] = in.nextInt() - 1;
        v[i] = in.nextInt() - 1;
        w[i] = in.nextLong();
        puf.union(u[i], v[i], w[i]);
      }

      for (int i = 0; i < n; i++) {
        sb.append(puf.potential(i) % 2);
        sb.append("\n");
      }
      out.println(new String(sb));

    }

  }

  static class UnionFind {

    int[] par;
    int[] rank;

  }

  static class PotentialUnionFind extends UnionFind {

    private long[] pot;

    void init(int n) {
      par = new int[n];
      rank = new int[n];
      pot = new long[n];
      for (int i = 0; i < n; i++) {
        par[i] = i; // はじめは全員が根である
        rank[i] = 0;
        pot[i] = 0;
      }
    }

    int root(int x) {
      if (par[x] == x) {
        return x;
      } else {
        int r = root(par[x]);
        pot[x] += pot[par[x]];
        par[x] = r;
        return par[x];
      }
    }

    void union(int x, int y, long w) {
      w = w + potential(x) - potential(y);
      int rx = root(x);
      int ry = root(y);
      if (rx == ry) {
        return;
      }
      if (rank[rx] < rank[ry]) {
        int tmp = rx;
        rx = ry;
        ry = tmp;
        w = -w;
      }
      if (rank[rx] == rank[ry]) {
        rank[rx]++;
      }
      par[ry] = rx;
      pot[ry] = w;
    }

    long potential(int x) {
      root(x);
      return pot[x];
    }

  }
}

