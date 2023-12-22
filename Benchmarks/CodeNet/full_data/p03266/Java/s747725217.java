import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long ans = 0;
    for(int a = 1; a <= n; a++) {
      if(((2 * a) % k) == 0) {
        int c = (int)Math.ceil((double)(a + 1) / (double)k);
        int d = (n + a) / k;
        int e = d - c + 1;
        ans += ((long)e * (long)e);
      }
    }
    System.out.println(ans);
  }
}