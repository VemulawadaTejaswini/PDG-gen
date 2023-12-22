import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int k = sc.nextInt();
    PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) return o1.length() - o2.length();
        long l1 = Long.parseLong(o1);
        long l2 = Long.parseLong(o2);
        if (l1 < l2) return -1;
        if (l1 > l2) return 1;
        return 0;
      }
    });
    for (int i = 0; i < 10; i++) {
      pq.add(String.valueOf(i));
    }
    while (true) {
      String val = pq.poll();
      int leftDigit = Integer.parseInt(String.valueOf(val.charAt(0)));
      if (leftDigit != 0) k--;
      if (k == 0) {
        System.out.println(val);
        return;
      }
      pq.add(leftDigit + val);
      if (leftDigit != 0) {
        pq.add(String.valueOf(leftDigit - 1) + val);
      }
      if (leftDigit != 9) {
        pq.add(String.valueOf(leftDigit + 1) + val);
      }
    }
  }
}