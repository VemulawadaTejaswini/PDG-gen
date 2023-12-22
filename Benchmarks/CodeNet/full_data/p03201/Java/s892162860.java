import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        int tmp = map.get(num);
        map.put(num, tmp + 1);
      }
    }
    int ans = 0;
    for (int i = 524288; i > 1; i /= 2) {
      for (int j = 1; j <= i / 2; j++) {
        if (map.containsKey(j) && map.containsKey(i - j)) {
          if (map.get(j) > 0 && map.get(i - j) > 0) {
            if (j == i - j && map.get(j) >= 2) {
              int tmp = map.get(j);
              map.put(j, tmp - 2);
              ans++;
            } else if (j != i - j) {
              int tmp1 = map.get(j);
              int tmp2 = map.get(i - j);
              map.put(j, tmp1 - 1);
              map.put(i - j, tmp2 - 1);
              ans++;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}
