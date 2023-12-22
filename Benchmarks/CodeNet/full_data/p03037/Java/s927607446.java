
import java.util.*;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();// card
    int M = sc.nextInt();// gate
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < M; i++) {
      int begin = sc.nextInt();
      int end = sc.nextInt();
      for (int j = begin; j <= end; j++) {
        map.computeIfPresent(j, (k, v) -> v + 1);
        map.putIfAbsent(j, 1);
      }
    }

    int ans = 0;
    for (Entry<Integer, Integer> e : map.entrySet()) {
      ans = (e.getValue() == M) ? ans + 1 : ans;
    }

    System.out.println(ans);
  }
}
