import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      int d = sc.nextInt();
      a[i] = d;
    }
    Arrays.sort(a);
    for(int i = 0; i < n; i++) {
      b[i] = 24 - a[i];
    }
    int ans = a[0];
    for(int k = a[0]; k >= 0; k--) {
      int flg = 0;
      int m1 = a[0];
      int m2 = 24;
      int pre = a[0];
      for(int i = 1; i < n; i++) {
        if(pre <= 12) {
          if(((a[i] - m1) >= k) && ((m2 - a[i]) >= k)) {
            pre = a[i];
            m1 = a[i]; 
          } else {
            if(((b[i] - m1) >= k) && ((m2 - b[i]) >= k)) {
              pre = b[i];
              m2 = b[i]; 
            } else {
              flg = 1;
              break;
            }
          }
        } else {
          if(((b[i] - m1) >= k) && ((m2 - b[i]) >= k)) {
            pre = b[i];
            m2 = b[i]; 
          } else {
            if(((a[i] - m1) >= k) && ((m2 - a[i]) >= k)) {
              pre = a[i];
              m1 = a[i]; 
            } else {
              flg = 1;
              break;
            }
          }
        }
      }
      if(flg == 0) {
        ans = k;
        break;
      }
    }
    System.out.println(ans);
  }
}