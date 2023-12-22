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
    String s = in.next();
    String t = in.next();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(s.charAt(i));
      sb.append(t.charAt(i));
    }

    out.println(sb.toString());

    out.close();
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

  public static int[][] mergeSort(int[][] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    int[][] left = new int[mid][2];
    int[][] right = new int[a.length - mid][2];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];

    for (int i = mid; i < a.length; ++i)
      right[i - mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static int[][] merge (int[][] l, int[][] r) {
    int[][] merged = new int[l.length + r.length][2];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i][1] < r[j][1] || l[i][1] == r[j][1] && l[i][0] <= r[j][0])
        merged[k++] = l[i++];
      else
        merged[k++] = r[j++];
    }

    while (i < l.length)
      merged[k++] = l[i++];
    while (j < r.length)
      merged[k++] = r[j++];

    return merged;
  }
}

