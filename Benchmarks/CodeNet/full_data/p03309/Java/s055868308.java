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
    Arrays.sort(a);
    long t1 = a[n / 2];
    long t2 = 0; 
long t3 = 0; 
    if(((n / 2) + 1) < n) t2 = a[(n / 2) + 1];
    if(((n / 2) - 1) >= 0) t3 = a[(n / 2) - 1];
    long s1 = 0;
    long s2 = 0;
    long s3 = 0;
    for(int i = 0; i < n; i++) {
      s1 += Math.abs(a[i] - t1);
    }
    ans = Math.min(ans, s1);
    for(int i = 0; i < n; i++) {
      s2 += Math.abs(a[i] - t2);
    }
    ans = Math.min(ans, s2);
    for(int i = 0; i < n; i++) {
      s3 += Math.abs(a[i] - t3);
    }
    ans = Math.min(ans, s3);
    System.out.println(ans);
  }
}