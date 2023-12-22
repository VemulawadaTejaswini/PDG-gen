import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    long[] h = new long[n];
    int p = 0;
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextLong();
      y[i] = sc.nextLong();
      h[i] = sc.nextLong();
      if(h[i] > 0) p = i;
    }
    long ansx = 0;
    long ansy = 0;
    long ansh = 0;
    for(long cx = 0; cx <= 100; cx++) {
      int t1 = 0;
      for(long cy = 0; cy <= 100; cy++) {
        long ch = h[p] + Math.abs(x[p] - cx) + Math.abs(y[p] - cy);
        int t2 = 0;
        for(int i = 0; i < n; i++) {
          if(Math.max((ch - Math.abs(x[i] - cx) - Math.abs(y[i] - cy)), 0) != h[i]) {
            t2 = 1;
            break;
          } 
        }
        if(t2 == 0) {
          t1 = 1;
          ansx = cx;
          ansy = cy;
          ansh = ch;
          break;
        } 
      }
      if(t1 > 0) break;
    }
    System.out.println(ansx + " " + ansy + " " + ansh);
  }
}