import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int a = in.nextInt();
    int b = in.nextInt();
    int m = in.nextInt();

    int[] arr = new int[a];
    int[] brr = new int[b];

    int lowa = Integer.MAX_VALUE;
    for (int i = 0; i < a; ++i) {
      arr[i] = in.nextInt();
      lowa = Math.min(lowa, arr[i]);
    }

    int lowb = Integer.MAX_VALUE;
    for (int i = 0; i < b; ++i) {
      brr[i] = in.nextInt();
      lowb = Math.min(lowb, brr[i]);
    }


    Pair[] p = new Pair[m];
    for (int i = 0; i < m; ++i) {
      int x = in.nextInt() - 1;
      int y = in.nextInt() - 1;
      int c = in.nextInt();
      p[i] = new Pair(arr[x], brr[y], c);
    }

    Arrays.sort(p);

    out.println(Math.min(p[0].price(), lowa + lowb));
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
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


class Pair implements Comparable<Pair> {
  int p1, p2, c;

  public Pair(int p1, int p2, int c) {
    this.p1 = p1;
    this.p2 = p2;
    this.c = c;
  }

  public int price() {
    return p1 + p2 - c;
  }

  @Override
  public int compareTo(Pair p) {
    return this.price() - p.price();
  }
}