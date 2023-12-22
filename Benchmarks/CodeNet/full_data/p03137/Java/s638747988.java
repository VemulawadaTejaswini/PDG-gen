import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = in.nextInt();
    int m = in.nextInt();

    int[] x = new int[m];

    for (int i = 0; i < m; i++)
      x[i] = in.nextInt();

    x = mergeSort(x);

    int res = x[m - 1] - x[0];

    int[] diffs = new int[m - 1];

    for (int i = 0; i < m - 1; i++)
      diffs[i] = x[i + 1] - x[i];

    diffs = mergeSort(diffs);

    int i = m - 2;
    while (n-- > 1 && i >= 0) {
      res -= diffs[i];
      i--;
    }

    out.println(res);

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

  static void print(int[] arr) {
    Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    System.out.println();
  }

  public static int[] mergeSort(int[] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];

    for (int i = mid; i < a.length; ++i)
      right[i - mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static int[] merge(int[] l, int[] r) {
    int[] merged = new int[l.length + r.length];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i] <= r[j])
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