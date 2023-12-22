import java.util.*;
import java.math.*;
 
public class Main {
  long res;
  static long k;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    k = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; ++i) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long INF = (long)(1e18) + 1;
    long l = -INF;
    long r = INF;
    while(l < r) {
      long mid = (l + r)/2;
      if(bs(a, mid)) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }
    System.out.println(l - 1);
  }
  private static boolean bs(long[] a, long mid) {
    long tot = 0;
    for(int i = 0; i < a.length; ++i) {
      long now = a[i];
      int l = 0;
      int r = a.length;
      if(now >= 0) {
        while(l < r) {
          int c = l + (r - l)/2;
          if(now * a[c] < mid) {
            l = c + 1;
          } else{
            r = c;
          }
        }
        tot += l;
      } else {
        while(l < r) {
          int c = l + (r - l)/2;
          if(now * a[c] >= mid) {
            l = c + 1;
          } else {
            r = c;
          }
        }
        tot += a.length - r;
      }
      if((long) a[i] * a[i] < mid) tot--;
      //res = now * a[r];
    }
    return tot/2 < k;
  }
}
    
