import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = sc.nextLong();
    for(int i = 1; i < n; i++) {
      long a = sc.nextLong();
      ans = gcd(ans, a);
    }
    System.out.println(ans);
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}