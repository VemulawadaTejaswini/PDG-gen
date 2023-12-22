import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    k++;
    int[] kk = new int[40];
    long[] c = new long[40];
    for(int i = 0; i < 40; i++) {
      if(k % 2 == 1) kk[i] = 1;
      k /= 2;
    }
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      for(int j = 0; j < 40; j++) {
        if(a % 2 == 1) c[j]++;
        a /= 2;
      }      
    }
    long ans = 0;
    for(int i = 0; i < 40; i++) {
      long t = 0;
      if(kk[i] == 1) {
        for(int j = 0; j < 40; j++) {
          if(j < i) {
            if(kk[j] == 0) {
              t += ((long)Math.pow(2, j) * c[j]);
            } else {
              t += ((long)Math.pow(2, j) * ((long)n - c[j]));
            }
          } else if(j == i) {
            t += ((long)Math.pow(2, j) * c[j]);
          } else {
            t += (long)Math.max((long)Math.pow(2, j) * c[j], (long)Math.pow(2, j) * ((long)n - c[j]));
          }
        }
      }
      ans = Math.max(ans, t);
    }
    System.out.println(ans);
  }
}