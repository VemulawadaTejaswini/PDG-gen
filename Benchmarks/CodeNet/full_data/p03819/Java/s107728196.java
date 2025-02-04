import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {

  long[] solve(int M, int[] left, int[] right) {
    int N = left.length;

    long[] imos = new long[M + 2];
    for (int i = 0; i < N; i++) {
      int l = left[i];
      int r = right[i];
      int w = r + 1 - l;

      int j = 1;
      for (; ; j++) {
        int L = (l + j - 1) / j;
        int R = r / j;
        int prevR = r / (j + 1);
        if (w > prevR) {
          prevR = w;
        }

        if (prevR + 1 >= L) {
          imos[1]++;
          imos[R + 1]--;
          break;
        } else if (L <= R) {
          imos[L]++;
          imos[R + 1]--;
        }
      }
    }

    long[] ans = new long[M];
    long cur = 0;
    for (int m = 1; m <= M; m++) {
      cur += imos[m];
      ans[m - 1] = cur;
    }
    return ans;
  }

  void test() {
    Random random = new Random();
    while (true) {

      int N = 2;
      int M = 10;
      int[] left = new int[N];
      int[] right = new int[N];
      for (int i = 0; i < N; i++) {
        int l = random.nextInt(M) + 1;
        int r = random.nextInt(M) + 1;
        if (l > r) {
          int t = l;
          l = r;
          r = t;
        }
        left[i] = l;
        right[i] = r;
      }

      long[] naive = new long[M];
      for (int m = 1; m <= M; m++) {
        int count = 0;
        for (int i = 0; i < N; i++) {
          int cur = 0;
          while (cur < M) {
            cur += m;
            if (left[i] <= cur && cur <= right[i]) {
              count++;
              break;
            }
          }
        }
        naive[m - 1] = count;
      }

      long[] solve = solve(M, left, right);
      for (int i = 0; i < M; i++) {
        if (solve[i] != naive[i]) {
          throw new IllegalArgumentException("");
        }
      }

    }
  }

  private void solve(FastScanner in, PrintWriter out) {
//    test();
    int N = in.nextInt();
    int M = in.nextInt();

    int[] left = new int[N];
    int[] right = new int[N];
    for (int i = 0; i < N; i++) {
      left[i] = in.nextInt();
      right[i] = in.nextInt();
    }

    long[] ans = solve(M, left, right);
    for (long a : ans) {
      out.println(a);
    }
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
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
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

    long nextLong() {
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
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
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
