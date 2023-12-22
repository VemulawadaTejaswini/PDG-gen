import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    long n = sc.nextLong();
    long r1 = ((m & 1) == 0 ? 0 : 1) + m / 2;
    long r2 = ((n & 1) == 0 ? 0 : 1) + n / 2;
    System.out.println(r1 * r2 + (m / 2) * (n / 2));
  }
}