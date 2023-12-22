import java.io.*;
import java.util.StringTokenizer;


public class Main {


  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int index = 1;
    double val = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    double[] res = new double[n];
    for (int i = 0; i < n; i++) {
      res[i] = (t - arr[i] * 0.006);
    }
    val = Math.abs(res[0] - a);
    for (int i = 1; i < n; i++) {
      if (val > Math.abs(res[i] - a)) {
        val = Math.abs(res[i] - a);
        index = i + 1;
      }
    }
    out.println(index);

  }


  public static void main(String[] args) throws FileNotFoundException {
    new Main().run();
  }

  private void run() throws FileNotFoundException {

    //new FileInputStream(new File("input.txt"))
    //
    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    String next() {
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

    @Override
    public void close() {
    }
  }

}
