import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long[] c = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
    }
    for(int i = 0; i < n; i++) {
      c[i] = sc.nextLong();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    //a[i]より大きい最小のb[j]のj
    long[] bigb = new long[n];
    //b[i]より大きい最小のc[j]のj
    long[] bigc = new long[n];
    long ind = 0;
    for(int i = 0; i < n; i++) {
      for(int j = (int)ind; j < n; j++) {
        if(a[i] < b[j]) {
          bigb[i] = j;
          ind = j;
          break;
        } else {
          if(j == n - 1) {
            bigb[i] = n;
            ind = n - 1;
          }
        }
      }
    }
    long ind2 = 0;
    for(int i = 0; i < n; i++) {
      for(int j = (int)ind2; j < n; j++) {
        if(b[i] < c[j]) {
          bigc[i] = j;
          ind2 = j;
          break;
        } else {
          if(j == n - 1) {
            bigc[i] = n;
            ind2 = n - 1;
          }
        }
      }
    }
    long[] sum = new long[n];
    sum[n - 1] = n - bigc[n - 1];
    for(int i = n - 2; i >= 0; i--) {
      sum[i] = sum[i + 1] + (n - bigc[i]);
    }
    long ans = 0;
    for(int i = 0; i < n; i++) {
      if(bigb[i] < n) ans += sum[(int)bigb[i]];
    }
    System.out.println(ans);
  }
}