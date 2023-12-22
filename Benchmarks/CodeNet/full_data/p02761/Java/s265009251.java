import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int[] arr = new int[n];
    boolean[] set = new boolean[n];
    int m = in.nextInt();
    for (int i = 0; i < m; ++i) {
      int idx = in.nextInt();
      int val = in.nextInt();

      if (set[idx - 1] && arr[idx - 1] != val) {
        out.println(-1);
        return;
      } 

      if (n > 1 && idx == 1 && val == 0) {
        out.println(-1);
        return;
      }

      arr[idx - 1] = val;
      set[idx - 1] = true;
    }

    if (n > 1 && !set[0]) {
      arr[0] = 1;
    }

    for (int i = 0; i < n; ++i) {
      out.print(arr[i]);
    } out.println();
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
