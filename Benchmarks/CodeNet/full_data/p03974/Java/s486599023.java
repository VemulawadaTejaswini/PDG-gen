import java.io.InputStream;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
public class Main {
  private String[] s;
  private int[][][] c;
  private int[] a;
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    FastScanner fs = new FastScanner();
    int n = fs.nextInt();
    s = new String[n];
    c = new int[n][26][26];
    a = new int[n];
    for (int i=0;i<n;i++) s[i] = fs.nextString();
    int q = fs.nextInt();
    if (n == 1) {
      for (int i=0;i<q;i++) System.out.println(1);
      return;
    }
    LinkedList<Integer> x = new LinkedList<>();
    for (int i=0;i<n;i++) x.add(i);
    dfs(x,0);
    System.gc();
    int[] r = new int[26];
    for (int i=0;i<q;i++) {
      int k = fs.nextInt()-1;
      String p = fs.nextString();
      int ans = a[k]+1;
      for (int u=0;u<26;u++) r[p.charAt(u)-'a'] = u;
      for (int u=0;u<26;u++) {
        for (int v=0;v<26;v++) {
          if (r[v] < r[u]) ans += c[k][u][v];
        }
      }
      System.out.println(ans);
    }
  }
  private void dfs(LinkedList<Integer> x,int l) {
    int k = 0;
    ArrayList<LinkedList<Integer>> p = new ArrayList<>();
    for (int i=0;i<26;i++) p.add(new LinkedList<>());
    for (Iterator<Integer> it=x.iterator();it.hasNext();) {
      int i = it.next();
      if (s[i].length() <= l) {
        k++;
        continue;
      }
      p.get(s[i].charAt(l)-'a').add(i);
    }
    for (Iterator<Integer> it=x.iterator();it.hasNext();) {
      int i = it.next();
      if (s[i].length() <= l) continue;
      a[i] += k;
      for (int j=0;j<26;j++) c[i][s[i].charAt(l)-'a'][j] += p.get(j).size();
    }
    for (int i=0;i<26;i++) {
      if (p.get(i).size() > 0) dfs(p.get(i),l+1);
    }
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