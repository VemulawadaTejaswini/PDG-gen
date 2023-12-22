import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    for(int i = 0; i < n; i++) {
      long x = sc.nextLong();
      long y = sc.nextLong();
      map.put(x, y);
    }
    ArrayList<Long> list = new ArrayList<Long>();
    for(long key : map.keySet()) {
      list.add(key);
    }
    Collections.sort(list);
    long ans = Long.MAX_VALUE;
    for(int i = 0; i < n - k + 1; i++) {
      long xmin = list.get(i);
      long xmax = list.get(i + k - 1);
      long ymin = map.get(xmin);
      long ymax = map.get(xmin);
      for(int j = 1; j < k; j++) {
        long x = list.get(i + j);
        ymin = Math.min(ymin, map.get(x));
        ymax = Math.max(ymax, map.get(x));
      }
      long t = (xmax - xmin) * (ymax - ymin);
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}
