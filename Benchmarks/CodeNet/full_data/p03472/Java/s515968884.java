import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long h = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[n];
    long[] c = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
      c[i] = b[i];
    }
    
    Arrays.sort(c);
    long[] d = new long[n];
    d[n - 1] = c[n - 1];
    int aho = -1;
    if(d[n - 1] >= h) aho = n - 1;
    for(int i = n - 2; i >= 0; i--) {
      d[i] = d[i + 1] + c[i];
      if((aho == -1) && (d[i] >= h)) aho = i;
    }
    
    long ans = Long.MAX_VALUE;
    for(int i = 0; i < n; i++) {
      int left = 0;
      int right = n;
      int p = n - 1;
      while(left < right) {
        int med = (left + right) / 2;
        if(c[med] >= a[i]) {
          p = med;
          right = med;
        } else {
          left = med + 1;
        }
      }
      if(aho >= p) {
        ans = Math.min(ans, (long)(n - aho)); 
      } else {
        long r = d[p];
        long t = h - r;
        long mi = 0;
        if(t % a[i] == 0) {
          mi = (t / a[i]) + n - aho;
        } else {
          mi = (t / a[i]) + n - aho + 1;
        }
        ans = Math.min(ans, mi);
      }
    }
    
    System.out.println(ans);
  }
}