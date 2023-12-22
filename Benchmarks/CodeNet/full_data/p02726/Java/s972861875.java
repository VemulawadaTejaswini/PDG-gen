import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    long[][] a = new long[(int)(n + 1)][(int)(n + 1)];
    for(int i = 1; i <= n; i++) {
      for(int j = i + 1; j <= n; j++) {
        a[i][j] = Math.min(Math.abs(i - j), Math.abs(i - x) + Math.abs(j - y) + 1);
        a[i][j] = Math.min(a[i][j], Math.abs(i - y) + Math.abs(j - x) + 1); 
      }
    }
    long[] ans = new long[(int)n];
    for(int i = 1; i <= n; i++) {
      for(int j = i + 1; j <= n; j++) {
        ans[a[i][j]]++;
      }
    }
    for(int i = 1; i < n; i++) {
      System.out.println(ans[i]);
    }
  }
}
