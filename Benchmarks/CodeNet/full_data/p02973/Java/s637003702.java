import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.NoSuchElementException;
import java.util.TreeMap;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    final FastScanner fs = new FastScanner();
    int n = fs.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++) a[i] = fs.nextInt();
    TreeMap<Integer,Integer> t = new TreeMap<>();
    t.put(-1,0);
    for (int i=0;i<n;i++) {
      int k = t.lowerKey(a[i]);
      if (k >= 0) {
        int v = t.get(k);
        if (v == 1) {
          t.remove(k);
        } else {
          t.put(k,v-1);
        }
      }
      if (t.containsKey(a[i])) {
        t.put(a[i],t.get(a[i])+1);
      } else {
        t.put(a[i],1);
      }
    }
    int m = 0;
    for (int v : t.values()) m += v;
    System.out.println(m);
  }
}
class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
    if (ptr < buflen) return true;
    ptr = 0;
    try {
      buflen = in.read(buffer);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (buflen <= 0) return false;
    return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
  public boolean hasNext() { skipUnprintable(); return hasNextByte();}
  public int nextInt() { return (int)nextLong();}
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
  public long nextLong() {
    if (!hasNext()) throw new NoSuchElementException();
    long n = 0L;
    boolean minus = false;
    int b = readByte();
    if (b == '-') {
      minus = true;
      b = readByte();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
    while(true) {
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