import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    int n = sc.nextInt();
    int[] c = new int[n];
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      c[a]++;
    }
    int p = 0;
    for(int i = 0; i < n; i++) {
      if(((n - 1) - i) % 2 == 0) {
        if(n % 2 == 0) {
          if(c[i] != 2) p++;
        } else {
          if((i == (n / 2)) && (c[i] != 1)) p++;
          if((i != (n / 2)) && (c[i] != 2)) p++; 
        }
      } else {
        if(c[i] > 0) p++;
      }
    }
    long ans = 0;
    if(p == 0) {
      ans = 1;
      for(int i = 0; i < n / 2; i++) {
        ans = (ans * 2) % MOD;
      }
    }
    System.out.println(ans);
  }
}