import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    Arrays.sort(a);
    Integer[] center = new Integer[] {a[0], a[0]};
    Deque<Integer[]> queue = new ArrayDeque<>();
    int i = 1;
    int j = n - 1;
    int turn = 1;
    while (i <= j) {
      if (turn == 1) {
        if (i == j) queue.add(new Integer[] {a[j], null});
        else queue.add(new Integer[] {a[j - 1], a[j]});
        j -= 2;
      } else {
        if (i == j) queue.add(new Integer[] {a[i], null});
        else queue.add(new Integer[] {a[i], a[i + 1]});
        i += 2;
      }
      turn = 1 - turn;
    }
    int sum = 0;
    while (!queue.isEmpty()) {
      Integer[] nums = queue.poll();
      if (nums[1] == null) {
        sum += Math.max(Math.abs(center[0] - nums[0]), Math.abs(center[1] - nums[0]));
      } else {
        sum += Math.max(
            Math.abs(center[0] - nums[0]) + Math.abs(center[1] - nums[1]),
            Math.abs(center[0] - nums[1]) + Math.abs(center[1] - nums[0]));
      }
      center = nums;
    }
    System.out.println(sum);
  }
}