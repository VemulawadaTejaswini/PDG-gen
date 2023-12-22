import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    long sum = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      sum = (sum + a) % m;
      if(map.containsKey(sum)) {
        map.put(sum, map.get(sum) + 1);
      } else {
        map.put(sum, 1);
      }
    }
    long ans = 0;
    if(map.containsKey(0)) ans = map.get(0);
    for(long key : map.keySet) {
      ans += ((map.get(key) * (map.get(key) - 1)) / 2);
    }
    System.out.println(ans);
  }
}