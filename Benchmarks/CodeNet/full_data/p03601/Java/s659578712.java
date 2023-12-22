import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String arg[]) throws IOException { new Main().bw.close(); }

  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  StringTokenizer st = null;
  String nxttok() { 
    try { while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine()); }
    catch(Exception e) { return "";}
    return st.nextToken();
  }

  int nxtint() { return Integer.parseInt(nxttok()); }
  long nxtlong() { return Long.parseLong(nxttok()); }

  Set<Long> w = new TreeSet<Long>();
  Set<Long> s = new TreeSet<Long>();

  Long[] sa;
  long a, b, c, d, e, f;

  boolean ok(long s, long w) {
    long tt = s + w;
    if (tt > f) return false;
    //if (s / w > e / 100) return false;
    if (s * 100 > w * e) return false;
    return true;
  }

  Main() throws IOException {
    a = nxtint(); b = nxtint(); c = nxtint(); d = nxtint(); e = nxtint(); f = nxtint();

    for (int i = 0; i < 30; ++i) {
      for (int g = 0; g < 30; ++g) {
        if ((i * a + g * b) * 100 > f) continue;
        if (i + g == 0) continue;
        w.add((i * a + g * b) * 100);
      }
    }
    for (int i = 0; i <= 3000; ++i) 
      for (int g = 0; g < 3000; ++g) {
        if (i * c + g * d > f) continue;
        s.add((i * c + g * d));
      }
    sa = new Long[s.size()];
    s.toArray(sa);
    long ans1 = 0, ans2 = 100 * a;
    for (long tw : w) {
      int l = 0, r = sa.length - 1;
      while (l < r) {
        int mid = l + (r - l + 1) / 2;
        long ts = sa[mid];
        if (ok(ts, tw)) l = mid;
        else r = mid - 1;
      }
      long ts = sa[l];
      if (!ok(ts, tw)) continue;
      //if (ts / (ts + tw) > ans1 / ans2) continue;
      if (ts * ans2 > (ts + tw) * ans1) {
        ans1 = ts;
        ans2 = ts + tw;
      }
    }
    bw.write(ans2 + " " + ans1);
  }
}
