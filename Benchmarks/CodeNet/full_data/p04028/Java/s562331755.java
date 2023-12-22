import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.next().length();

      Mint[][] dp = new Mint[N + 1][N + 1];
      ArrayUtils.fill(dp, Mint.ZERO);
      dp[0][0] = Mint.ONE;
      for (int o = 0; o < N; o++) {
        Mint[][] nDp = new Mint[N + 1][N + 1];
        ArrayUtils.fill(nDp, Mint.ZERO);
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
            if (j == 0) {
              nDp[Math.max(i - 1, 0)][0] = nDp[Math.max(i - 1, 0)][0].add(dp[i][j]);
              nDp[i + 1][0] = nDp[i + 1][0].add(dp[i][j]);
              nDp[i][1] = nDp[i][1].add(dp[i][j]);
            } else {
              nDp[i][j + 1] = nDp[i][j + 1].add(dp[i][j].mul(2));
              nDp[i][j - 1] = nDp[i][j - 1].add(dp[i][j]);
            }
          }
        }
        dp = nDp;
      }
      out.println(dp[M][0]);
    }

  }

  static abstract class Group<V extends Group<V>> {

    abstract public V add(V other);

    abstract public V addInv();

    abstract public boolean isZero();

    public boolean equals(Object obj) {
      V v = (V) obj;
      return addInv().add(v).isZero();
    }

  }

  static class MOD {

    private static int MOD = (int) (1e9 + 7);

    public static long normalize(long x) {
      if (0 <= x) {
        if (x < MOD) {
          return x;
        }
        if (x < MOD * 2) {
          return x - MOD;
        }
        return x % MOD;
      }
      if (-MOD <= x) {
        return x + MOD;
      }
      x %= MOD;
      return x == 0 ? 0 : x + MOD;
    }

    public static long mul(long x, long y) {
      return normalize(normalize(x) * normalize(y));
    }

  }

  static class Mint extends Field<Mint> {

    public static final Mint ZERO = of(0);
    public static final Mint ONE = of(1);
    final long x;

    public Mint(long x) {
      this.x = MOD.normalize(x);
    }

    public static Mint of(long value) {
      return new Mint(value);
    }

    public Mint mul(long y) {
      return of(MOD.mul(x, y));
    }

    public Mint add(Mint other) {
      return of(x + other.x);
    }

    public Mint addInv() {
      return of(-x);
    }

    public boolean isZero() {
      return x == 0;
    }


    public String toString() {
      return "" + x;
    }

  }

  static abstract class Ring<V extends Ring<V>> extends Group<V> {

  }

  static class ArrayUtils {

    public static <V> void fill(V[][] array, V value) {
      for (V[] l : array) {
        Arrays.fill(l, value);
      }
    }

  }

  static abstract class Field<V extends Field<V>> extends Ring<V> {

  }
}

