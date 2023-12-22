import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shangu
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastReader in = new FastReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ATableTennisTraining solver = new ATableTennisTraining();
    solver.solve(1, in, out);
    out.close();
  }

  static class ATableTennisTraining {
    public void solve(int testNumber, FastReader in, PrintWriter out) {
      long n = in.nextLong(), a = in.nextLong(), b = in.nextLong();
      if ((b - a) % 2 == 1) {
        if (a > b) {
          long x = a;
          a = b;
          b = x;
        }
        long ans = (b - a - 1) / 2 + a, tmp = (b - a - 1) / 2 + n - b + 1;
        out.println(Math.min(ans, tmp));
      } else out.println(Math.abs(a - b) >> 1);
    }

  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream), 32768);
      st = null;
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

  }
}

