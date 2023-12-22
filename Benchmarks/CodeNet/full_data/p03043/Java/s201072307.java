import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    int[] t = new int[(int)n];
    int m = 0;
    for(long i = 0; i < n; i++) {
      int p = 0;
      long s = i + 1;
      for(int j = 0; j < 30; j++) {
        if(s >= k) break;
        s *= 2;
        p++;
      }
      t[(int)i] = p;
      m = Math.max(m, p);
    }
    long q1 = n * (long)Math.pow(2, m);
    long q2 = 0;
    for(int i = 0; i < n; i++) {
      q2 += ((long)Math.pow(2, m - t[i]));
    }
    double ans = (double)q2 / (double)q1;
    System.out.println(ans);
  }
}