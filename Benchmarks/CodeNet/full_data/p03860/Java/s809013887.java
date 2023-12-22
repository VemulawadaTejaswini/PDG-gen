import java.io.*;
import java.util.*;
 
public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;
 
  private static PrintWriter _err = new PrintWriter(System.err);
 
  private void solve(Scanner sc, PrintWriter out) {
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
 
    out.println("" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();
 
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();
 
    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}