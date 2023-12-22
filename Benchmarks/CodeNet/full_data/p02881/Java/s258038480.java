import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    double sqrt = Math.sqrt(n);
    long min = n - 1;
    for (long i = 1; i <= sqrt; i++) {
      if (n % i != 0) {
        continue;
      }
      long x = i - 1;
      long y = (n / i) - 1;
      if (x + y < min) {
        min = x + y;
      }
    }
    System.out.println(min);
  }
}