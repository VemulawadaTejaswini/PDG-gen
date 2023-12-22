import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] c = new int[n];
    long MOD = (long)Math.pow(10, 9) + 7;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      c[a]++;
    }
    long ans = 0;
    int p = 0;
    for(int i = n - 1; i > 0; i -= 2) {
      if(c[i] != 2) p++;
    }
    if(((n % 2) == 1) && (c[0] != 1)) p++;
    if(p == 0) {
      ans = 1;
      for(int i = 0; i < (n / 2); i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}