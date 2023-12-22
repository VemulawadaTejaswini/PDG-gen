import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[sc.nextInt()]++;
    }
    long ans = 0;
    int pp = 0;
    long MOD = (long)Math.pow(10, 9) + 7;
    if((n % 2) == 0) {
      int p = 0;
      for(int i = 1; i <= (n - 1); i += 2) {
        if(a[i] != 2) p++;
      }
      if(p == 0) pp = 1;
    } else {
      int p = 0;
      if(a[0] != 1) p++;
      for(int i = 2; i <= (n - 1); i += 2) {
        if(a[i] != 2) p++;
      }
      if(p == 0) pp = 1;
    }
    if(pp == 1) {
      ans = 1;
      for(int i = 0; i < (n / 2); i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}