import java.io.*;
import java.util.*;

public class Main {
  static private InputReader in;
  static private PrintWriter out;

  public static void main(String[] args) {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Task solver = new Task();
    solver.solve();
    out.close();
  }

  static class Task {
    public void solve() {
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      out.println(Math.min(b / a, c));
    }
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