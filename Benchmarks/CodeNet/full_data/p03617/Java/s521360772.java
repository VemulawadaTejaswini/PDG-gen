import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long q = sc.nextLong();
    long h = sc.nextLong();
    long s = sc.nextLong();
    long d = sc.nextLong();
    long n = sc.nextLong();
    long one = Math.min(4 * q, 2 * h);
    one  = Math.min(one, s);
    long two = Math.min(2 * one, d);
    long ans = two * (n / 2) + one * (n - (n / 2) * 2);
    System.out.println(ans);
  }
}