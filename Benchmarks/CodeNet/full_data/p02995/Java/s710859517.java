
import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());

 //   System.out
 //       .println(
 //           LongStream.range(a, b + 1).filter(i -> i % c != 0 && i % d != 0).count());
 // }

    long cMulti = (b / c) - ((a - 1) / c);
    long dMulti = (b / d) - ((a - 1) / d);
    long lcm = lcm(c, d);
    System.out.println(b - a + 1 - cMulti - dMulti + b / lcm - ((a - 1) / lcm));
  }
    
  static long gcd(long a, long b) {
    
    long c = 0;
    do {
      c = a % b;
      a = b;
      b = c;
    } while (c != 0);
    return a;
  }

  static long lcm(long a, long b) {
    
    return a * b / gcd(a, b);
  }
}
