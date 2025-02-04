

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long[] S = new long[N + 1];
    System.arraycopy(sc.nextLongList(N), 0, S, 1, N);
    S[0] = -Integer.MAX_VALUE;

    if (A > B) {
      long tmp = A;
      A = B;
      B = tmp;
    }

    for (int i = 3; i <= N; i++) {
      if (S[i] - S[i - 2] < A) {
        System.out.println(0);
        return;
      }
    }

    // i番目まで追加済み Yの最大はj番目 j <= i
    long[] from = new long[N + 1];
    long[] to = new long[N + 1];
    from[0] = 1;
    int ptr = 0;

    for (int i = 1; i <= N; i++) {
      // S[i] -> Y
      to[i] = 0;
      for (int j = ptr; j < i; j++) {
        if (S[i] - S[j] >= B) {
          to[i] += from[j];
        }
      }

      if (S[i] - S[i - 1] < A) {
        // S[i - 1]-> Y S[i]->X
        ptr = i - 1;
        to[i - 1] = from[i - 1];
      } else {
        // S[i] -> X
        for (int j = ptr; j < i; j++) {
          to[j] = from[j];
        }
      }

      long[] tmp = from;
      from = to;
      to = tmp;
    }

    long ret = 0;
    for (int i = ptr; i <= N; i++) {
      ret += from[i];
    }
    System.out.println(ret);
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
