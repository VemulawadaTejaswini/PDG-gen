import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      sum += a[i];
    }
    long t = ((long)n * (long)(n + 1)) / 2;
    String ans = "NO";
    if((sum % t) == 0) {
      long k = sum / t;
      int p = 0;
      for(int i = 0; i < n; i++) {
        long c = a[i] - k;
        if(!((c <= 0) && ((c % (long)n) == 0))) p++;
      }
      if(p == 0) ans = "YES";
    }
    System.out.println(ans);
  }
}
