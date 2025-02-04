import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = new long[a + 1];
    long[] t = new long[b + 1];
    for(int i = 0; i < a; i++) {
      s[i] = sc.nextLong();
    }
    s[a] = Long.MAX_VALUE;
    for(int i = 0; i < b; i++) {
      t[i] = sc.nextLong();
    }
    t[b] = Long.MAX_VALUE;
    for(int i = 0; i < q; i++) {
      long x = sc.nextLong();
      long sx = -1;
      long tx = -1;
      int left = 0;
      int right = a;
      while(left < right) {
        int med = (left + right) / 2;
        if(s[med] <= x) {
          sx = med;
          right = med;
        } else {
          left = med + 1;
        }
      }
      left = 0;
      right = b;
      while(left < right) {
        int med = (left + right) / 2;
        if(t[med] <= x) {
          tx = med;
          right = med;
        } else {
          left = med + 1;
        }        
      }
      long ans = 0;
      if(sx == -1) {
        if(tx == -1) {
          ans = Math.max(s[0] - x, t[0] - x);
        } else {
          ans = Math.max(s[0] - x, x - t[tx]);
          if((tx + 1) < b) ans = Math.min(ans, Math.max(s[0] - x, t[tx + 1] - x));
        }
      } else {
        if(tx == -1) {
          ans = Math.max(t[0] - x, x - s[sx]);
          if((sx + 1) < a) ans = Math.min(ans, Math.max(t[0] - x, s[sx + 1] - x));
        } else {
          ans = Math.max(x - s[sx], x - t[tx]);
          ans = Math.min(ans, Math.max(x - s[sx], t[tx + 1] - x));
          ans = Math.min(ans, Math.max(s[sx + 1] - x, x - t[tx]));
          ans = Math.min(ans, Math.max(s[sx + 1] - x, t[tx + 1] - x));
        }        
      }
      System.out.println(ans);
    }
  }
}