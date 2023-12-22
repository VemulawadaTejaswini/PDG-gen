import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private void solve(Scanner sc, PrintWriter out) {
    int n = sc.nextInt();
    int k = sc.nextInt();

    // めんどくさい
    int cnt = 0;
    for (int i = 1; i <= n - 2; ++i) {
      for (int j = 1; j <= 7 - 2; ++j) {
if (debug) {
  System.err.println("(" + i + ", " + j + ") " + (i * i + 9 * j + 9) + " => " + ((i * i + 9 * j + 9) % 11));
}
        if ((8 * i + 9 * j + 9) % 11 == k) {
          ++cnt;
        }
      }
    }
    out.println(cnt);
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
      System.err.println((G - S) + "ms");
    }
  }
}