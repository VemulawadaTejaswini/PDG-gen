import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int d = sc.nextInt();
    int n = h * w;
    long[] sum = new long[n + 1];
    long[] x = new long[n + 1];
    long[] y = new long[n + 1];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int a = sc.nextInt();
        x[a] = i;
        y[a] = j;
      }
    }
    for(int i = 1; i <= n; i++) {
      if(i > d) {
        sum[i] = (sum[i - d] + Math.abs(x[i] - x[i - d]) + Math.abs(y[i] - y[i - d]));
      }
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(sum[r] - sum[l]);
    }
  }
}