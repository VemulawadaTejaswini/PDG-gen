import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long[] rui = new long[n];
    rui[0] = a[0];
    for(int i = 1; i < n; i++) {
      rui[i] = (rui[i - 1] + a[i]);
    }
    int[] l = new int[n];
    int[] r = new int[n];
    int p = 0;
    for(int i = 1; i < n - 2; i++) {
      int t = p;
      int m = 0;
      for(int j = p; j < i; j++) {
        long s1 = rui[j];
        long s2 = rui[i] - rui[j];
        if(s1 >= s2) {
          t = j;
          if(j == p) m = 1;
          break;
        }
      }
      if(t == p) {
        if(m == 0) {
          l[i] = (i - 1);
          p = (i - 1);
        }
        if(m == 1) {
          l[i] = p;
        }
      } else {
        if(Math.abs(rui[i] - rui[t] - rui[t]) >= Math.abs(rui[i] - rui[t - 1] - rui[t - 1])) {
          l[i] = (t - 1);
          p = (t - 1);
        } else {
          l[i] = t;
          p = t;
        }
      }
    }
    p = 2;
    for(int i = 1; i < n - 2; i++) {
      int t = p;
      int m = 0;
      for(int j = p; j <= n - 2; j++) {
        long s1 = rui[j] - rui[i];
        long s2 = rui[n - 1] - rui[j];
        if(s1 >= s2) {
          t = j;
          if(j == p) m = 1;
          break;
        }
      }
      if(t == p) {
        if(m == 0) {
          r[i] = n - 2;
          p = (n - 2);
        }
        if(m == 1) {
          r[i] = p;
        }
      } else {
        if(Math.abs(rui[n - 1] - rui[t] - rui[t] + rui[i]) >= Math.abs(rui[n - 1] - rui[t - 1] - rui[t - 1] + rui[i])) {
          r[i] = (t - 1);
          p = (t - 1);
        } else {
          r[i] = t;
          p = t;
        }
      }
    }
    long ans = Long.MAX_VALUE;
    for(int i = 1; i < n - 2; i++) {
      long s1 = rui[l[i]];
      long s2 = rui[i] - rui[l[i]];
      long s3 = rui[r[i]] - rui[i];
      long s4 = rui[n - 1] - rui[r[i]];
      long ma = Math.max(s1, s2);
      ma = Math.max(ma, s3);
      ma = Math.max(ma, s4);
      long mi = Math.min(s1, s2);
      mi = Math.min(mi, s3);
      mi = Math.min(mi, s4);
      ans = Math.min(ans, ma - mi);
    }
    System.out.println(ans);
  }
}
