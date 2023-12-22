import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong() - (long)(i + 1);
      sum += a[i];
    }
    long t = sum / n;
    long ans = Long.MAX_VALUE;
    long s1 = 0;
    long s2 = 0;
    long s3 = 0;
    for(int i = 0; i < n; i++) {
      s1 += Math.abs(a[i] - t);
    }
    ans = Math.min(ans, s1);
    for(int i = 0; i < n; i++) {
      s2 += Math.abs(a[i] - t - 1);
    }
    ans = Math.min(ans, s2);
    for(int i = 0; i < n; i++) {
      s3 += Math.abs(a[i] - t + 1);
    }
    ans = Math.min(ans, s3);
    System.out.println(ans);
  }
}