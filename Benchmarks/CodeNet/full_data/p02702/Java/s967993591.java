import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    String[] S = sc.next().split("");
    int[] s = Stream.of(S).mapToInt(Integer::parseInt).toArray();
    int ans = 0;
    int l = S.length;
    for (int i = 0; i <= l - 3; i++) {
      int z = s[i] * 100 + s[i + 1] * 10 + s[i + 2];
      for (int j = i + 3; j < l; j++) {
        int x = z * 10 + s[j];
        if ((z = x < 2019 ? x : x % 2019) == 0)
          ans++;
      }

    }

    System.out.println(ans);

  }
}

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  private boolean hasNextByte() {
    if (ptr < buflen) {
      return true;
    } else {
      ptr = 0;
      try {
        buflen = in.read(buffer);
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (buflen <= 0) {
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

  public boolean hasNext() {
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

  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    int n = 0;
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

  public long nextLong() {
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
}