import java.util.*;
import java.math.*;

public class Main {

  // // 最大公約数
  // public static long gcd (long m,long n) {
  //   if (m < n) return gcd(n,m);
  //   if (n == 0) return m;
  //   return gcd(n,m%n);
  // }
  //
  // // 最小公倍数
  // public static long lcm (long m,long n) {
  //   return m*n/gcd(m,n);
  // }
  //
  // // 素数判定
  // public static boolean isPrime (long n) {
  //   if (n == 2) return true;
  //   if (n < 2 || n%2 == 0) return false;
  //   double d = Math.sqrt(n);
  //   for (int i = 3; i <= d; i+=2) {
  //     if (n%i == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '7') {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");

  }

}
