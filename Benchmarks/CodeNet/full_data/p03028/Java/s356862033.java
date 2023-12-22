import java.io.InputStream;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.BitSet;
import java.util.NoSuchElementException;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    FastScanner fs = new FastScanner();
    int N = fs.nextInt();
    BitSet[] A = new BitSet[N];
    BitSet[] dpl = new BitSet[N];
    BitSet[] dpr = new BitSet[N];
    for (int i=0;i<N;i++) {
      A[i] = new BitSet();
      dpl[i] = new BitSet();
      dpr[i] = new BitSet();
      dpl[i].set(i);
      dpr[i].set(i);
    }
    for (int i=1;i<N;i++) {
      char[] s = fs.nextString().toCharArray();
      for (int j=0;j<i;j++) {
        A[i].set(j,s[j] == '1');
        A[j].set(i,s[j] == '0');
      }
    }
    for (int i=1;i<N;i++) {
      for (int l=0;l<N-i;l++) {
        int r = l+i;
        BitSet tmp = A[r].get(0,N);
        tmp.and(dpl[l]);
        tmp.and(dpr[r-1]);
        dpl[l].set(r,!tmp.get(l,r).isEmpty());
        tmp = A[l].get(0,N);
        tmp.and(dpl[l+1]);
        tmp.and(dpr[r]);
        dpr[r].set(l,!tmp.get(l+1,r+1).isEmpty());
      }
    }
    int ans = 0;
    for (int i=0;i<N;i++) {
      if (dpl[0].get(i) && dpr[N-1].get(i)) ans++;
    }
    System.out.println(ans);
  }
}
class FastScanner {
  private final InputStream ins = System.in;
  private final byte[] buf = new byte[1024];
  private int ptr = 0;
  private int len = 0;
  private boolean hasNextByte() {
    if (ptr < len) return true;
    ptr = 0;
    try {
      len = ins.read(buf);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (len < 1) return false;
    return true;
  }
  private int read() {
    if (hasNextByte()) return buf[ptr++];
    return -1;
  }
  private static boolean isPrintable(int c) {
    return 32 < c && c < 127;
  }
  private void skipUnprintable() {
    while (hasNextByte() && !isPrintable(buf[ptr])) ptr++;
  }
  public boolean hasNext() {
    skipUnprintable();
    return hasNextByte();
  }
  public String nextString() {
    if (!hasNext()) throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    for (int b = read();isPrintable(b);b = read()) sb.appendCodePoint(b);
    return sb.toString();
  }
  public int nextInt() {
    if (!hasNext()) throw new NoSuchElementException();
    int n = 0;
    boolean negative = false;
    int b = read();
    if (b == '-') {
      negative = true;
      b = read();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
    while (true) {
      if (b == -1 || !isPrintable(b)) return negative ? -n : n;
      if (b < '0' || '9' < b) throw new NumberFormatException();
      n = 10*n+(b-'0');
      b = read();
    }
  }
}