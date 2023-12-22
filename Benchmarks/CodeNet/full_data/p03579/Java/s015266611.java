// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
public class Main {
  int n, m;
  ArrayList<Integer> gr[];
  
  int cnt[] = new int[2];
  int d[];
  
  Main() {
    n = nxtint(); m = nxtint();
    gr = new ArrayList[n + 10];
    for (int i = 0; i ++ < n; ) gr[i] = new ArrayList<>();
    for (int i = -1; ++ i < m; ) {
      int u = nxtint(), v = nxtint();
      gr[u].add(v);
      gr[v].add(u);
    }
    Queue<Integer> qu = new LinkedList<Integer>();
    d = new int[n + 10];
    Arrays.fill(d, -1);
    d[1] = 0;
    for (qu.add(1); qu.size() > 0; ) {
      int u = qu.remove();
      cnt[d[u] & 1]++;
      for (int v: gr[u]) {
        if (d[v] != -1) {
          if ((d[u] + d[v]) % 2 != 0) continue;
          out.println((long)n * (n - 1) / 2 - m);
          return;
        }
        d[v] = d[u] + 1;
        qu.add(v);
      }
    }
    
    long t = 0;
    for (int i = 0; i ++ < n; ) {
      t += cnt[~d[i] & 1];
    }
    t /= 2;
    t -= m;
    out.println(t);
  }
  
  //////////////////////////////////////////////////////////////////////////////////////
  public static void main(String args[]) { new Main().out.flush(); }
  PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), false);
  PrintStream err = System.err;
  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st = null;
  String nxttok() {
    try { while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());}
    catch (IOException e) { throw new RuntimeException(e); }
    return st.nextToken();
  }
  int nxtint() { return Integer.parseInt(nxttok()); }
  long nxtlong() { return Long.parseLong(nxttok()); }
  double nxtdouble() { return Double.parseDouble(nxttok()); }
  
}