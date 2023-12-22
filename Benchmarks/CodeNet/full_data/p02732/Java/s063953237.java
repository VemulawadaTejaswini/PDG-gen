import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    HashMap<Integer, Long> map = new HashMap<Integer, Long>();
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if(map.containsKey(a[i])) {
        map.put(a[i], map.get(a[i]) + (long)1);
      } else {
        map.put(a[i], (long)1);
      }
    }
    long t = 0;
    for(int key : map.keySet()) {
      long c = map.get(key);
      t += ((c * (c - 1)) / 2);
    }
    for(int i = 0; i < n; i++) {
      long t1 = map.get(a[i]) - 1;
      System.out.println(t - t1);
    }
  }
}