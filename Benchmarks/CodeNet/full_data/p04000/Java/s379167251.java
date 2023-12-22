import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      for(int j = 0; j < 3; j++) {
        for(int k = 0; k < 3; k++) {
          long s = a - j;
          long t = b - k;
          if((s > 0) && (t > 0)) {
            if(((s + 2) <= h) && ((t + 2) <= w)) {
              long p = (s - 1) * w + t;
              if(map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
              } else {
                map.put(p, 1);
              }
            }
          }
        }
      }
    }
    long[] ans = new long[10];
    for(long key : map.keySet()) {
      ans[map.get(key)]++;
    }
    for(int i = 0; i < 10; i++) {
      System.out.println(ans[i]);
    }
  }
}