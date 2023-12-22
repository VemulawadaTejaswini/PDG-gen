
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long h = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[n];
    int k = 0;
    long ma = 0;
    long mb = Long.MAX_VALUE;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
      if(a[i] >= ma) {
        if(b[i] <= mb) {
          k = i;
          ma = a[i];
          mb = b[i];
        }
      }
    }
    ArrayList<Long> list = new ArrayList<Long>();
    for(int i = 0; i < n; i++) {
      if(b[i] > ma) list.add(b[i]);
    }
    Collections.sort(list);
    long ans = 0;
    int p = list.size() - 1;
    while(h > 0) {
      ans++;
      if(p >= 0) {
        h -= list.get(p);
        p--;
      } else {
        h -= ma;
      }
    }
    System.out.println(ans);
  }
}