import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans = 0;
    for(long i = 1; i * i <= n; i++) {
      if((n % i) == 0) {
        long x = i;
        long m = (n / i) - 1;
        if(x < m) ans += m;
        x = (n / i);
        m = i - 1;
        if(x < m) ans += m;
      }
    }
    System.out.println(ans);
  }
}