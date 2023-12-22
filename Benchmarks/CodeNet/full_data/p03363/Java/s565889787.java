import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }


    long s[] = new long[n + 1];
    Map<Long, Long> map = new HashMap<>();
    map.put(s[0], 1L);
    for (int i = 1; i <= n; i++) {
      s[i] = s[i - 1] + a[i - 1];
      if (map.get(s[i]) == null) {
        map.put(s[i], 1L);
      } else {
        map.put(s[i], map.get(s[i]) + 1);
      }
    }

    long cnt = 0;
    for (long key : map.keySet()) {
      long val = map.get(key);
      if (val > 1) {
        cnt += val * (val - 1) / 2;
      }
    }

    System.out.println(cnt);
  }
}
