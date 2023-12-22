import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long ans = 0;
    for(int i = 1; i < n; i++) {
      if(a[i - 1] <= x) {
        ans += Math.max(0, (a[i - 1] + a[i] - x));
        a[i] -= Math.max(0, (a[i - 1] + a[i] - x));
      } else {
        ans += Math.max(0, (a[i - 1] + a[i] - x));
        a[i] = 0;
      }
    }
    System.out.println(ans);
  }