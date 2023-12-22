import java.util.*;

/**
 * Main
 */
public class Main {
  Scanner sc;

  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    this.sc = new Scanner(System.in);
    long n = sc.nextLong();
    long sq = (long) (Math.floor(Math.sqrt(n)));
    long one = sq;
    long pair = -1;
    for (; one > 0; one--) {
      if (n % one == 0) {
        pair = n / one;
        break;
      }
    }
    System.out.println(one + pair - 2);
  }
}