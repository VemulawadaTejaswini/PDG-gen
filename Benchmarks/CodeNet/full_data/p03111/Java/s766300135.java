
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < (int)Math.pow(4, n); i++) {
      int ta = 0;
      int tb = 0;
      int tc = 0;
      int na = 0;
      int nb = 0;
      int nc = 0;
      int s = i;
      for(int j = 0; j < n; j++) {
        int d = s % 4;
        s /= 4;
        if(d == 1) {
          ta += l[j];
          na++;
        }
        if(d == 2) {
          tb += l[j];
          nb++;
        }
        if(d == 3) {
          tc += l[j];
          nc++;
        }
      }
      if((ta > 0) && (tb > 0) && (tc > 0)) {
        int t = Math.abs(a - ta) + Math.abs(b - tb) + Math.abs(c - tc) + 10 * (na - 1) + 10 * (nb - 1) + 10 * (nc - 1);
        ans = Math.min(ans, t);
      }
    }
    System.out.println(ans);
  }
}
