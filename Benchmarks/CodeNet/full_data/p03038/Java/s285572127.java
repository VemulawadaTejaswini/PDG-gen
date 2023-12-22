import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static void solve(int n, int m, long[] a, int[] b, long[] c) {
    Map<Long, Integer> counter = new HashMap<>();
    for (long val : a) {
      counter.merge(val, 1, Integer::sum);
    }
    for (int i = 0; i < m; i++) {
      counter.merge(c[i], b[i], Integer::sum);
    }
    Long[] vals = new Long[counter.size()];
    counter.keySet().toArray(vals);
    Arrays.sort(vals, Collections.reverseOrder());
    long s = 0;
    int count = 0;
    for (long val : vals) {
      long nums = (long) counter.get(val);
      if (count + nums <= n) {
        s += val * nums;
        count += nums;
      } else {
        s += val * (n - count);
        count = n;
      }
      if (count == n) {
        break;
      }
    }
    System.out.println(s);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    long[] a = Stream.of(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    int [] b = new int[m];
    long[] c = new long[m];
    for (int i = 0; i < m; i++) {
      String[] bc = sc.nextLine().split(" ");
      b[i] = Integer.parseInt(bc[0]);
      c[i] = Long.parseLong(bc[1]);
    }
    solve(n, m, a, b, c);
    sc.close();
  }
}