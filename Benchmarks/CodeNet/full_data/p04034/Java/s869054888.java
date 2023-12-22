import java.io.*;
import java.util.*;

public class Main {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int n = in.nextInt(), m = in.nextInt();
    boolean[] havered = new boolean[n];
    int[] count = new int[n];
    Arrays.fill(count, 1);
    havered[0] = true;
    for (int i = 0; i < m; i++) {
      int a = in.nextInt()-1, b = in.nextInt()-1;
      havered[b] |= havered[a];
      count[b] += 1;
      count[a] -= 1;
      if (havered[a] && count[a] == 0) {
        havered[a] = false;
      }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) if (havered[i]) ans++;
    out.println(ans);
    out.close();
    System.exit(0);
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
  }


}
