import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int[] c = new int[m];
    int[] d = new int[m];

    for (int i = 0; i < m; i++) {
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      long gap = 100000000;
      int ans = m+1;
      for (int j = 0; j < m; j++) {
        int now = Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j]);
        // System.out.println(i+" "+now);
        if (gap > now) {
          gap = Math.min(gap,now);
          ans = j+1;
          // System.out.println("gap "+gap+" ans "+ans);
        }
      }
      System.out.println(ans);
    }


  }

}
