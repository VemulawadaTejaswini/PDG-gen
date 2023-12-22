import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DHandstand solver = new DHandstand();
    solver.solve(1, in, out);
    out.close();
  }

  static class DHandstand {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), k = in.nextInt();
      char[] s = in.next().toCharArray();
      List<Integer> trans = new ArrayList<>();

      for (int i = 1; i < n; i++) {
        if (s[i] != s[i - 1])
          trans.add(i - 1);
      }

      int ans = 0, L = 0, R;

      boolean one = s[0] == '1';
      int rightIdx = 2 * k, m = trans.size();
      if (!one) {
        rightIdx--;
      }
      R = getR(n, trans, rightIdx, m);

      do {
        if (L > 0) {
          one = (s[L] - s[L - 1]) == 1;
          if (one) {
            for (int i = 0; i < 2 && R < n && rightIdx < m; ++i) {
              rightIdx++;
            }
            R = getR(n, trans, rightIdx, m);
          }
        }
        ans = Math.max(ans, R - L + 1);
        L++;
      } while (L < n);
      out.println(ans);
    }

    private int getR(int n, List<Integer> trans, int rightIdx, int m) {
      return rightIdx >= m ? n - 1 : trans.get(Math.min(rightIdx, m - 1));
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}

