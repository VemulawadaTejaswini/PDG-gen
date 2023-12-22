import java.util.*;
import java.util.stream.*;

public class Main {
  static long sum;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int K = in.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }
    Map<Integer, Integer> map = createMap(A);
    Arrays.sort(A);
    int zeroCnt = 0, t = K;
    while (zeroCnt < A.length && A[zeroCnt] < t) {
      t -= A[zeroCnt++];
    }
    int rest = N - zeroCnt;
    if (rest == 1 || rest == 0) {
      System.out.println(sum);
    } else {
      long minValue = A[zeroCnt];
      Integer[] keys = map.keySet().toArray(new Integer[map.keySet().size()]);
      Arrays.sort(keys);
      // System.out.println(Arrays.toString(keys));
      int idx = 0;
      while (idx < keys.length && keys[idx] < rest) {
        idx++;
      }
      if (idx == keys.length) {
        System.out.println(keys[idx - 1] * map.get(keys[idx - 1]));
        return;

      }
      if (map.get(keys[idx]) == 1) {
        idx++;
      } else {
        map.put(keys[idx], map.get(keys[idx]) - 1);
      }
      // System.out.println(idx);
      int ans = 1;
      for (int i = keys.length - 1; i >= idx; i--) {
        // System.out.println(keys[i] + " " + map.get(keys[i]));
        if (ans * keys[i] * map.get(keys[i]) - minValue > t) {
          continue;
        }
        ans *= keys[i] * map.get(keys[i]);
      }
      System.out.println(ans);
    }
  }

  static Map<Integer, Integer> createMap(long[] A) {
    long tmp = sum = LongStream.of(A).sum();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 2; i <= (int) (sum / 2); i++) {
      int cnt = 0;
      while (tmp % i == 0) {
        cnt++;
        tmp /= i;
      }
      if (cnt != 0) {
        map.put(i, cnt);
      }
    }
    return map;
  }
}
