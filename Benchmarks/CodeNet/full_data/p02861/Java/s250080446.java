import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();

    double[][] xys = new double[n][2];
    double res = 0;

    int fact = fact(n);
    int factor = fact(n) * (n - 1) / ((n * (n - 1)) / 2);

    for (int i = 0; i < n; i++) {
      xys[i][0] = in.nextDouble();
      xys[i][1] = in.nextDouble();

      for (int j = 0; j < i; j++) {
        System.out.println(i + " " + j);
        res += factor * Math.sqrt(
            (xys[i][0] - xys[j][0]) * (xys[i][0] - xys[j][0]) +
                (xys[i][1] - xys[j][1]) * (xys[i][1] - xys[j][1]));
      }
    }

    out.println(res / fact);

    out.close();
  }

  static int fact(int n) {
    int r = 1;
    for (int i = 2; i <= n; i++)
      r *= i;
    return r;
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

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

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}