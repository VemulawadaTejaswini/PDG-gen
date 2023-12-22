import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if(map.containsKey(a)) {
        map.put(a, map.get(a) + 1);
      } else {
        map.put(a, 1);
      }
    }
    ArrayList<Long> list = new ArrayList<Long>();
    long ans = 0;
    for(long key : map.keySet()) {
      int t = map.get(key);
      while(t > 1) {
        list.add(key);
        t -= 2;
      }
    }
    Collections.sort(list);
    if(list.size() > 1) {
      ans = (list.get(list.size() - 1)) * (list.get(list.size() - 2));
    }
    System.out.println(ans);
  }
}