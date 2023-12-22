import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long ans = 0;
    if(n % 2 == 0) {
      for(int i = (n - 1); i >= 0; i--) {
        if(i >= (n / 2)) {
          if(i == (n / 2)) {
            ans += a[i];
          } else {
            ans += (2 * a[i]);
          }          
        } else {
          if(i == ((n / 2) - 1)) {
            ans -= a[i];
          } else {
            ans -= (2 * a[i]);
          }
        }
      }
    } else {
      long t = 0;
      for(int i = (n - 1); i >= 0; i--) {
        if(i >= (n - (n / 2))) {
          t += (2 * a[i]);          
        } else {
          if((i == (n - (n / 2) - 1)) || (i == (n - (n / 2) - 2))) {
            t -= a[i];
          } else {
            t -= (2 * a[i]);
          }
        }
      }
      ans = t;
      t = 0;
      for(int i = (n - 1); i >= 0; i--) {
        if(i >= (n - (n / 2) - 1)) {
          if((i == (n - (n / 2) - 1)) || (i == (n - (n / 2)))) {
            t += a[i];
          } else {
            t += (2 * a[i]);
          }          
        } else {
          t -= (2 * a[i]);
        }
      }
      ans = Math.max(ans, t);
    }
    System.out.println(ans);
  }
}
