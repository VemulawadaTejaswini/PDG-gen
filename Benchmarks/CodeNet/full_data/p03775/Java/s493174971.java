import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    int min = Integer.MAX_VALUE;
    for (int i = 1; (long)i*i <= N; i++) {
      if (N%i == 0) {
        min = Math.min(min, F(i, N/i));
      }
    }

    System.out.println(min);
  }
  
  private static int F(long a, long b) {
    return Math.max(digit(a), digit(b));
  }
  
  private static int digit(long n) {
    int ret = 0;
    while (n != 0) {
      n /= 10;
      ret++;
    }
    return ret;
  }
}