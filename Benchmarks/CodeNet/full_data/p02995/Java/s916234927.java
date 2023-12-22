import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextInt();
      long d = sc.nextInt();
      long lcm = lcm(c, d);
      long cnt1 = (a - 1) - (a - 1) / c - (a - 1) / d + (a - 1) / lcm;
      long cnt2 = b - b / c - b / d + b / lcm;

      System.out.println(cnt2 - cnt1);
  }

  private static long gcd(long a, long b) {
    if(b == 0)
      return a;
    return gcd(b, a % b);
  }

  private static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }
}