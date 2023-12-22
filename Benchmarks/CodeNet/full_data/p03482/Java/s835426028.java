import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);

    char[] s = sc.next().toCharArray();

    int ans = (s.length + 1) / 2;

    if (s.length % 2 == 0) {
      int mid = (s.length - 1) / 2;
      char c = s[mid];
      for (int i = 0; i < s.length / 2 && s[mid] == s[mid - i] && s[mid - i] == s[mid + i + 1]; i++) {
        ans++;
      }
    } else  {
      int mid = s.length / 2;
      char c = s[mid];
      for (int i = 1; i < s.length / 2 && s[mid] == s[mid - i] && s[mid - i] == s[mid + i]; i++) {
        ans++;
      }
    }

    out.println(ans);
    out.flush();
  }

}

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  private boolean hasNextByte() {
    if (ptr < buflen) return true;
    else {
      ptr = 0;
      try {
        buflen = in.read(buffer);
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (buflen <= 0)
        return false;
    }
    return true;
  }

  private byte readByte() {
    if (hasNextByte()) return buffer[ptr++];
    return -1;
  }

  private boolean isPrintableChar(byte c) {
    return '!' <= c && c <= '~';
  }

  private void skipUnprintable() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
  }

  public boolean hasNext() {
    skipUnprintable();
    return hasNextByte();
  }

  public String next() {
    if (!hasNext()) throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    byte b = readByte();
    while (isPrintableChar(b)) {
      sb.appendCodePoint(b);
      b = readByte();
    }
    return sb.toString();
  }

  public int nextInt() {
    if (!hasNext()) throw new NoSuchElementException();
    int n = 0;
    boolean minus = false;
    byte b = readByte();
    if (b == '-') {
      minus = true;
      b = readByte();
    }
    if (b < '0' || '9' < b)
      throw new NumberFormatException();
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

  public int[] nextIntArray(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }
    return a;
  }

  public long nextLong() {
    if (!hasNext()) throw new NoSuchElementException();
    long n = 0;
    boolean minus = false;
    byte b = readByte();
    if (b == '-') {
      minus = true;
      b = readByte();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
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

  public long[] nextLongArray(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }
    return a;
  }

}