import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int K = sc.nextInt();

    BIT bit = new BIT(N);
    long[] a = new long[N + 1];
    long ret = 0;
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextLong();
      bit.add(i, a[i]);

      if (a[i] >= 0) {
        ret += a[i];
      }
    }

    long max1 = Integer.MIN_VALUE;
    long max2 = Integer.MIN_VALUE;

    List<Integer> idx1 = new ArrayList<>();
    List<Integer> idx2 = new ArrayList<>();
    for (int i = 1; i <= N - K + 1; i++) {
      long now = bit.sum(i, i + K - 1);

      if (max1 < now) {
        max1 = now;
        idx1 = new ArrayList<>();
        idx1.add(i);
      } else if (max1 == now) {
        idx1.add(i);
      }

      if (max2 < -now) {
        max2 = -now;
        idx2 = new ArrayList<>();
        idx2.add(i);
      } else if (max2 == -now) {
        idx2.add(i);
      }
    }

    long A = Integer.MIN_VALUE;
    for (int idx : idx1) {
      long ret1 = ret;
      for (int i = idx; i < idx + K; i++) {
        if (a[i] < 0) {
          ret1 += a[i];
        }
      }
      A = Math.max(A, ret1);
    }

    for (int idx : idx2) {
      long ret1 = ret;
      for (int i = idx; i < idx + K; i++) {
        if (a[i] > 0) {
          ret1 -= a[i];
        }
      }
      A = Math.max(A, ret1);
    }
   System.out.println(A);
  }


}


class BIT {
  private long[] array;
  private int n;

  public BIT(int n) {
    this.array = new long[n + 1];
    this.n = n;
  }

  public void add(int a, long w) {
    for (int i = a; i <= n; i += (i & -i)) {
      array[i] += w;
    }
  }

  public long sum(int a) {
    long ret = 0;
    for (int i = a; i > 0; i -= (i & -i)) {
      ret += array[i];
    }
    return ret;
  }

  public long sum(int a, int b) {
    return a == 0 ? sum(b) : (sum(b) - sum(a - 1));
  }

}


class FastScanner {
  public static String debug = null;

  private final InputStream in = System.in;
  private int ptr = 0;
  private int buflen = 0;
  private byte[] buffer = new byte[1024];
  private boolean eos = false;

  private boolean hasNextByte() {
    if (ptr < buflen) {
      return true;
    } else {
      ptr = 0;
      try {
        if (debug != null) {
          buflen = debug.length();
          buffer = debug.getBytes();
          debug = "";
          eos = true;
        } else {
          buflen = in.read(buffer);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (buflen < 0) {
        eos = true;
        return false;
      } else if (buflen == 0) {
        return false;
      }
    }
    return true;
  }

  private int readByte() {
    if (hasNextByte())
      return buffer[ptr++];
    else
      return -1;
  }

  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }

  private void skipUnprintable() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr]))
      ptr++;
  }

  public boolean isEOS() {
    return this.eos;
  }

  public boolean hasNext() {
    skipUnprintable();
    return hasNextByte();
  }

  public String next() {
    if (!hasNext())
      throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    int b = readByte();
    while (isPrintableChar(b)) {
      sb.appendCodePoint(b);
      b = readByte();
    }
    return sb.toString();
  }

  public long nextLong() {
    if (!hasNext())
      throw new NoSuchElementException();
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
    return (int) nextLong();
  }

  public long[] nextLongList(int n) {
    return nextLongTable(1, n)[0];
  }

  public int[] nextIntList(int n) {
    return nextIntTable(1, n)[0];
  }

  public long[][] nextLongTable(int n, int m) {
    long[][] ret = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextLong();
      }
    }
    return ret;
  }

  public int[][] nextIntTable(int n, int m) {
    int[][] ret = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextInt();
      }
    }
    return ret;
  }
}
