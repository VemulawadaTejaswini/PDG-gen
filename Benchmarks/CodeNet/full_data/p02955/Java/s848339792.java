import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    long total = Arrays.stream(a).mapToLong(i -> i).sum();
    long[] candidates = candidates(total);
    for (int i = candidates.length - 1; i > 0; i--) {
      long candidate = candidates[i];
      long[] diffs = Arrays.stream(a)
        .mapToLong(ai -> ai % candidate)
        .filter(ai -> ai != 0)
        .sorted()
        .toArray();
      long totalDiff = Arrays.stream(diffs).sum();
      if (totalDiff == 0) {
        pw.println(candidate);
        return;
      }
      if (totalDiff % candidate != 0) {
        continue;
      }
      long left = Arrays.stream(diffs).sum();
      long right = 0;
      for (int di = diffs.length - 1; di > 0; di--) {
        long d = diffs[di];
        left -= d;
        right += candidate - d;
        if (right == left) {
          if (right <= k) {
            pw.println(candidate);
            return;
          } else {
            break;
          }
        }
        if (left < right) {
          break;
        }
      }
    }
  }

  static long[] candidates(long total) {
    return LongStream.rangeClosed(1, total)
      .filter(i -> total % i == 0)
      .toArray();
  }
}
