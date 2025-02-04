import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
  private final long MOD = (long) (1e9 + 7);
  private int N, A, B, C, D;
  private long[][] dp;

  public class Combination {
    private long[] fact;
    private long[] invFact;

    public Combination(int max) {
      long[] inv = new long[max + 1];
      fact = new long[max + 1];
      invFact = new long[max + 1];
      inv[1] = 1;
      for (int i = 2; i <= max; i++) inv[i] = inv[(int) (MOD % i)] * (MOD - MOD / i) % MOD;
      fact[0] = invFact[0] = 1;
      for (int i = 1; i <= max; i++) fact[i] = fact[i - 1] * i % MOD;
      for (int i = 1; i <= max; i++) invFact[i] = invFact[i - 1] * inv[i] % MOD;
    }

    public long get(int x, int y) {
      return fact[x] * invFact[y] % MOD * invFact[x - y] % MOD;
    }
  }

  private void solve(FastScanner in, PrintWriter out) {
    N = in.nextInt();
    A = in.nextInt();
    B = in.nextInt();
    C = in.nextInt();
    D = in.nextInt();

    Combination combination = new Combination(N);

    dp = new long[N + 2][N + 2];
    dp[0][A] = 1;

    //i人を使ってj人未満のチームで分ける方法
    for (int i = 0; i <= N; i++) {
      for (int j = A; j <= B; j++) {
        if (dp[i][j] <= 0) continue;
        dp[i][j + 1] += dp[i][j];
        dp[i][j + 1] %= MOD;

        long d = dp[i][j];
        for (int num = 1; num <= D; num++) {
          if (i + num * j > N) break;
          d *= combination.get(N - (i + num * j) + j, j);
          d %= MOD;
          if (num < C) continue;
          long e = d * combination.invFact[num];
          e %= MOD;
          dp[i + num * j][j + 1] += e;
          dp[i + num * j][j + 1] %= MOD;
        }
      }
    }

    out.println(dp[N][B + 1]);

  }

  public static int[] getPrimes(int N) {
    ArrayList<Integer> primes = new ArrayList<>();
    boolean[] isComposite = new boolean[N + 1];
    primes.add(2);
    for (int i = 3; i <= N; i += 2)
      if (!isComposite[i]) {
        primes.add(i);
        for (int j = i * 2; j <= N; j += i) {
          isComposite[j] = true;
        }
      }
    int[] array = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) {
      array[i] = primes.get(i);
    }
    return array;
  }

  public static void main(String[] args) {
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    out.close();
  }

  private static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
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

    boolean hasNext() {
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

    long nextLong() {
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}
