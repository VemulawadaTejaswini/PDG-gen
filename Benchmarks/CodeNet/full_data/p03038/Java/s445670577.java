import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static void solve(int n, int m, long[] a, int[] b, long[] c) {
    Map<Long, Integer> counter1 = new HashMap<>();
    Map<Long, Integer> counter2 = new HashMap<>();
    for (long val : a) {
      counter1.merge(val, 1, Integer::sum);
    }
    for (int i = 0; i < m; i++) {
      counter2.merge(c[i], b[i], Integer::sum);
    }
    Long[] vals1 = new Long[counter1.size()];
    counter1.keySet().toArray(vals1);
    Arrays.sort(vals1, Collections.reverseOrder());
    Long[] vals2 = new Long[counter2.size()];
    counter2.keySet().toArray(vals2);
    Arrays.sort(vals2, Collections.reverseOrder());
    long s = 0;
    int count = 0;
    int i1 = 0;
    int i2 = 0;
    while (count < n) {
      long val = 0;
      int nums = 0;
      if (i1 < vals1.length && i2 < vals2.length) {
        if (vals1[i1] > vals2[i2]) {
          val = vals1[i1];
          nums = counter1.get(vals1[i1]);
          i1++;
        } else {
          val = vals2[i2];
          nums = counter2.get(vals2[i2]);
          i2++;
        }
      } else if (i1 < vals1.length) {
        val = vals1[i1];
        nums = counter1.get(vals1[i1]);
        i1++;
      } else {
        val = vals2[i2];
        nums = counter2.get(vals2[i2]);
        i2++;
      }
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
