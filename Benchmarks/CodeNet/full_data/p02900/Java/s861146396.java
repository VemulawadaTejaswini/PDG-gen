import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long min = gcd(a, b);

    List<Long> ky = new ArrayList<>();

    for (long i = 1; i <= min; i++) {
      if (a % i == 0 && b % i == 0) {
        boolean issosu = sosu(i);
        if (issosu) {
          ky.add(i);
        }
      }
    }

    System.out.println(ky.size());
    
  }

  private static boolean sosu(long m) {
    if (m == 0) return false;
    if (m <= 2) return true;
    for (long i = 2; i < m; i++) {
      if (m % i == 0) return false;
    }
    return true;
  }
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }
}