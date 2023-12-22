import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author NMouad21
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    RWalk solver = new RWalk();
    solver.solve(1, in, out);
    out.close();
  }

  static class RWalk {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      long k = in.nextLong();

      ModMatrix mat = new ModMatrix(in.nextIntMatrix(n, n));
      mat = mat.pow(k);

      long ans = 0;
      for (int[] r : mat.a) {
        for (int v : r) {
          ans += v;
        }
      }
      out.println(ans % mat.mod);
    }
  }

  static final class ModMatrix implements Cloneable {
    public final int n;
    public final int m;
    public final int[][] a;
    public final int mod;

    public ModMatrix(int n, int mod) {
      this.n = this.m = n;
      this.a = new int[n][n];
      this.mod = mod;
      for (int i = 0; i < n; i++) {
        this.a[i][i] = 1;
      }
    }

    public ModMatrix(int n) {
      this(n, ModArithmetic.DEFAULT_MOD);
    }

    public ModMatrix(int[][] a, int mod) {
      this.a = new int[a.length][];
      this.n = a.length;
      this.m = a[0].length;
      this.mod = mod;
      for (int i = 0; i < this.n; i++) {
        this.a[i] = a[i].clone();
      }
    }

    public ModMatrix(int[][] a) {
      this(a, ModArithmetic.DEFAULT_MOD);
    }

    public ModMatrix(ModMatrix other) {
      this(other.a, other.mod);
    }

    private final void mul(int[][] a, int[][] b, int[][] aux) {
      for (int i = 0, n = this.n, mod = this.mod; i < n; i++) {
        for (int j = 0; j < n; j++) {
          long s = 0;
          for (int k = 0; k < n; k++) {
            s += a[i][k] * (long) b[k][j];
            if (s >= mod) {
              s %= mod;
            }
          }
          aux[i][j] = (int) s;
        }
      }
    }

    public final ModMatrix pow(long p) {
      int n = this.n;
      int[][] aux = new int[n][n];
      int[][] res = new int[n][n];
      int[][] a = new int[n][n];
      for (int i = 0; i < n; i++) {
        res[i][i] = 1;
        a[i] = this.a[i].clone();
      }
      while (p > 0) {
        if ((p & 1) == 1) {
          mul(res, a, aux);
          int[][] tmp = aux;
          aux = res;
          res = tmp;
        }
        p >>= 1;
        mul(a, a, aux);
        int[][] tmp = aux;
        aux = a;
        a = tmp;
      }
      return new ModMatrix(res);
    }

    protected Object clone() throws CloneNotSupportedException {
      return new ModMatrix(this);
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          sb.append(a[i][j]).append(' ');
        }
        sb.append('\n');
      }
      return sb.deleteCharAt(sb.length() - 1).toString();
    }
  }

  static final class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[1 << 16];
    private int curChar;
    private int numChars;

    public InputReader() {
      this.stream = System.in;
    }

    public InputReader(final InputStream stream) {
      this.stream = stream;
    }

    private final int read() {
      if (this.numChars == -1) {
        throw new UnknownError();
      } else {
        if (this.curChar >= this.numChars) {
          this.curChar = 0;

          try {
            this.numChars = this.stream.read(this.buf);
          } catch (IOException ex) {
            throw new InputMismatchException();
          }

          if (this.numChars <= 0) {
            return -1;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public final int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {}

      byte sgn = 1;
      if (c == 45) { // 45 == '-'
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'
        res *= 10;
        res += c - 48; // 48 == '0'
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    public final long nextLong() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {}

      byte sgn = 1;
      if (c == 45) { // 45 == '-'
        sgn = -1;
        c = this.read();
      }

      long res = 0;

      while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'
        res *= 10L;
        res += c - 48; // 48 == '0'
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }
      throw new InputMismatchException();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final int[][] nextIntMatrix(final int n, final int m) {
      int[][] arr = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = nextInt();
        }
      }
      return arr;
    }
  }

  static final class ModArithmetic {
    public static final int DEFAULT_MOD = 1_000_000_007;
    public final int m;
    public final boolean isPrime;

    public ModArithmetic() {
      this(DEFAULT_MOD, true);
    }

    public ModArithmetic(int mod) {
      this(mod, false);
    }

    public ModArithmetic(int mod, boolean isPrime) {
      if (mod <= 0) {
        throw new IllegalArgumentException("Modulo must be > 0");
      }
      this.m = mod;
      this.isPrime = isPrime;
    }

    public String toString() {
      return "ModArithmetic{" + "m=" + m + ", isPrime=" + isPrime + '}';
    }
  }
}
