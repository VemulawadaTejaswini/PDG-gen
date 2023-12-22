import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextLong();
      y[i] = sc.nextLong();
    }
    int ans = 100;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i != j) {
          long p = x[i] - x[j];
          long q = y[i] - y[j];
          int t = 0;
          for(int k = 0; k < n; k++) {
            for(int l = 0; l < n; l++) {
              if((p == (x[k] - x[l])) && (q == (y[k] - y[l]))) t++;
            }
          }
          ans = Math.min(ans, n - t);
        }
      }
    }
    System.out.println(ans);
  }
}