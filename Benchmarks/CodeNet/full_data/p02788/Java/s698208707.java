import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int d = in.nextInt();
    int a = in.nextInt();
    
    Pair[] arr = new Pair[n];
    for (int i = 0; i < n; ++i)
      arr[i] = new Pair(in.nextInt(), in.nextInt());

    Arrays.sort(arr);
    ArrayDeque<Pair> q = new ArrayDeque<>();
    int i = 0; 
    long ans = 0;
    long cnt = 0;
    while (i < n) {
      while (!q.isEmpty()) {
        Pair p = q.peek();
        if (p.f >= arr[i].f) break;
        cnt -= p.s;
        q.poll();
      }

      arr[i].s -= cnt;
      if (arr[i].s > 0) {
        int attacks = arr[i].s / a;
        attacks += arr[i].s % a != 0 ? 1 : 0;
        ans += attacks;
        q.offer(new Pair(arr[i].f + d + d, attacks * a));
        cnt += attacks * a;
      }
      ++i;
    }

    out.println(ans);
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
  }

  static class Pair implements Comparable<Pair> {
    int f, s;

    public Pair(int f, int s) {
      this.f = f;
      this.s = s;
    }

    @Override
    public int compareTo(Pair p) {
      return this.f - p.f;
    }
  }

  static class InputReader {
    BufferedReader in;
    StringTokenizer st;

    public InputReader(InputStream is) {
      in = new BufferedReader(new InputStreamReader(is));
    }

    public String next() {
      try {
        while (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}
