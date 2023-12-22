import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    int ans = 0;
    for (Integer key : map.keySet()) {
      int value = map.get(key);
      if (value < key) {
        ans += value;
      } else if (key < value) {
        ans += value - key;
      }
    }
    System.out.println(ans);
  }
}