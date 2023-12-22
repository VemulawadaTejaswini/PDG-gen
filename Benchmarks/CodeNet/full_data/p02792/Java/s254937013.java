import java.util.*;
import java.io.*;

public class Main {

  void solve(InputReader in, PrintWriter out) {
    long[][] count = new long[10][10];
    int n = in.nextInt();

    for (int i = 1; i <= n; ++i) {
      int f = getFirst(i);
      int l = getLast(i);

      ++count[f][l];
    }

    long ans = 0;
    for (int i = 0; i < 10; ++i) {
      for (int j = 0; j < 10; ++j) {
        ans += count[i][j] * count[j][i];
        //System.err.println(i + " " + j + " " + count[i][j]);
      }
    }

    out.println(ans);
  }

  private int getFirst(int n) {
    int ret = 0;
    while (n >= 10) {
      n /= 10;
    }
    return n % 10;
  }

  private int getLast(int n) {
    return n % 10;
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
